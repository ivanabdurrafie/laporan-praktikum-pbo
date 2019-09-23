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
public class Pelanggan1841720099Rafi {

    private String mNama;
    private Mobil1841720099Rafi mobil;
    private Sopir1841720099Rafi sopir;
    private int mHari;

    public Pelanggan1841720099Rafi() {
    }

    public String getmNamaRafi() {
        return mNama;
    }

    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }

    public Mobil1841720099Rafi getMobilRafi() {
        return mobil;
    }

    public void setMobilRafi(Mobil1841720099Rafi mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720099Rafi getSopirRafi() {
        return sopir;
    }

    public void setSopirRafi(Sopir1841720099Rafi sopir) {
        this.sopir = sopir;
    }

    public int getmHariRafi() {
        return mHari;
    }

    public void setmHariRafi(int mHari) {
        this.mHari = mHari;
    }
    
    public int hitungBiayaTotalRafi(){
        return mobil.hitungBiayaMobilRafi(mHari) + sopir.hitungBiayaSopirRafi(mHari);
    }
}
