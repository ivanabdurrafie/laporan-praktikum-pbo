/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbominggu9;

import com.mycompany.pbominggu9.abstractclass.Hewan1841720099Rafi;
import com.mycompany.pbominggu9.abstractclass.Ikan1841720099Rafi;
import com.mycompany.pbominggu9.abstractclass.Kucing1841720099Rafi;
import com.mycompany.pbominggu9.abstractclass.Orang1841720099Rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class PboMain1841720099Rafi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing1841720099Rafi kucing = new Kucing1841720099Rafi();
        Ikan1841720099Rafi ikan = new Ikan1841720099Rafi();
        Orang1841720099Rafi ani = new Orang1841720099Rafi("Ani");
        Orang1841720099Rafi budi = new Orang1841720099Rafi("Budi");
        Orang1841720099Rafi rafi = new Orang1841720099Rafi("rafi");
        Hewan1841720099Rafi burung = new Hewan1841720099Rafi() {
            @Override
            public void bergerakRafi() {
                System.out.println("Terbang");
            }
        };
        
        ani.peliharaHewanRafi(kucing);
        budi.peliharaHewanRafi(ikan);
        rafi.peliharaHewanRafi(burung);
       
        ani.ajakPeliharaanJalanJalanRafi();
        budi.ajakPeliharaanJalanJalanRafi();
        rafi.ajakPeliharaanJalanJalanRafi();           
    }
}
