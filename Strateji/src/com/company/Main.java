package com.company;

public class Main {

    public static void main(String[] args) {

        Eleman muhendis = new Eleman(new DepartmanAIzin(), new MuhendisMaas());
        int muhendisIzin = muhendis.izinHesapla();
        int muhendisMaas = muhendis.maasHesapla();

        System.out.println("Muhendis " + muhendisIzin + " gün izin yapabilir. Maaş = " + muhendisMaas);

    }
}
