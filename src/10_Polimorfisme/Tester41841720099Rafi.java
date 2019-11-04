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
public class Tester41841720099Rafi {
    public static void main(String[] args) {
        Owner1841720099Rafi ow = new Owner1841720099Rafi();
        ElectricityBill1841720099Rafi eBill = 
                new ElectricityBill1841720099Rafi(5, "R-1");
        ow.payRafi(eBill);
        System.out.println("-----------------------------------");
        
        PermanentEmployee1841720099Rafi pEmp = 
                new PermanentEmployee1841720099Rafi("Dedik", 500);
        ow.payRafi(pEmp);
        System.out.println("-----------------------------------");
        
        InternshipEmployee1841720099Rafi iEmp = 
                new InternshipEmployee1841720099Rafi("Sunarto", 5);
        ow.showMyEmployeeRafi(pEmp);
        System.out.println("-----------------------------------");
        ow.showMyEmployeeRafi(iEmp);
    }
}
