/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keretaapi1841720099;

/**
 *
 * @author Ivan Abdurrafie
 */
public class KeretaApi1841720099Rafi {

    private String mNama;
    private String mKelas;
    private Pegawai1841720099Rafi masinis;
    private Pegawai1841720099Rafi asisten;

    public KeretaApi1841720099Rafi(String mNama, String mKelas, Pegawai1841720099Rafi masinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720099Rafi(String mNama, String mKelas, Pegawai1841720099Rafi masinis, Pegawai1841720099Rafi asisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720099Rafi getMasinis() {
        return masinis;
    }

    public void setMasinis(Pegawai1841720099Rafi masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720099Rafi getAsisten() {
        return asisten;
    }

    public void setAsisten(Pegawai1841720099Rafi asisten) {
        this.asisten = asisten;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.mNama + "\n";
        info += "Kelas : " + this.mKelas + "\n";
        info += "\n";
        info += "Masinis : \n" + this.masinis.infoRafi() + "\n";
//        if (this.asisten != null) {
            info += "Asisten : \n" + this.asisten.infoRafi() + "\n";
//        }
        return info;
    }
}
