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
public class Manager1841720099rafi extends Karyawan1841720099Rafi{
    public int mTunjangan;

    public Manager1841720099rafi() {
    }
    
    public void tampilDataManagerRafi(){
        super.tampilDataKaryawanRafi();
        System.out.println("Tunjangan = "+mTunjangan);
        System.out.println("Total Gaji = "+ (int) (super.mGaji+mTunjangan));
    }
}
