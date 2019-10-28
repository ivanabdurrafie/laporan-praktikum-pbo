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
public class Rektor1841720099Rafi {
    Mahasiswa1841720099Rafi identitas;
    public void beriSertifikatCumlaudeRafi(ICumlaude1841720099Rafi mahasiswa){
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri anda .");
//        mahasiswa.kuliahDiKampusRafi();
        mahasiswa.lulusRafi();
        mahasiswa.meraihIPKTinggiRafi();
        System.out.println("--------------------------------------------");
    }
    public void beriSertifikatMawapres(IBerprestasi1841720099Rafi mahasiswa){
        System.out.println("Saya rektor, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda Bisa Berprestasi?");
        mahasiswa.menjuraiKompetisirafi();
        mahasiswa.membuatPublikasiIlmiahRafi();
        System.out.println("------------------------------------------");
    }
}
