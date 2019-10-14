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
public class Manager1841720099Rafi extends Karyawan1841720099Rafi {
    private double mTunjangan;
    private String mBagian;
    private Staff1841720099Rafi st[];

    public double getmTunjanganRafi() {
        return mTunjangan;
    }

    public void setmTunjanganRafi(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagianRafi() {
        return mBagian;
    }

    public void setmBagianRafi(String mBagian) {
        this.mBagian = mBagian;
    }

    public Staff1841720099Rafi[] getSt() {
        return st;
    }

    public void setStRafi(Staff1841720099Rafi[] st) {
        this.st = st;
    }
    
    public void viewStaffRafi(){
        int i;
        System.out.println("-----------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoRafi();
        }
        System.out.println("-----------------");
    }
    
    public void liatInfoRafi(){
        System.out.println("Manager  : "+this.getmBagianRafi());
        System.out.println("NIP      : "+this.getmNipRafi());
        System.out.println("Nama     : "+this.getmNamaRafi());
        System.out.println("Golongan : "+this.getmGolonganRafi());
        System.out.printf("Tunjangan :%.0f\n",this.getmTunjanganRafi());
        System.out.printf("Gaji      :%.0f\n",this.getmGajiRafi());
        System.out.println("Bagian   : "+this.getmBagianRafi());
        this.viewStaffRafi();
    }

    @Override
    public double getmGajiRafi() {
        return super.getmGajiRafi()+mTunjangan; 
    }
    
}
