package Bai4_2;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("Alice", "123 Main St");
        System.out.println(person);

        Student student = new Student("Bob", "456 Maple Ave", "CS", 2024, 15000.50);
        System.out.println(student);

        Staff staff = new Staff("Charlie", "789 Oak Blvd", "XYZ School", 50000.75);
        System.out.println(staff);
    }

}
