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
public class Tester31841720099Rafi {
    public static void main(String[] args) {
        PermanentEmployee1841720099Rafi pEmp = new PermanentEmployee1841720099Rafi("Dedik", 500);
        InternshipEmployee1841720099Rafi iEmp = new InternshipEmployee1841720099Rafi("Sunarto", 5);
        ElectricityBill1841720099Rafi eBill = new ElectricityBill1841720099Rafi(5, "A-1");
        Employee1841720099Rafi e[] = {pEmp,iEmp};
        IPayable1841720099Rafi p[] = {pEmp,eBill};
        Employee1841720099Rafi e2[] = {pEmp,iEmp};
    }
}
