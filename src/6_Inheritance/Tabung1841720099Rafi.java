/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan31841720099rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Tabung1841720099Rafi extends Bangun1841720099Rafi{
    protected int mT;
    
    public void setSupermPhiRafi(double mPhi){
        super.mPhi=mPhi;
    }
    public void setSupermRRafi(int mR){
        super.mR=mR;
    }
    public void setmTRafi(int mT){
        this.mT=mT;
    }
    public void volumeRafi(){
        System.out.println("Volume tabung adalah: "+(super.mPhi*super.mR*super.mR*this.mT));
    }
}
