/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keretaapi1841720099;

/**
 *
 * @author Ivan Abdurrafie
 */
public class MainPertanyaan1841720099Rafi {

    public static void main(String[] args) {
        Pegawai1841720099Rafi masinis = new Pegawai1841720099Rafi("1234", "Spombob");
        KeretaApi1841720099Rafi kereta = new KeretaApi1841720099Rafi("Gajayana", "Ekonomi", masinis);
        System.out.println(kereta.info());
        
    }
    
}
