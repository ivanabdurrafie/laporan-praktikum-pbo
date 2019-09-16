/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encapdemo1841720099rafi;

public class EncapDemo1841720099Rafi {

    private String mName;
    private int mAge;

    public String getmNameRafi() {
        return mName;
    }

    public void setmNameRafi(String mName) {
        this.mName = mName;
    }

    public int getmAgeRafi() {
        return mAge;
    }

    public void setmAgeRafi(int mNewAge) {
        if (mNewAge > 30) {
            this.mAge = 30;
        }else if(mNewAge < 18){
            this.mAge = 18;
        } else {
            mAge = mNewAge;
        }
    }

}
