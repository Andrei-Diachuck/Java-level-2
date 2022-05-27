package Projekt;

public class Human  implements Action {
    public Human(int dis) {
    }

    @Override
    public int dis(int treadmill, int wall, int r, int j) {
        if (r < treadmill || j < wall) {
            System.out.println("Человек сошел с дистанции");
        } else {
            System.out.println("Человек прошел дистанцию");
        }
        return r;
    }
}
