package Projekt;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class Phonebook {
    
    private Map<Integer, String> phonebook;
    
    Phonebook() {
        phonebook = new HashMap<>();
    }
    
    public void add(int number, String surname) {
        phonebook.put(number, surname);
    }
    
    public void get(String surname) {
        if (phonebook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> m : set) {
                if (m.getValue().equals(surname)) {
                    System.out.println(m.getValue() + " : " + m.getKey());
                }
            }
        } else {
            System.out.println("Нет такой фамилии!!!");
        }
    }
    
}
