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
public class Karyawan1841720099Rafi {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;
    public String getmNamaRafi() {
        return mNama;
    }
    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }
    public String getmNipRafi() {
        return mNip;
    }
    public void setmNipRafi(String mNip) {
        this.mNip = mNip;
    }
    public String getmGolonganRafi() {
        return mGolongan;
    }
    public void setmGolonganRafi(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public double getmGajiRafi() {
        return mGaji;
    }
    public void setmGajiRafi(double mGaji) {
        this.mGaji = mGaji;
    }
}
