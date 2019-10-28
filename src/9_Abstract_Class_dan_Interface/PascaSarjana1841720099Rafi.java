/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbominggu9.interfacelatihan.multi;


/**
 *
 * @author Ivan Abdurrafie
 */
public class PascaSarjana1841720099Rafi extends Mahasiswa1841720099Rafi 
        implements ICumlaude1841720099Rafi,IBerprestasi1841720099Rafi{
    
    public PascaSarjana1841720099Rafi(String nama) {
        super(nama);
    }

    @Override
    public void menjuraiKompetisirafi() {
        System.out.println("Saya telah menjuarai kompetisi Internasional");
    }

    @Override
    public void membuatPublikasiIlmiahRafi() {
        System.out.println("Saya menerbitkan Artikel di jurnal Internasional");
    }
    
    @Override
    public void lulusRafi() {
        System.out.println("Aku sudah menyelesaikan Tesis");
    }

    @Override
    public void meraihIPKTinggiRafi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
}
