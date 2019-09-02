/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Sepeda1841720099Rafi {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    public void setWarnaRafi(String newValue){
        mWarna = newValue;
    }
    
    public void setMerekRafi(String newValue){
        mMerek = newValue;
    }
    
    public void gantiGearRafi(int newValue){
        mGear = newValue;
    }
    public void tambahKecepatanRafi(int increment){
        mKecepatan = mKecepatan + increment;
    }
    
    public void remRafi(int decrement){
        mKecepatan = mKecepatan - decrement;
    }
    
    public void cetakStatusRafi(){
        System.out.println("Merek : "+mMerek);
        System.out.println("Kecepatan : "+mKecepatan);
        System.out.println("Gear : "+mGear);
        System.out.println("Warna : "+mWarna);
    }
}
