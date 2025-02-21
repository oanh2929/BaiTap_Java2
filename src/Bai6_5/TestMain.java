package Bai6_5;

public class TestMain {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println("Trước khi resize: " + resizableCircle);
        System.out.println("Chu vi: " + resizableCircle.getPerimeter());
        System.out.println("Diện tích: " + resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println("\nSau khi resize 50%: " + resizableCircle);
        System.out.println("Chu vi: " + resizableCircle.getPerimeter());
        System.out.println("Diện tích: " + resizableCircle.getArea());

        resizableCircle.resize(200);
        System.out.println("\nSau khi resize 200%: " + resizableCircle);
        System.out.println("Chu vi: " + resizableCircle.getPerimeter());
        System.out.println("Diện tích: " + resizableCircle.getArea());
    }
}
