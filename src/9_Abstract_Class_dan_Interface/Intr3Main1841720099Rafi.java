/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbominggu9.interfacelatihan.multi;


/**
 *
 * @author Ivan Abdurrafie
 */
public class Intr3Main1841720099Rafi {

    public static void main(String[] args) {
        Rektor1841720099Rafi rektor = new Rektor1841720099Rafi();
//        Mahasiswa1841720099Rafi mahasiswaBiasa = new Mahasiswa1841720099Rafi("Charlie");
        Sarjana1841720099Rafi sarjanaCumlaude = new Sarjana1841720099Rafi("Dini");
        PascaSarjana1841720099Rafi masterCumlaude = new PascaSarjana1841720099Rafi("Elok");
        
//        rektor.beriSertifikatCumlaudeRafi(mahasiswaBiasa);
//        rektor.beriSertifikatCumlaudeRafi(sarjanaCumlaude);
//        rektor.beriSertifikatCumlaudeRafi(masterCumlaude);

        rektor.beriSertifikatMawapres(sarjanaCumlaude);
        rektor.beriSertifikatMawapres(masterCumlaude);
    }
}
