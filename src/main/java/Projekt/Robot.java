package Projekt;

public class Robot implements Action {
    public Robot(int dis) {
    }

    @Override
    public int dis(int treadmill, int wall, int r, int j) {
        if (r < treadmill || j < wall) {
            System.out.println("Робот сошел с дистанции");
        } else {
            System.out.println("Робот прошел дистанцию");
        }
        return r;
    }

    // public Robot(int dis) {
   //     int r = 20;
   //     int j = 10;
   //     if (r < dis) {
   //         System.out.println("Робот не смог пробежать");
   //     } else {
   //         System.out.println("Робот пробежал дистанцию");
   //     }
   //     if (j < dis) {
   //         System.out.println("Робот не смог перепрыгнуть стену");
   //     } else {
   //         System.out.println("Робот перепрыгнул стену");
   //     }
   // }

  // @Override
  // public int run(Treadmill treadmill, int r) {
  //     if (r < treadmill.getRun()) {
  //         System.out.println("Робот не смог пробежать");
  //     } else {
  //         System.out.println("Робот пробежал дистанцию");
  //     }
  //     return r;
  // }

  // @Override
  // public int jump(Wall wall, int j) {
  //     if (j < wall.getWall()) {
  //         System.out.println("Робот не смог перепрыгнуть стену");
  //     } else {
  //         System.out.println("Робот перепрыгнул стену");
  //     }
  //     return j;
  // }
}
