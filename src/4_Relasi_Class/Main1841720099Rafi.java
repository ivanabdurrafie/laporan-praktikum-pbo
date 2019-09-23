/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pelanggan;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Main1841720099Rafi {

    public static void main(String[] args) {
        Mobil1841720099Rafi m = new Mobil1841720099Rafi();
        Sopir1841720099Rafi s = new Sopir1841720099Rafi();
        Pelanggan1841720099Rafi p = new Pelanggan1841720099Rafi();

        m.setmNamaRafi("Avanza");
        m.setmBiayaRafi(350000);
        s.setmNamaRafi("Budi");
        s.setmBiayaRafi(200000);
        p.setmNamaRafi("Ivan Abdurrafie");
        p.setMobilRafi(m);
        p.setSopirRafi(s);
        p.setmHariRafi(2);
        System.out.println("Merk Mobil : "+m.getmNamaRafi());
        System.out.println("Harga Sewa Mobil Perhari  : "+m.getmBiayaRafi());
        System.out.println("Nama Sopir : "+s.getmNamaRafi());
        System.out.println("Harga Sewa sopir perhari : "+s.getmBiayaRafi());
        System.out.println("Jumlah Hari : "+p.getmHariRafi());
        System.out.println("Nama Penyewa : "+p.getmNamaRafi());
        System.out.println("Biaya Total : " + p.hitungBiayaTotalRafi());
    }

}
