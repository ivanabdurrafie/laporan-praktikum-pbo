/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dokterspesialis;

/**
 *
 * @author Ivan Abdurrafie
 */
public class DokterSpesialis1841720099Rafi extends Dokter1841720099Rafi {
   private String mSpesialis; 
   
   public void setSpesialis1841720099Rafi(String mSpesialis){
       this.mSpesialis = mSpesialis;
   }
   
   public void print1841720099Rafi(){
       super.print1841720099Rafi();
       System.out.println("Spesialis : "+mSpesialis);
   }    
}
