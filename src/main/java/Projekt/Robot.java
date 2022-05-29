package Projekt;

public class Robot implements Action {
    @Override
    public int dis(int treadmill, int wall, int r, int j) {
        if (r < treadmill || j < wall) {
            System.out.println("Робот сошел с дистанции");
        } else {
            System.out.println("Робот прошел дистанцию");
        }
        return r;
    }
}
