package com.company;

public class HealthyBurger extends Hamburger{
    private String healthExtra1name;
    private double healthyExtra1Price;

    private String healthExtra2name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");

    }
    public void addHealthAddition1(String name, double price) {
        this.healthExtra1name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition1(String name, double price) {
        this.healthExtra2name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null) {
            hamburgerPrice +=this.healthyExtra1Price;
            System.out.println("Added " + this.healthExtra1name + " for an extra " + this.healthyExtra1Price);
          }
        if(this.healthyExtra2Name != null) {
            hamburgerPrice +=this.healthyExtra2Price;
            System.out.println("Added " + this.healthExtra1name + " for an extra " + this.healthyExtra1Price);
        }
        return hamburgerPrice;
    }
}
