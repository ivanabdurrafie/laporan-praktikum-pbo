/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfisme;

/**
 *
 * @author Ivan Abdurrafie
 */
public class InternshipEmployee1841720099Rafi extends Employee1841720099Rafi {

    private int length;

    public InternshipEmployee1841720099Rafi(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfoRafi() {
        String info = super.getEmployeeInfoRafi() + "\n";
        info += "Registered as internship employee for " + length +
                " month/s \n";
        return info;
    }

}
