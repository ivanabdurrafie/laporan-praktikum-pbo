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
public class Anggota1841720099Rafi {
    private String mKodeMember;
    private String mNama;
    private String mAlamat;
    private String mNotelp;

    public Anggota1841720099Rafi() {
    }

    public Anggota1841720099Rafi(String mKodeMember, String mNama, String mAlamat, String mNotelp) {
        this.mKodeMember = mKodeMember;
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mNotelp = mNotelp;
    }

    public String getmKodeMember() {
        return mKodeMember;
    }

    public void setmKodeMember(String mKodeMember) {
        this.mKodeMember = mKodeMember;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamat() {
        return mAlamat;
    }

    public void setmAlamat(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmNotelp() {
        return mNotelp;
    }

    public void setmNotelp(String mNotelp) {
        this.mNotelp = mNotelp;
    }
    
    public String infoAnggotaRafi(){
        String infoAnggota = "";
        infoAnggota += "\n";
        infoAnggota += "Kode Member : "+mKodeMember+"\n";
        infoAnggota += "Nama Member : "+mNama+"\n";
        infoAnggota += "Alamat Member : "+mAlamat+"\n";
        infoAnggota += "No Telp Member : "+mNotelp+"\n";
        return infoAnggota;
    }
    
}
