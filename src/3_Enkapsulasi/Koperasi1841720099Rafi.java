/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasi1841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Koperasi1841720099Rafi {

    private int mKTP;
    private String mNama;
    private int mLimit;
    private int mPinjaman;
    private int mAngsuran;

    public Koperasi1841720099Rafi(int mKTP, String mNama, int mLimit) {
        this.mKTP = mKTP;
        this.mNama = mNama;
        this.mLimit = mLimit;
    }

    public int getmKTPRafi() {
        return mKTP;
    }

    public void setmKTPRafi(int mKTP) {
        this.mKTP = mKTP;
    }

    public String getmNamaRafi() {
        return mNama;
    }

    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }

    public int getmLimitRafi() {
        return mLimit;
    }

    public void setmLimitRafi(int mLimit) {
        this.mLimit = mLimit;
    }

    public int getmPinjamanRafi() {
        return mPinjaman;
    }

    public int getmAngsuranRafi() {
        return mAngsuran;
    }

    public void setmAngsuranRafi(int mAngsuran) {
        int var = 10 * this.mPinjaman / 100;
        if (mPinjaman > 0) {
            if (var <= mAngsuran) {
                this.mPinjaman -= mAngsuran;
            } else {
                System.out.println("Maaf, Angsuran harus 10% dari jumlah pinjaman");
            }
        } else {
            System.out.println("Maaf, belum bisa mengangsur karena tidak ada pinjaman");
        }
    }

    public void setmPinjamanRafi(int mNewPinjaman) {
        if (mNewPinjaman <= mLimit) {
            this.mPinjaman += mNewPinjaman;
        } else {
            System.out.println("Maaf Jumlah pinjaman melebihi limit");
        }
    }

}
