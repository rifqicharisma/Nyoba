package com.rifqi.pertemuan1.Praktikum.manusia;

public class Manusia {
    // deklarasi variabel
    private String nama;
    private int umur;

    // constructor pertama
    public Manusia(){}

    // cunstructor kedua
    public Manusia(String nama){
        this.nama = nama;
    }

    // constructor ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // getter and setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
