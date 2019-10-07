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
public class Windows1841720099Rafi extends Laptop1841720099Rafi{
    public String mFitur;

    public Windows1841720099Rafi() {
    }

    public Windows1841720099Rafi(String mMerk, int mKecProsesor, int mSizeMemory,
            String mJnsProsesor, String mJnsBatrai, String mFitur) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrai);
        this.mFitur = mFitur;
    }
    public void tampilWindowsRafi(){
        System.out.println("============Data Windows============");
        super.tampilLaptopRafi();
        System.out.println("Fitur           : "+mFitur);
    }
}
