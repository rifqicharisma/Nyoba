package com.rifqi.pertemuan2.Praktikum.Inheritance;

public class A {
    public int x;
    public int y;

    // deklarasikan method agar dapat diwariskan
    public void printXY(){
        System.out.println("Nilai x\t: " + x);
        System.out.println("Nilai y\t: " + y);
    }
}
