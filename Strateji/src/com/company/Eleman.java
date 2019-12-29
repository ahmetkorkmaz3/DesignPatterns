package com.company;

public class Eleman {

    public IzinHesap izinHesap;
    public MaasHesap maasHesap;

    public Eleman(IzinHesap izinHesap, MaasHesap maasHesap) {
        this.izinHesap = izinHesap;
        this.maasHesap = maasHesap;
    }

    public int izinHesapla() {
        return izinHesap.izinHesapla();
    }

    public int maasHesapla() {
        return maasHesap.maasHesapla();
    }
}
