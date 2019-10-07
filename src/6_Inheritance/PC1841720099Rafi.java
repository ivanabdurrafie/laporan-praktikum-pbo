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
public class PC1841720099Rafi extends Komputer1841720099Rafi{
    public int mUkuranMonitor;

    public PC1841720099Rafi() {
    }

    public PC1841720099Rafi(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, int mUkuranMonitor) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.mUkuranMonitor = mUkuranMonitor;
    }
    public void tampilPCRafi(){
        super.tampilDataRafi();
        System.out.println("Ukuran Monitor : "+mUkuranMonitor);
    }
}
