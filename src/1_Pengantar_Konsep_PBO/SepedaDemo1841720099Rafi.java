/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo;

/**
 *
 * @author Ivan Abdurrafie
 */
public class SepedaDemo1841720099Rafi {
    public static void main(String[] args) {
        Sepeda1841720099Rafi sp1 = new Sepeda1841720099Rafi();
        Sepeda1841720099Rafi sp2 = new Sepeda1841720099Rafi();
        SepedaGunung1841720099Rafi sp3 = new SepedaGunung1841720099Rafi();
        
        sp1.setMerekRafi("Baymax");
        sp1.gantiGearRafi(2);
        sp1.tambahKecepatanRafi(20);
        sp1.setWarnaRafi("Merah");
        sp1.cetakStatusRafi();
        System.out.println("");
        
        sp2.setMerekRafi("Win Sikel");
        sp2.gantiGearRafi(2);
        sp2.tambahKecepatanRafi(20);
        sp2.remRafi(10);
        sp2.setWarnaRafi("Hitam");
        sp2.cetakStatusRafi();
        System.out.println("");
        
        sp3.setMerekRafi("Klinee");
        sp3.tambahKecepatanRafi(5);
        sp3.gantiGearRafi(3);
        sp3.setTipeSuspensiRafi("Gas Suspension");
        sp3.setWarnaRafi("Biru");
        sp3.cetakStatusRafi();
    }
}
