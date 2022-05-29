package Projekt;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException() {
        System.out.println("Массив должен быть 4 на 4");
    }
}
