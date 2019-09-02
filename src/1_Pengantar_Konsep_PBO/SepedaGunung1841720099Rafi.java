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
public class SepedaGunung1841720099Rafi extends Sepeda1841720099Rafi{
    private String mTipeSuspensi;
   
    
    public void setTipeSuspensiRafi(String newValue){
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusRafi(){
        super.cetakStatusRafi();
        System.out.println("Tipe Suspensi : "+mTipeSuspensi);
        
    }
}
