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
public class Processor1841720099Rafi {

    private String mMerk;
    private double mCache;

    public Processor1841720099Rafi() {
    }

    public Processor1841720099Rafi(String mMerk, double cache) {
        this.mMerk = mMerk;
        this.mCache = cache;
    }

    public String getmMerkRafi() {
        return mMerk;
    }

    public void setmMerkRafi(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getCacheRafi() {
        return mCache;
    }

    public void setCacheRafi(double cache) {
        this.mCache = cache;
    }

    public void infoRafi() {
        System.out.printf("Merk Processor = %s\n ", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}
