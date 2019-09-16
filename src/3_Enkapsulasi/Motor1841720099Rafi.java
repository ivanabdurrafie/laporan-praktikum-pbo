/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorencapsulation1841720099Rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Motor1841720099Rafi {

    private int mKecepatan = 0;
    private boolean mKontakOn = false;

    public void nyalakanMesinRafi() {
        mKontakOn = true;
    }

    public void matikanMesinRafi() {
        mKontakOn = false;
        mKecepatan = 0;
    }

    public void tambahKecepatanRafi() {
        if (mKontakOn) {
            mKecepatan += 5;
            if (mKecepatan > 100) {
                mKecepatan = 100;
                System.out.println("Kecepatan sudah Mencapai Maximum");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Mati \n");
        }
    }

    public void kurangiKecepatanRafi() {
        if (mKontakOn == true) {
            mKecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatusrafi() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mKecepatan + "\n");
    }
}
