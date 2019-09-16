/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigettersetter1841720099rafi;

public class KoperasiDemo1841720099Rafi {

    public static void main(String[] args) {
        Anggota1841720099Rafi anggota = new Anggota1841720099Rafi("Raf","Ponorogo");
        System.out.println("Simpanan " + anggota.getmNamaRafi() + " : Rp " + anggota.getmSimpananRafi());
        
        anggota.setmNamaRafi("Ivan Abdurrafie");
        anggota.setmAlamatRafi("jl. Semen romo no. 9 Ponorogo");
        anggota.setorRafi(100000);
        System.out.println("Simpanan " + anggota.getmNamaRafi() + " : Rp " + anggota.getmSimpananRafi());

        anggota.pinjamRafi(5000);
        System.out.println("Simpanan " + anggota.getmNamaRafi() + " : Rp " + anggota.getmSimpananRafi());
    }

}
