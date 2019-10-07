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
public class StaffTetap1841720099Rafi extends Staff1841720099Rafi{
    public String mGolongan;
    public int mAsuransi;

    public StaffTetap1841720099Rafi() {
    }

    public StaffTetap1841720099Rafi(String mNama, String mAlamat, String mJk, int mUmur,
            int mGaji, int mLembur, int mPotongan, String mGolongan, int mAsuransi) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.mGolongan = mGolongan;
        this.mAsuransi = mAsuransi;
    }
    public void tampilStaffTetapRafi(){
        System.out.println("==============Data Staff Tetap==============");
        super.tampilDataStaffRafi();
        System.out.println("Golongan        = "+mGolongan);
        System.out.println("Jumlah Asuransi = "+mAsuransi);
        System.out.println("Gaji Bersih     = "+(mGaji+mLembur-mPotongan-mAsuransi));
    }
}
