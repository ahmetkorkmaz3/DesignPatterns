package com.company;

import java.util.*;

abstract class absUrun {

    private String urunAdi;
    private int fiyat;

    public List<IUye> takipList = new ArrayList<>();

    public absUrun(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public void notifyUrun() {
        for (IUye item :
                takipList) {
            item.update(this);
        }
    }

    public void setFiyat(int fiyat) {
        if (fiyat < this.fiyat) {
            notifyUrun();
            this.fiyat = fiyat;
        }
    }

    public int getFiyat() {
        return fiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
}
