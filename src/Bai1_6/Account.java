package Bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account ( String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public Account(String id, String name){
        this.id=id;
        this.name=name;
        this.balance=0;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    public void credit(int amout){
        balance+=amout;
    }
    public void debit(int amout){
        if (amout<= balance) {
            balance -= amout;
        } else {
            System.out.println("Amout exceeded balance");
        }
    }
    public void transferTo(Bai1_6.Account another, int amout){
        if(amout<=balance) {
            debit(amout);
            another.credit(amout);
        } else {
            System.out.println("Amout exceeded balance");
        }
    }
    @Override
    public String toString() {
        return "Accout[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
