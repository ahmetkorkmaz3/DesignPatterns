package com.company;

public class GalaxyTab extends Tablet {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public GalaxyTab(String model, String brand) {
        super(model, brand);
    }
}
