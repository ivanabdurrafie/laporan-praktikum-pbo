/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toko1841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Barang1841720099Rafi {
    private String mKodeBarang;
    private String mNamaBarang;
    private int mHarga;

    public Barang1841720099Rafi() {
    }

    public Barang1841720099Rafi(String mKodeBarang, String mNamaBarang, int mHarga) {
        this.mKodeBarang = mKodeBarang;
        this.mNamaBarang = mNamaBarang;
        this.mHarga = mHarga;
    }

    public String getmKodeBarang() {
        return mKodeBarang;
    }

    public void setmKodeBarang(String mKodeBarang) {
        this.mKodeBarang = mKodeBarang;
    }

    public String getmNamaBarang() {
        return mNamaBarang;
    }

    public void setmNamaBarang(String mNamaBarang) {
        this.mNamaBarang = mNamaBarang;
    }

    public int getmHarga() {
        return mHarga;
    }

    public void setmHarga(int mHarga) {
        this.mHarga = mHarga;
    }
    
    public String infoBarangRafi(){
        String infoBarang = "";
        infoBarang += "\n";
        infoBarang += "Kode Barang : "+mKodeBarang+"\n";
        infoBarang += "Nama Barang : "+mNamaBarang+"\n";
        infoBarang += "Harga : "+mHarga+"\n";
        return infoBarang;
    }
}
