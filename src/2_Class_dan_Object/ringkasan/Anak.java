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
public class Anak extends Ayah {
    private String jenkel;
    
    public void getJenkel(String jenk){
        this.jenkel = jenk;
    }
    
    public void cetakAnak(){
        
        super.cetakKakek();
        
        System.out.println("Jenis kelamin : "+ jenkel);
    }
}
