/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gudangpintar;

/**
 *
 * @author Lenovo
 */
public class Barang {
    private int  Jumlah, Harga;
    private String IdBarang,NamaBarang, Kategori;
    
    public Barang( String IdBarang,String NamaBarang, String Kategori, int Jumlah, int Harga){
        this.IdBarang = IdBarang;
        this.Harga = Harga;
        this.Jumlah = Jumlah;
        this.Kategori = Kategori;
        this.NamaBarang = NamaBarang;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public String getIdBarang() {
        return IdBarang;
    }
   
    
}
