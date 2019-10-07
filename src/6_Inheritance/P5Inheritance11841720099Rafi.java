/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan51841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class P5Inheritance11841720099Rafi {
    public static void main(String[] args) {
        P5Manager1841720099rafi m = new P5Manager1841720099rafi();
        m.mNama="Vivin";
        m.mAlamat="Jl. Vinolia";
        m.mUmur=25;
        m.mJk="Perempuan";
        m.mGaji=3000000;
        m.mTunjangan=1000000;
        m.tampilDataManagerRafi();
        System.out.println("");
        P5Staff1841720099Rafi s = new P5Staff1841720099Rafi();
        s.mNama="Lestari";
        s.mAlamat="Malang";
        s.mUmur=25;
        s.mJk="Perempuan";
        s.mGaji=2000000;
        s.mLembur=500000;
        s.mPotongan=250000;
        s.tampilDataStaffRafi();         
    }
    
}
