package Projekt;

import java.io.*;

public class EchoServer {
    
    public static void main(String[] args){
        SRV s = new SRV();
        s.start();
        s.catchClient();
        new Thread(() -> {
            while (true) {
                String txt = null;
                txt = s.in.nextLine();
                if (txt != null) {
                    try {
                        s.sendMessage(txt);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        
        new Thread(() -> {
            try {
                s.writeToConsole();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}