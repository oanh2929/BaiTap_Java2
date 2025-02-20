package Bai4_3;

public class TestMain {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(1.5f, 2.5f);
        System.out.println("Point2D: " + point2D);
        point2D.setXY(3.0f, 4.0f);
        System.out.println("Updated Point2D: " + point2D);

        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);
        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point3D: " + point3D);
    }
}
