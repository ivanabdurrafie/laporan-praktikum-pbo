/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerbong1841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Gerbong1841720099Rafi {

    private String mKode;
    private Kursi1841720099Rafi[] mArrayKursi;

    public Gerbong1841720099Rafi(String mKode, int mJumlah) {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1841720099Rafi[mJumlah];
        this.initKursiRafi();
    }

    public String getmKode() {
        return mKode;
    }

    public void setmKode(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720099Rafi[] getmArrayKursi() {
        return mArrayKursi;
    }

    public void setmArrayKursi(Kursi1841720099Rafi[] mArrayKursi) {
        this.mArrayKursi = mArrayKursi;
    }

    private void initKursiRafi() {
        for (int i = 0; i < mArrayKursi.length; i++) {
            this.mArrayKursi[i] = new Kursi1841720099Rafi(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode : " + mKode + "\n";
        for (Kursi1841720099Rafi kr : mArrayKursi) {
            info += kr.Info();
        }
        return info;
    }
    
    public void setPenumpang(Penumpang1841720099Rafi p,int nomor){
        this.mArrayKursi[nomor-1].setPenumpang(p);
    }
}
