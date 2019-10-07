/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

/**
 *
 * @author Ivan Abdurrafie
 */
public class P1ClassB1841720099Rafi extends P1ClassA1841720099Rafi {
    public int z;
    
    public void getNilaiZRafi(){
        System.out.println("Nilai Z : "+z);
    }
    public void getJumlahZRafi(){
        System.out.println("Jumlah : "+ (super.x+super.y+z));
        
    }
}   

