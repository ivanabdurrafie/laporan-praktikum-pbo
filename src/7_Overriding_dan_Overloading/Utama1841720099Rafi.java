/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan1841720099Rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Utama1841720099Rafi {

    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager dan Staff");
        Manager1841720099Rafi man[] = new Manager1841720099Rafi[2];
        Staff1841720099Rafi staff1[] = new Staff1841720099Rafi[2];
        Staff1841720099Rafi staff2[] = new Staff1841720099Rafi[3];
        
        man[0]=new Manager1841720099Rafi();
        man[0].setmNamaRafi("Tedjo");
        man[0].setmNipRafi("1010");
        man[0].setmGolonganRafi("1");
        man[0].setmTunjanganRafi(5000000);
        man[0].setmBagianRafi("Administrasi");
        
        man[1]=new Manager1841720099Rafi();
        man[1].setmNamaRafi("Atika");
        man[1].setmNipRafi("1011");
        man[1].setmGolonganRafi("1");
        man[1].setmTunjanganRafi(2500000);
        man[1].setmBagianRafi("Pemasaran");
        
        staff1[0] = new Staff1841720099Rafi();
        staff1[0].setmNamaRafi("Usman");
        staff1[0].setmNipRafi("0003");
        staff1[0].setmGolonganRafi("2");
        staff1[0].setmLemburRafi(10);
        staff1[0].setmGajiLemburRafi(10000);
        
        staff1[1] = new Staff1841720099Rafi();
        staff1[1].setmNamaRafi("Anugrah");
        staff1[1].setmNipRafi("0005");
        staff1[1].setmGolonganRafi("2");
        staff1[1].setmLemburRafi(10);
        staff1[1].setmGajiLemburRafi(55000);
        man[0].setStRafi(staff1);
        
        staff2[0] = new Staff1841720099Rafi();
        staff2[0].setmNamaRafi("Hendra");
        staff2[0].setmNipRafi("0004");
        staff2[0].setmGolonganRafi("3");
        staff2[0].setmLemburRafi(15);
        staff2[0].setmGajiLemburRafi(550);
        
        staff2[1] = new Staff1841720099Rafi();
        staff2[1].setmNamaRafi("Arie");
        staff2[1].setmNipRafi("0006");
        staff2[1].setmGolonganRafi("4");
        staff2[1].setmLemburRafi(5);
        staff2[1].setmGajiLemburRafi(100000);
        
        staff2[2] = new Staff1841720099Rafi();
        staff2[2].setmNamaRafi("Mentari");
        staff2[2].setmNipRafi("0007");
        staff2[2].setmGolonganRafi("3");
        staff2[2].setmLemburRafi(6);
        staff2[2].setmGajiLemburRafi(20000);
        man[1].setStRafi(staff2);
        
        man[0].liatInfoRafi();
        man[1].liatInfoRafi();
        
    }
    
}
