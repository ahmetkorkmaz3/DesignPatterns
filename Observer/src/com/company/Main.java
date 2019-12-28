package com.company;

public class Main {

    public static void main(String[] args) {
        absUrun kitap = new Urun("Kitap", 12);
        kitap.takipList.add(new Uye("ahmet@hotmail.com"));
        kitap.takipList.add(new Uye("engin@hotmail.com"));

        kitap.setFiyat(10);

    }
}
