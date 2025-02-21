package Bai7_1;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.setMember(true);
        customer.setMemberType("Gold");

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);

        System.out.println(visit);
        System.out.println("Total Expense: " + visit.getTotalExpense());
    }
}