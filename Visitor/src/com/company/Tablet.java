package com.company;

abstract class Tablet {
    public String model;
    public String brand;

    public Tablet(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public abstract void accept(IVisitor visitor);

}
