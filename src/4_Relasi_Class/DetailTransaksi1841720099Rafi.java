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
public class DetailTransaksi1841720099Rafi {

    private Transaksi1841720099Rafi transaksi;
    private Barang1841720099Rafi barang;
    private int mQty;

    public DetailTransaksi1841720099Rafi() {
    }

    public DetailTransaksi1841720099Rafi(Transaksi1841720099Rafi transaksi, Barang1841720099Rafi barang, int mQty) {
        this.transaksi = transaksi;
        this.barang = barang;
        this.mQty = mQty;
    }

    public Transaksi1841720099Rafi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi1841720099Rafi transaksi) {
        this.transaksi = transaksi;
    }

    public Barang1841720099Rafi getBarang() {
        return barang;
    }

    public void setBarang(Barang1841720099Rafi barang) {
        this.barang = barang;
    }

    public int getmQty() {
        return mQty;
    }

    public void setmQty(int mQty) {
        this.mQty = mQty;
    }

    public String infoDetailRafi() {
        String infoDetailRafi = "";
        infoDetailRafi += "\n";
        infoDetailRafi += "Detail Transaksi : \n";
        infoDetailRafi += transaksi.infoTransaksiRafi() + "\n";
        infoDetailRafi += "Barang : " + barang.infoBarangRafi() + "\n";
        infoDetailRafi += "Qty : " + mQty + "\n";
        int total = this.mQty * barang.getmHarga();
        infoDetailRafi += "Total : " + total + "\n";
        return infoDetailRafi;

    }
}
