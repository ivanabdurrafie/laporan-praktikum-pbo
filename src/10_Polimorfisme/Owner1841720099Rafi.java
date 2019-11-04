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
public class Owner1841720099Rafi {
    public void payRafi(IPayable1841720099Rafi p){
        System.out.println("Total Payment = "+p.getPaymentAmountRafi());
        if (p instanceof PermanentEmployee1841720099Rafi) {
            PermanentEmployee1841720099Rafi pe = (PermanentEmployee1841720099Rafi) p;
            pe.getEmployeeInfoRafi();
            System.out.println(""+pe.getEmployeeInfoRafi());
        }
    }
    
    public void showMyEmployeeRafi(Employee1841720099Rafi e){
        System.out.println(""+e.getEmployeeInfoRafi());
        if (e instanceof PermanentEmployee1841720099Rafi) {
            System.out.println("Yo have to pay her/him monthly!!");
        }else
            System.out.println("No need to pay her/him :)");
    }
}
