package Projekt;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(0);
        Human human = new Human(0);
        Robot robot = new Robot(0);
        Bird bird = new Bird(0);
        Members members = new Members();

        members.getMembers(cat.dis(5, 6, 2, 3));
        members.getMembers(human.dis(10, 1, 15, 1));
        members.getMembers(robot.dis(15, 2, 20, 3));
        members.getMembers(bird.dis(1, 20, 2, 50));
    }
}
