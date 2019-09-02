/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dokterspesialis;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Dokter1841720099Rafi {
    private String mNamaDokter;
    private int mKodeDokter;
    private String mJenisKelamin;
    private String mAlamat;

    public void setNamaDokter1841720099Rafi(String mNamaDokter){
       this.mNamaDokter = mNamaDokter;
    }
    
    public void setKodeDokter1841720099Rafi(int mKodeDokter){
        this.mKodeDokter = mKodeDokter;
    }
    
    public void setJenisKelamin1841720099Rafi(String mJenkel){
        this.mJenisKelamin = mJenkel;
    }
    
    public void setAlamat1841720099Rafi(String mAlamat){
        this.mAlamat = mAlamat;
    }
    
    public void print1841720099Rafi(){
        System.out.println("Nama Dokter : "+mNamaDokter);
        System.out.println("Kode Dokter : "+mKodeDokter);
        System.out.println("Jenis Kelamin : "+mJenisKelamin);
        System.out.println("Alamat : "+ mAlamat);
    }
}
