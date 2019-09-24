/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toko1841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class MainToko1841720099Rafi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota1841720099Rafi anggota = new Anggota1841720099Rafi("P1", "Rafi", "Malang", "087759926293");
        Barang1841720099Rafi barang = new Barang1841720099Rafi("B1", "Shampoo", 17000);
        Transaksi1841720099Rafi transaksi = new Transaksi1841720099Rafi("T1", "23 September 2019", anggota);
        DetailTransaksi1841720099Rafi detail = new DetailTransaksi1841720099Rafi(transaksi, barang, 5);
        detail.infoDetailRafi();
        transaksi.infoTransaksiRafi();
        anggota.infoAnggotaRafi();
        System.out.println(detail.infoDetailRafi());
    }
    
}
