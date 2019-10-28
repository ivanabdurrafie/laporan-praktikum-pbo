/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbominggu9.interfacelatihan;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Intr2Main1841720099Rafi {

    public static void main(String[] args) {
        P2Rektor1841720099Rafi rektor = new P2Rektor1841720099Rafi();
        P2Mahasiswa1841720099Rafi mahasiswaBiasa = new P2Mahasiswa1841720099Rafi("Charlie");
        P2Sarjana1841720099Rafi sarjanaCumlaude = new P2Sarjana1841720099Rafi("Dini");
        P2PascaSarjana1841720099Rafi masterCumlaude = new P2PascaSarjana1841720099Rafi("Elok");
        
        rektor.beriSertifikatCumlaudeRafi(sarjanaCumlaude);
        rektor.beriSertifikatCumlaudeRafi(masterCumlaude);
    }
    
}
