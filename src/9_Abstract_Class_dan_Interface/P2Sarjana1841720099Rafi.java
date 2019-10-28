/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbominggu9.interfacelatihan;

/**
 *
 * @author Ivan Abdurrafie
 */
public class P2Sarjana1841720099Rafi extends P2Mahasiswa1841720099Rafi implements  P2ICumlaude1841720099Rafi{

    public P2Sarjana1841720099Rafi(String nama) {
        super(nama);
    }

    @Override
    public void lulusRafi() {
        System.out.println("AKu sudah Menyelesaikan Skripsi");
    }

    @Override
    public void meraihIPKTinggiRafi() {
        System.out.println("IPK-ku Lebih dari 3,51");
    }
    
}
