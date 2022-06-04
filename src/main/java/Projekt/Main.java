package Projekt;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Ivan", "Auto", "Auto", "Phone", "Language", "Language", "Cup", "Guitar",
                "Guitar", "Notebook", "Wood", "Wood", "Wood", "Ice cream", "Ice cream", "Cat");
        System.out.println("Весь список");
        words.forEach(System.out::println);
        
        System.out.println("Список слов без повторов");
        Set<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);
        
        System.out.println("Подсчет слов");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : words) {
            wordCount.put(s, wordCount.getOrDefault(s, 0) + 1);
        }
        wordCount.entrySet().forEach(System.out::println);
        
        Phonebook phonebook = new Phonebook();
        phonebook.add(3456454, "Ivanov");
        phonebook.add(5646165, "Petrov");
        phonebook.add(7899911, "Ivanov");
        phonebook.add(656523, "Sidorov");
        phonebook.add(6128657, "Petrov");
        
        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
        phonebook.get("Pupkin");
        
    }
}
