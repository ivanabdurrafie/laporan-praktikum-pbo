/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author Ivan Abdurrafie
 */
import backend.*;
public class TestBackend1841720099Rafi {
    public static void main(String[] args) {
        Kategori1841720099Rafi kat1 = new Kategori1841720099Rafi("Novel", "Koleksi buku novel");
        Kategori1841720099Rafi kat2 = new Kategori1841720099Rafi("Referensi", "Buku referensi ilmiah");
        Kategori1841720099Rafi kat3 = new Kategori1841720099Rafi("Komik", "Komik anak-anak");

        kat1.saveRafi();
        kat2.saveRafi();
        kat3.saveRafi();

        kat2.setmKeteranganRafi("Koleksi buku referensi ilmiah");
        kat2.saveRafi();

        kat3.deleteRafi();

        for (Kategori1841720099Rafi k : new Kategori1841720099Rafi().getAllRafi()) {
            System.out.println("Nama: " + k.getmNamaRafi() + ", Ket: " + k.getmKeteranganRafi());
        }
        
        for (Kategori1841720099Rafi k : new Kategori1841720099Rafi().searchRafi("ilmiah")) {
            System.out.println("Nama: " + k.getmNamaRafi() + ", Ket: " + k.getmKeteranganRafi());
        }
    }
}
