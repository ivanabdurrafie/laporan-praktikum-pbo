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
public class TestBackendPeminjaman1841720099Rafi {
    public static void main(String[] args) {
//       Anggota1841720099Rafi agt = new Anggota1841720099Rafi().getByIdRafi(8);
//        Buku1841720099Rafi TimunMas = new Buku1841720099Rafi().getByIdRafi(9);
//        Peminjaman1841720099Rafi peminjaman1 = new Peminjaman1841720099Rafi(agt, TimunMas, "2019/12/26", "2019/12/28");
//        peminjaman1.saveRafi();
        for (Peminjaman1841720099Rafi p : new Peminjaman1841720099Rafi().getAllRafi()) {
            System.out.println("Nama Peminjam : " + p.getmAnggota().getmNamaRafi()+ "\n"
                    + "Nama Buku : " + p.getmBuku().getmJudul()+ "\n"
                    + "Tanggal Pinjam: " + p.getmTanggalPinjam()+ "\n"
                    + "Tanggal Kembali: " + p.getmTanggalKembali());
        }
    }
}
