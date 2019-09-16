/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasi1841720099rafi;

import java.util.Scanner;

/**
 *
 * @author Ivan Abdurrafie
 */
public class KoperasiMain1841720099Rafi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String name = sc.nextLine();
        System.out.print("Masukkan KTP : ");
        int ktp = scint.nextInt();
        System.out.print("Masukkan Limit Pinjaman : ");
        int limit = scint.nextInt();
        Koperasi1841720099Rafi koperasi = new Koperasi1841720099Rafi(ktp, name, limit);

        System.out.println("Nama Anggota : " + koperasi.getmNamaRafi());
        System.out.println("Limit Pinjaman : " + koperasi.getmLimitRafi());

        boolean loop = true;

        while (loop) {
            System.out.println("1. Pinjaman");
            System.out.println("2. Angsuran");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = scint.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah Pinjaman : ");
                    int p = scint.nextInt();
                    koperasi.setmPinjamanRafi(p);
                    System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getmPinjamanRafi());
                    break;
                case 2:
                    System.out.println("Masukkan Jumlah Angsuran");
                    int a = scint.nextInt();
                    koperasi.setmAngsuranRafi(a);
                    System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getmPinjamanRafi());
                    break;
                default:
                    loop=false;
                    break;
            }
        }

//        System.out.println("\n Pinjam uang 11.000.000");
//        koperasi.setmPinjamanRafi(11000000);
//        System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getmPinjamanRafi());
//
//        System.out.println("\n Pinjam uang 7.000.000");
//        koperasi.setmPinjamanRafi(7000000);
//        System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getmPinjamanRafi());
//
//        System.out.println("\n Membayar angsuran 600.000");
//        koperasi.setmAngsuranRafi(6000);
//        System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getmPinjamanRafi());
//        
//        System.out.println("\n Membayar angsuran 800.000");
//        koperasi.setmAngsuranRafi(800000);
//        System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getmPinjamanRafi());
    }
}
