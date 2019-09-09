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
public class AnakMain {
    public static void main(String[] args) {
        Kakek k = new Kakek();
        Ayah a = new Ayah();
        Anak an = new Anak();
        
        k.getNama("Sandy");
        k.getUmur(90);
        k.cetakKakek();
        
        System.out.println("");
        a.getNama("Angga");
        a.getUmur(50);
        a.getPekerjaan("Petani");
        a.cetakAyah();
        
        System.out.println("");
        an.getNama("Andree");
        an.getUmur(18);
        an.getPekerjaan("Mahasiswa");
        an.getJenkel("laki laki");
        System.out.println("Memanggil fungsi dari class parent");
        an.cetakKakek();
        System.out.println("");
        an.cetakAnak();
    }
}
