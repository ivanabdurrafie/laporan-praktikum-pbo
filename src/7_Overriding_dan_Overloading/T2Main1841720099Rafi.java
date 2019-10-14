/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding1841720099Rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class T2Main1841720099Rafi {

    public static void main(String[] args) {
        Manusia1841720099Rafi manusia = new Manusia1841720099Rafi();
        Dosen1841720099Rafi dosen = new Dosen1841720099Rafi();
        Mahasiswa1841720099Rafi mahasiswa = new Mahasiswa1841720099Rafi();
        
        System.out.println("Manusia");
        manusia.makanRafi();
        manusia.bernafasRafi();
        System.out.println("");
        System.out.println("Dosen");
        dosen.makanRafi();
        dosen.lemburRafi();
        System.out.println("");
        System.out.println("Mahasiswa");
        mahasiswa.makanRafi();
        mahasiswa.tidurRafi();
    }
    
}
