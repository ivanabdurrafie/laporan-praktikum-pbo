/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segitiga1841720099Rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Segitiga1841720099Rafi {
    private int mSudut;
    
    public int totalSudutRafi(int sudutA){
        return mSudut = 180 - sudutA;
    }
    public int totalSudutRafi(int sudutA, int sudutB){
        return mSudut = 180 - (sudutA+sudutB);
    }
    public int kelilingRafi(int sisiA, int sisiB, int sisiC){
        return sisiA+sisiB+sisiC;
    }
    public double kelilingRafi(int sisiA,int sisiB){
        return Math.sqrt(sisiA*sisiA)+ Math.sqrt(sisiB*sisiB);
    }
}
