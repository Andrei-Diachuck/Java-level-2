package Projekt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        Box<Orange> orangeBox = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        
        Box<Apple> appleBox = new Box<>(
                new Apple(),
                new Apple(),
                new Apple()
        );
        
        Box<GoldenApple> goldenAppleBox = new Box<>(
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple()
        );
    
        System.out.println("Вес апельсинов =  " + orangeBox.getWeight());
        System.out.println("Вес яблок = " + appleBox.getWeight());
        System.out.println("Вес вторых яблок = " + goldenAppleBox.getWeight());
        goldenAppleBox.moveTo(appleBox);
        System.out.println("Вес всех яблок = " + appleBox.getWeight());
    }
}
