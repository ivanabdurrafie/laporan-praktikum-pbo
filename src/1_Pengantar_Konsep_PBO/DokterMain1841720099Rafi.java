/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dokterspesialis;

/**
 *
 * @author Ivan Abdurrafie
 */
public class DokterMain1841720099Rafi {
    public static void main(String[] args) {
        Dokter1841720099Rafi dok1 = new Dokter1841720099Rafi();
        DokterSpesialis1841720099Rafi dok2 = new DokterSpesialis1841720099Rafi();
        
        dok1.setKodeDokter1841720099Rafi(001);
        dok1.setNamaDokter1841720099Rafi("Andra Andreas");
        dok1.setJenisKelamin1841720099Rafi("Laki-Laki");
        dok1.setAlamat1841720099Rafi("Malang");
        dok1.print1841720099Rafi();
        
        System.out.println("");
        
        dok2.setKodeDokter1841720099Rafi(002);
        dok2.setNamaDokter1841720099Rafi("Indah Permata Sari");
        dok2.setJenisKelamin1841720099Rafi("Perempuan");
        dok2.setAlamat1841720099Rafi("Surabaya");
        dok2.setSpesialis1841720099Rafi("Dokter Kandungan");
        dok2.print1841720099Rafi();
    }
}
