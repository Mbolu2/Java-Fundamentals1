package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName);

        VipCustomer person2 = new VipCustomer("Bolu", 25000.00);
        System.out.println(person2.getName);

        VipCustomer person3 = new VipCustomer("Bolu", 10000, "bolu@email.com");
        System.out.println(person3.getName);
    }
}
