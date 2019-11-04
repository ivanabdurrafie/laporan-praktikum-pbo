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
public class Tester21841720099Rafi {
    public static void main(String[] args) {
        PermanentEmployee1841720099Rafi pEmp = 
                new PermanentEmployee1841720099Rafi("Dedik", 500);
        Employee1841720099Rafi e;
        e = pEmp;
        System.out.println(""+ e.getEmployeeInfoRafi());
        System.out.println("--------------------------");
        System.out.println(""+pEmp.getEmployeeInfoRafi());
    }
}
