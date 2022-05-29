package Projekt;

public class Bird implements Action{


    @Override
    public int dis(int treadmill, int wall, int r, int j) {
        if (r < treadmill || j < wall) {
            System.out.println("Птица прошла дистанцию");
        } else {
            System.out.println("Птица прошла дистанцию");
        }
        return r;
    }
}
