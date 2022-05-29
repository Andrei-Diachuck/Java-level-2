package Projekt;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();
        Bird bird = new Bird();
        Members members = new Members();

        members.getMembers(cat.dis(5, 6, 2, 3));
        members.getMembers(human.dis(10, 1, 15, 1));
        members.getMembers(robot.dis(15, 2, 20, 3));
        members.getMembers(bird.dis(1, 20, 2, 50));
    }
}
