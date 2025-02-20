package Bai3_7;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 2, 3);
        Player player = new Player(7, 40, 40, 20, 20);

        for (int i = 0; i < 10; i++) {
            ball.move();
            if (player.collidesWith(ball)) {
                ball.reflectHorizontal();
                ball.reflectVertical();
            }
            System.out.println(ball);
        }
    }
}
