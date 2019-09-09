/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anak;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Kakek {
    private String mNama;
    private int mUmur;
    
    public void getNama(String name){
        this.mNama = name;
    }
    
    public void getUmur(int age){
        this.mUmur = age;
    }
    
    public void cetakKakek(){
        System.out.println("Nama : "+mNama);
        System.out.println("Umur : "+mUmur);
    }
    
}
