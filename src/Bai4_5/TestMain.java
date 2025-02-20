package Bai4_5;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape);

        Circle circle = new Circle(5.5, "yellow", true);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(2.0, 3.0, "green", false);
        System.out.println(rectangle);

        Square square = new Square(4.0, "pink", true);
        System.out.println(square);
    }

}
