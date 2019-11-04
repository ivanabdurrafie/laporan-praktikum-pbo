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
public class PermanentEmployee1841720099Rafi extends Employee1841720099Rafi 
        implements IPayable1841720099Rafi {

    private int salary;

    public PermanentEmployee1841720099Rafi(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountRafi() {
        return (int) (salary + 0.05 * salary);
    }

    @Override
    public String getEmployeeInfoRafi() {
        String info = super.getEmployeeInfoRafi() + "\n";
        info += "Registered as permanent employee with salary " + salary 
                + " \n";
        return info;
    }

}
