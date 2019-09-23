/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerbong1841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Main1841720099Rafi {

    public static void main(String[] args) {
        Penumpang1841720099Rafi p = new Penumpang1841720099Rafi("11111", "Ivan Abdurrafie");
        Gerbong1841720099Rafi g = new Gerbong1841720099Rafi("A", 10);
        g.setPenumpang(p, 1);
        System.out.println(g.info());
    }
    
}
