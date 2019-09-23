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
public class Main1841720099Rafi {

    public static void main(String[] args) {
        Pegawai1841720099Rafi masinis = new Pegawai1841720099Rafi("11111", "Ivan Abdurrafie");
        Pegawai1841720099Rafi asisten = new Pegawai1841720099Rafi("22222", "Charles M");
        KeretaApi1841720099Rafi k = new KeretaApi1841720099Rafi("Penataran Baru", "Ekonomi", masinis, asisten);
        System.out.println(k.info());
    }
    
}
