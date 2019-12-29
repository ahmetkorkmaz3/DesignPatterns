package com.company;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

interface IAlanHesaplama {
    void veriAl(double taban, double yükseklik);
    double AlanHesapla();
}

class Dikdorgen implements  IAlanHesaplama {
    private double taban;
    private double yukseklik;

    @Override
    public void veriAl(double taban, double yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    @Override
    public double AlanHesapla() {
        return taban * yukseklik;
    }
}

class Yamuk  {
    private double alt_t;
    private double ust_t;
    private double yukseklik;

    public double getAlt_t() {
        return alt_t;
    }

    public void setAlt_t(double alt_t) {
        this.alt_t = alt_t;
    }

    public double getUst_t() {
        return ust_t;
    }

    public void setUst_t(double ust_t) {
        this.ust_t = ust_t;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double YamukAlaniHesapla(double alt_t, double ust_t, double yukseklik) {
        this.alt_t = alt_t;
        this.ust_t = ust_t;
        this.yukseklik = yukseklik;

        return 0.5 * yukseklik * (alt_t + ust_t);
    }
}

class YamukAdapter implements IAlanHesaplama {

    private Yamuk yamuk; // adaptee

    public YamukAdapter(Yamuk yamuk) {
        this.yamuk = yamuk;
    }

    @Override
    public void veriAl(double taban, double yukseklik) {
        throw new NotImplementedException();
    }

    public void veriAl(double alt_t, double ust_t, double yukseklik) {
        yamuk.setAlt_t(alt_t);
        yamuk.setAlt_t(ust_t);
        yamuk.setAlt_t(yukseklik);
    }

    @Override
    public double AlanHesapla() {
        return yamuk.YamukAlaniHesapla(yamuk.getAlt_t(), yamuk.getUst_t(), yamuk.getYukseklik());
    }
}

public class Main {
    public static void main(String[] args) {
        IAlanHesaplama dikdortgenim = new Dikdorgen();
        Yamuk yamuk = new Yamuk();
        yamuk.setAlt_t(2);
        yamuk.setAlt_t(2);
        yamuk.setAlt_t(2);
        IAlanHesaplama dikdortgenGorunumluYamuk = new YamukAdapter(yamuk);
        System.out.println(dikdortgenGorunumluYamuk.AlanHesapla());
    }
}