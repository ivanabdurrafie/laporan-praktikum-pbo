/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigettersetter1841720099rafi;

public class Anggota1841720099Rafi {

    private String mNama;
    private String mAlamat;
    private float mSimpanan;

    public Anggota1841720099Rafi(String mNama, String mAlamat) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mSimpanan = 0;
    }
    public String getmNamaRafi() {
        return mNama;
    }
    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }
    public String getmAlamatRafi() {
        return mAlamat;
    }
    public void setmAlamatRafi(String mAlamat) {
        this.mAlamat = mAlamat;
    }
    public float getmSimpananRafi() {
        return mSimpanan;
    }
    public void setorRafi(float mUang) {
        mSimpanan += mUang;
    }
    public void pinjamRafi(float mUang) {
        mSimpanan -= mUang;
    }

}
