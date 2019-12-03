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
public class TestBackendAnggota1841720099Rafi {
    public static void main(String[] args) {
        Anggota1841720099Rafi ang1 = new Anggota1841720099Rafi("Ivan Abdurrafie", "Ponorogo", "085155265210");
        Anggota1841720099Rafi ang2 = new Anggota1841720099Rafi("Indra Permana", "Malang", "087758293012");
        Anggota1841720099Rafi ang3 = new Anggota1841720099Rafi("Intan Kusuma", "Surabaya", "081392648273");
        
        ang1.saveRafi();
        ang2.saveRafi();
        ang3.saveRafi();

        ang2.setmAlamatRafi("Malang Kota");
        ang2.saveRafi();

        ang3.deleteRafi();

        for (Anggota1841720099Rafi a : new Anggota1841720099Rafi().getAllRafi()) {
            System.out.println("Nama: " + a.getmNamaRafi() + ", Alamat: " + a.getmAlamatRafi()+", Telepon: "+a.getmTeleponRafi());
        }
        System.out.println("\n Search dengan keyword 'Malang' \n");
        for (Anggota1841720099Rafi a : new Anggota1841720099Rafi().searchRafi("Malang")) {
            System.out.println("Nama: " + a.getmNamaRafi() + ", Alamat: " + a.getmAlamatRafi()+", Telepon: "+a.getmTeleponRafi());
        }
    }
}
