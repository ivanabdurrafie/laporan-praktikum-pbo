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
public class Mac1841720099Rafi extends Laptop1841720099Rafi{
     public String mSecurity;

    public Mac1841720099Rafi() {
    }

    public Mac1841720099Rafi(String mMerk, int mKecProsesor, int mSizeMemory, 
            String mJnsProsesor, String mJnsBatrai, String mSecurity) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrai);
        this.mSecurity = mSecurity;
    }
    public void tampilMacRafi(){
        System.out.println("============Data Mac============");
        super.tampilLaptopRafi();
        System.out.println("Security        : "+mSecurity);
    }
}
