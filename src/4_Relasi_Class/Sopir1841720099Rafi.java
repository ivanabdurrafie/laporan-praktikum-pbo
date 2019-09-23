/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pelanggan;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Sopir1841720099Rafi {
    private String mNama;
    private int mBiaya;

    public Sopir1841720099Rafi() {
    }

    public String getmNamaRafi() {
        return mNama;
    }

    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaRafi() {
        return mBiaya;
    }

    public void setmBiayaRafi(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaSopirRafi(int hari){
        return mBiaya * hari;
    }
    
}
