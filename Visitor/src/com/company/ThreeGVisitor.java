package com.company;

public class ThreeGVisitor implements IVisitor {
    @Override
    public void visit(Tablet tablet) {
        if (tablet instanceof IPad) {
            System.out.println("Ipad does not have 3G option");
        } else if (tablet instanceof GalaxyTab) {
            System.out.println("GalaxyTab 3G has open");
        } else {
            System.out.println("This object is not a tablet");
        }
    }
}
