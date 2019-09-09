/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barang;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Barang1841720099Rafi {
    public String mNamaBarang;
    public String mJenisBarang;
    public int mStok;
    
    public void tampilBarang1841720099Rafi(){
        System.out.println("Nama Barang : "+mNamaBarang);
        System.out.println("Jenis Barang : "+mJenisBarang);
        System.out.println("Stok : "+mStok);
    }
    
    public int tambahStok1841720099(int mBarangMasuk){
        int mStokBaru = mBarangMasuk+mStok;
        return mStokBaru;
    }
    
}
