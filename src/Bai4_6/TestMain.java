package Bai4_6;

public class TestMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Mammal 1");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Charlie");

        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
    }
}
