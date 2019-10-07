/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan61841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Inheritance11841720099Rafi {
    public static void main(String[] args) {
         StaffTetap1841720099Rafi ST = new StaffTetap1841720099Rafi("Budi", "Malang", "Laki-Laki",
                 20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetapRafi();
        
        StaffHarian1841720099Rafi SH = new StaffHarian1841720099Rafi("Indah", "Malang", "Perempuan",
                27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarianRafi();        
    }
    
}
