/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dependensi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class MainPercobaan11841720099Rafi {

    public static void main(String[] args) {
        Processor1841720099Rafi p = new Processor1841720099Rafi("Intel i5", 3);
        Laptop1841720099Rafi l = new Laptop1841720099Rafi("Thinkpad", p);
        l.infoRafi();
        Processor1841720099Rafi p1 = new Processor1841720099Rafi();
        Laptop1841720099Rafi l1 = new Laptop1841720099Rafi();
        p1.setmMerkRafi("Intel i5");
        p1.setCacheRafi(4);
        l1.setmMerk("Thinkpad");
        l1.setProc(p1);
        l1.infoRafi();

    }

}
