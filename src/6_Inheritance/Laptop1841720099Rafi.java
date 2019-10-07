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
public class Laptop1841720099Rafi extends Komputer1841720099Rafi{
    public String mJnsBatrai;

    public Laptop1841720099Rafi() {
    }

    public Laptop1841720099Rafi(String mMerk, int mKecProsesor, int mSizeMemory, 
            String mJnsProsesor, String mJnsBatrai) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.mJnsBatrai = mJnsBatrai;
    }
    public void tampilLaptopRafi(){
        super.tampilDataRafi();
        System.out.println("Jns Batrai      : "+mJnsBatrai);
    }
}
