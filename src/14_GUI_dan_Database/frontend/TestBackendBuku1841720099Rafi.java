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
public class TestBackendBuku1841720099Rafi {
    public static void main(String[] args) {
       Kategori1841720099Rafi agama = new Kategori1841720099Rafi().getByIdRafi(17);
       Kategori1841720099Rafi fabel = new Kategori1841720099Rafi().getByIdRafi(16);
//       Buku1841720099Rafi buku1 = new Buku1841720099Rafi(agama, "25 Cerita Nabi dan Rasul", "gramed", "gramed");
//       Buku1841720099Rafi buku2 = new Buku1841720099Rafi(agama, "Tata cara sholat", "Kementrian Agama", "erlangga");
//       Buku1841720099Rafi buku3 = new Buku1841720099Rafi(fabel, "kancil dan pak tani", "gramed", "gramed");
//
//        buku1.saveRafi();
//        buku2.saveRafi();
//        buku3.saveRafi();
//
//        buku2.setmPenulis("Kementrian Agama Islam");
//        buku2.saveRafi();
//
//        buku3.deleteRafi();

        for (Buku1841720099Rafi b : new Buku1841720099Rafi().getAllRafi()) {
            System.out.println("Kategori: " + b.getmKategori().getmNamaRafi()+ ", Judul: " + b.getmJudul());
        }
        
        for (Buku1841720099Rafi b : new Buku1841720099Rafi().searchRafi("Nabi")) {
            System.out.println("Kategori: " + b.getmKategori().getmNamaRafi()+ ", Judul: " + b.getmJudul());
        }
    }
}
