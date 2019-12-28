package com.company;

public class Uye implements IUye {

    private String email;

    public Uye(String email) {
        this.email = email;
    }

    @Override
    public void update(absUrun urun) {
        System.out.println(this.email + " merhaba " + urun.getUrunAdi() + " ürününün fiyatı düştü");
    }
}
