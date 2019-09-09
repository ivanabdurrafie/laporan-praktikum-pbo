/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.peminjaman;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Peminjaman1841720099Rafi {
    public int mId;
    public String mNamaMember;
    public String mNamaGame;
    public int mHarga;
    public int mLamaSewa;
    
    public int totalBayar1841720099Rafi(){
        int mHasil = 0;
        return mHasil = mHarga * mLamaSewa;
    }
    
    public void cetakSewa1841720099Rafi(){
        System.out.println("ID : "+mId);
        System.out.println("Nama Member : "+mNamaMember);
        System.out.println("Nama Game : "+mNamaGame);
        System.out.println("Harga : "+mHarga);
        System.out.println("Lama Sewa : "+mLamaSewa);
        System.out.println("Total Bayar : "+totalBayar1841720099Rafi());
    }
}
