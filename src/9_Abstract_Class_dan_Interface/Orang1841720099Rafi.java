/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbominggu9.abstractclass;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Orang1841720099Rafi {
    private String nama;
    private Hewan1841720099Rafi hewan;

    public Orang1841720099Rafi(String nama) {
        this.nama = nama;
    }
    
    public void peliharaHewanRafi(Hewan1841720099Rafi hewan){
        this.hewan = hewan;
    }
    
    public void ajakPeliharaanJalanJalanRafi(){
        System.out.println("Namaku "+ this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara : ");
        this.hewan.bergerakRafi();
        System.out.println("-----------------------");
    }
}
