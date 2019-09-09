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
public class Ayah extends Kakek {
    private String mPekerjaan;
    
    public void getPekerjaan(String pekerjaan){
        this.mPekerjaan = pekerjaan;
    }
    
    public void cetakAyah(){
        super.cetakKakek();
        System.out.println("Pekerjaan : "+mPekerjaan);
    }
}
