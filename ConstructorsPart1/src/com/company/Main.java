package com.company;

public class Main {

    public static void main(String[] args) {

    bankAccount bobsAccount = new bankAccount (); //("12345", 0.00, "Bob Brown" +
            //"myemail@bob.com", "(087) 123-4567");


        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());



    bobsAccount.withdraw(100.0);

    bobsAccount.deposit(50.0);
    bobsAccount.withdraw(100.0);

    bobsAccount.deposit(51.0);
    bobsAccount.withdraw(100);

    bankAccount bolusbankAccount = new bankAccount("Bolu", "aprilweather14@gmail.com", "09050447008");
        System.out.println(bolusbankAccount.getNumber() + "name " + bolusbankAccount.getCustomerName() );


    }
}
