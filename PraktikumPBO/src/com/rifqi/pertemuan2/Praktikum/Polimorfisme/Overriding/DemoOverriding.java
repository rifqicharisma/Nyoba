package com.rifqi.pertemuan2.Praktikum.Polimorfisme.Overriding;

public class DemoOverriding {
    public static void main(String[] args) {
        // deklarasi objek
        X superClass = new X();
        Y subClass = new Y();

        // memanggil class parent dan child
        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}