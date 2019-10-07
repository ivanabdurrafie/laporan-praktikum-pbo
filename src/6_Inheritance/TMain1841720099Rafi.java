/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tkomp1841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class TMain1841720099Rafi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mac1841720099Rafi m = new Mac1841720099Rafi("Macbook Pro 2019", 5000, 8096, "17 9400", "Litium", "Avira");
        m.tampilMacRafi();
        
        Windows1841720099Rafi w = new Windows1841720099Rafi("HP Omen", 6100, 20000, "Ryzen 9",
                "Lion", "Defender");
        w.tampilWindowsRafi();
    }
    
}
