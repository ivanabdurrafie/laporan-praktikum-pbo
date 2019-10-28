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
public class P2Rektor1841720099Rafi {
    P2Mahasiswa1841720099Rafi identitas;
    public void beriSertifikatCumlaudeRafi(P2ICumlaude1841720099Rafi mahasiswa){
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri anda .");
        mahasiswa.kuliahDiKampusRafi();
        mahasiswa.lulusRafi();
        mahasiswa.meraihIPKTinggiRafi();
        System.out.println("--------------------------------------------");
    }
}
