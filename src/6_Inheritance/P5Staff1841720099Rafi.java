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
public class P5Staff1841720099Rafi extends P5Karyawan1841720099Rafi {
    public int mLembur, mPotongan;
    public P5Staff1841720099Rafi() {
    }
    public P5Staff1841720099Rafi(String mNama, String mAlamat, String mJk, int mUmur,
            int mGaji, int mLembur, int mPotongan) {
        super(mNama, mAlamat, mJk, mUmur, mGaji);
        this.mLembur = mLembur;
        this.mPotongan = mPotongan;
    }

    public void tampilDataStaffRafi() {
        super.tampilDataKaryawanRafi();
        System.out.println("Lembur = " + mLembur);
        System.out.println("Potongan = " + mPotongan);
        System.out.println("Total Gaji = " + (mGaji + mLembur - mPotongan));
    }
}
