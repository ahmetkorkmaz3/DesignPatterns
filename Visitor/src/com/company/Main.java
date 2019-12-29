package com.company;

public class Main {

    public static void main(String[] args) {

        Tablet ipad = new IPad("IPad mini", "Apple");
        Tablet galaxy = new GalaxyTab("Galaxy Tab", "Samsung");

        ipad.accept(new WifiVisitor());
        ipad.accept(new ThreeGVisitor());

        galaxy.accept(new WifiVisitor());
        galaxy.accept(new ThreeGVisitor());

    }
}
