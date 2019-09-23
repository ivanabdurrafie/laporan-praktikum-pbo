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
public class Kursi1841720099Rafi {

    private String mNomer;
    private Penumpang1841720099Rafi penumpang;

    public Kursi1841720099Rafi(String mNomer) {
        this.mNomer = mNomer;
    }

    public String getmNomer() {
        return mNomer;
    }

    public void setmNomer(String mNomer) {
        this.mNomer = mNomer;
    }

    public Penumpang1841720099Rafi getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang1841720099Rafi penumpang) {
        this.penumpang = penumpang;
    }

    public String Info() {
        String info = "";
        info += "Nomer : " + mNomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang : " + penumpang.infoRafi() + "\n";
        }
        return info;
    }
}
