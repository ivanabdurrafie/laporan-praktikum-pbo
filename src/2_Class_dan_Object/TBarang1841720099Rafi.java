/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barangtugas;

/**
 *
 * @author Ivan Abdurrafie
 */
public class TBarang1841720099Rafi {
    public String mKode;
    public String mNamaBarang;
    public int mHargaDasar;
    public float mDiskon;
    
    public float hitungHargaJual1841720099Rafi(){
        return mHargaDasar - (mDiskon*mHargaDasar);
    }
    
    public void tampilData1841720099Rafi(){
        System.out.println("Kode : "+mKode);
        System.out.println("Nama Barang : "+mNamaBarang);
        System.out.println("Harga Dasar : "+mHargaDasar);
        System.out.println("Diskon : "+mDiskon);
        System.out.println("Harga Jual : "+hitungHargaJual1841720099Rafi());
    }
}
