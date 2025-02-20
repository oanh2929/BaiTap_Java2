package Bai4_2;

public class Person {
    private String name;
    private String addres;

    public Person(String name, String addres){
        this.name=name;
        this.addres=addres;
    }

    public String getName() {
        return name;
    }


    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name +
                ", addres='" + addres +
                '}';
    }
}
