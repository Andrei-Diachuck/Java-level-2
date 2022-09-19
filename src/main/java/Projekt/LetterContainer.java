package Projekt;

import java.util.List;
import java.util.stream.IntStream;

public class LetterContainer {
    private static final char FIRST = 'A';
    private static final char LAST = 'C';
    private char letter = FIRST;
    
    public synchronized void tryPrint(char target) {
        while (letter != target) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        
        System.out.print(target);
        next();
        notifyAll();
    }
    
    private void next() {
        if (letter == LAST) {
            letter = FIRST;
        } else {
            letter++;
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        final int repeat = 10;
        
        LetterContainer container = new LetterContainer();
        List<Thread> threads = IntStream.rangeClosed(FIRST, LAST) // 65, 66, 67
                .mapToObj(it -> (char) it) // 'A', 'B', 'C'
                .map(it -> new Thread(() -> {
                    for (int j = 0; j < repeat; j++) {
                        container.tryPrint(it);
                    }
                }))
                .peek(Thread::start)
                .toList();
        for (Thread thread : threads) {
            thread.join();
        }
    }
}