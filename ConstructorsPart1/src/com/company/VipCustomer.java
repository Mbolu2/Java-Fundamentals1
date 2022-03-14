package com.company;

public class VipCustomer {
    public boolean getName;
    private String name;
    private double creditLimit;
    private String emailaddress;

    public VipCustomer(String name) {
        this("Default name", 50000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailaddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailaddress() {
        return emailaddress;

    }
}