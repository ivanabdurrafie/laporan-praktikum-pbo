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
public class Transaksi1841720099Rafi {
    private String mKodeTransaksi;
    private String mDate;
    private Anggota1841720099Rafi anggota;

    public Transaksi1841720099Rafi() {
    }

    public Transaksi1841720099Rafi(String mKodeTransaksi, String mDate, Anggota1841720099Rafi anggota) {
        this.mKodeTransaksi = mKodeTransaksi;
        this.mDate = mDate;
        this.anggota = anggota;
    }

    public String getmKodeTransaksi() {
        return mKodeTransaksi;
    }

    public void setmKodeTransaksi(String mKodeTransaksi) {
        this.mKodeTransaksi = mKodeTransaksi;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public Anggota1841720099Rafi getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota1841720099Rafi anggota) {
        this.anggota = anggota;
    }
    
    public String infoTransaksiRafi(){
        String infoTransaksi = "";
        infoTransaksi += "\n";
        infoTransaksi += "Kode Transaksi : "+mKodeTransaksi+"\n";
        infoTransaksi += "Tanggal : "+mDate+"\n";
        infoTransaksi += "Pelanggan : "+anggota.infoAnggotaRafi()+"\n";
        return infoTransaksi;
    }
}
