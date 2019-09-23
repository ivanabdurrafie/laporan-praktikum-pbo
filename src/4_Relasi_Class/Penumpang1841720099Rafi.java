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
public class Penumpang1841720099Rafi {

    private String mKTP;
    private String mNama;

    public Penumpang1841720099Rafi(String mKTP, String mNama) {
        this.mKTP = mKTP;
        this.mNama = mNama;
    }

    public String getmKTPRafi() {
        return mKTP;
    }

    public void setmKTPRafi(String mKTP) {
        this.mKTP = mKTP;
    }

    public String getmNamaRafi() {
        return mNama;
    }

    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }

    public String infoRafi() {
        String info = "";
        info += "KTP : " + mKTP + "\n";
        info += "Nama : " + mNama + "\n";
        return info;
    }
}
