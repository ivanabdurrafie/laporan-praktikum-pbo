/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan61841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class StaffHarian1841720099Rafi  extends Staff1841720099Rafi{
     public int mJmlJamKerja;

    public StaffHarian1841720099Rafi() {
    }

    public StaffHarian1841720099Rafi(String mNama, String mAlamat, String mJk, int mUmur,
            int mGaji, int mLembur, int mPotongan,int mJmlJamKerja) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.mJmlJamKerja = mJmlJamKerja;
    }

    public void tampilStaffHarianRafi(){
        System.out.println("==============Data Staff Harian==============");
        super.tampilDataStaffRafi();
        System.out.println("Jumlah Jam Kerja= "+mJmlJamKerja);
        System.out.println("Gaji Bersih     = "+(mGaji*mJmlJamKerja+mLembur-mPotongan));
    }
}
