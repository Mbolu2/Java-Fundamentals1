package com.company;

public class Main {

    public static void main(String[] args) {




        Printer printer = new Printer (50, false);
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printpages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printpages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " +printer.getPagesPrinted());
    }

}
