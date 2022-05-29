package Projekt;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        System.out.println("Неправильное значение массива!");
        System.out.println("Ошибка в ячейке: " + i + " x " + j);
    }
}
