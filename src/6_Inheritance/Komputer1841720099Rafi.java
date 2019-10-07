/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tkomp1841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Komputer1841720099Rafi {
     public String mMerk;
    public int mKecProsesor;
    public int mSizeMemory;
    public String mJnsProsesor;

    public Komputer1841720099Rafi() {
    }
    public Komputer1841720099Rafi(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor) {
        this.mMerk = mMerk;
        this.mKecProsesor = mKecProsesor;
        this.mSizeMemory = mSizeMemory;
        this.mJnsProsesor = mJnsProsesor;
    }
    
    public void tampilDataRafi(){
        System.out.println("Merk            : "+mMerk);
        System.out.println("Kec Prosesor    : "+mKecProsesor);
        System.out.println("Size Memory     : "+mSizeMemory);
        System.out.println("Jns Prosesor    : "+mJnsProsesor);
    }
}
