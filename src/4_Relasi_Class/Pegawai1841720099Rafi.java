/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.keretaapi1841720099;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Pegawai1841720099Rafi {
    private String mNIP;
    private String mNama;

    public Pegawai1841720099Rafi(String mNIP, String mNama) {
        this.mNIP = mNIP;
        this.mNama = mNama;
    }

    public String getmNIPRafi() {
        return mNIP;
    }

    public void setmNIPRafi(String mNIP) {
        this.mNIP = mNIP;
    }

    public String getmNamaRafi() {
        return mNama;
    }

    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }
    
    public String infoRafi(){
        String info = "";
        info += "NIP : "+this.mNIP+"\n";
        info += "Nama : "+this.mNama+"\n";
        return info;
    }
    
}
