package com.company;

public class Main {

    public static void main(String[] args) {
        Client pc = new Client(new ConceteFactory1());
        Client pc2 = new Client(new ConcreteFactory2());
    }
}
