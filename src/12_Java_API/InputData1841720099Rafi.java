/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafi.percobaan4;

/**
 *
 * @author Ivan Abdurrafie
 */
import java.util.ArrayList;
public class InputData1841720099Rafi {
    ArrayList<Mahasiswa1841720099Rafi> ListMahasiswa;

    public InputData1841720099Rafi() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataRafi(String Nim, String Nama, String Alamat){
        Mahasiswa1841720099Rafi mhs = new Mahasiswa1841720099Rafi(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720099Rafi> getDataRafi(){
        return ListMahasiswa;
    }
}
