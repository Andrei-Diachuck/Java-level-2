package Projekt;

public class Cat implements Action {



    @Override
    public int dis(int treadmill, int wall, int r, int j) {
        if (r < treadmill || j < wall) {
            System.out.println("Котк сошел с дистанции");
        } else {
            System.out.println("Котик прошел дистанцию");
        }
        return r;
    }
}
