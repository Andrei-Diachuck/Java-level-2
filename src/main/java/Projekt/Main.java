package Projekt;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(0);
        Human human = new Human(0);
        Robot robot = new Robot(0);
        Bird bird = new Bird(0);


        Action[] actions = new Action[6];
        actions[0] = new Cat(cat.dis(5, 5, 1, 1));
        actions[1] = new Human(human.dis(10, 1, 15, 1));
        actions[2] = new Robot(robot.dis(15, 3, 30, 5));
        actions[3] = new Cat(cat.dis(1, 2, 5, 3));
        actions[4] = new Human(human.dis(15, 2, 20, 1));
        actions[5] = new Bird(bird.dis(4, 10, 4, 50));
    }
}
