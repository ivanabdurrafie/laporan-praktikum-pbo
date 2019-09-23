/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dependensi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Laptop1841720099Rafi {

    private String mMerk;
    private Processor1841720099Rafi proc;

    public Laptop1841720099Rafi() {
    }

    public Laptop1841720099Rafi(String mMerk, Processor1841720099Rafi mProc) {
        this.mMerk = mMerk;
        this.proc = mProc;
    }

    public String getmMerk() {
        return mMerk;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720099Rafi getProc() {
        return proc;
    }

    public void setProc(Processor1841720099Rafi proc) {
        this.proc = proc;
    }
    

    public void infoRafi(){
        System.out.println("Merk Laptop = "+mMerk);
        proc.infoRafi();
    }
    
    
}
