/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan1841720099Rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Staff1841720099Rafi extends Karyawan1841720099Rafi {
    private int mLembur;
    private double mGajiLembur;

    public int getmLemburRafi() {
        return mLembur;
    }

    public void setmLemburRafi(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getmGajiLemburRafi() {
        return mGajiLembur;
    }

    public void setmGajiLemburRafi(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiRafi(int mLembur, double mGajiLembur){
        return super.getmGajiRafi()+mLembur*mGajiLembur;
    }

    @Override
    public double getmGajiRafi() {
        return super.getmGajiRafi()+mLembur*mGajiLembur; 
    }
    
    public void lihatInfoRafi(){
        System.out.println("NIP          : "+this.getmNipRafi());
        System.out.println("Nama         : "+this.getmNamaRafi());
        System.out.println("Golongan     : "+this.getmGolonganRafi());
        System.out.println("Jml Lembur   : "+this.getmLemburRafi());
        System.out.printf("Gaji Lembur   :%.0f\n",this.getmGajiLemburRafi());
        System.out.printf("Gaji          :%.0f\n",this.getmGajiRafi());
    }
    
    
    

    
    
    
}
