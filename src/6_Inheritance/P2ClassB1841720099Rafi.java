/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan21841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class P2ClassB1841720099Rafi extends  P2ClassA1841720099Rafi{
    private int mZ;
    public void setmZRafi(int mZ) {
        this.mZ = mZ;
    }
    public void getmZRafi() {
        System.out.println("Nilai Z : "+ mZ);
    }   
    public void getJumlahRafi(){
        System.out.println("Jumlah : "+ (super.getmX()+super.getmY()+mZ));
    }
}
