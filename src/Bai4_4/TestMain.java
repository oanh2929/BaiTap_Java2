package Bai4_4;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 0.7f);
        System.out.println(mp);

        mp.move();
        System.out.println(mp);

        mp.setSpeed(1.0f, 1.5f);
        mp.move();
        System.out.println(mp);
    }
}
