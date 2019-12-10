/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Anggota1841720099RafiTest extends TestCase {
    Anggota1841720099Rafi instance;
    public Anggota1841720099RafiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new Anggota1841720099Rafi("Rafi", "Malang", "911");
        System.out.format("Start Testing : %s \n", instance.getmNamaRafi());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getmNamaRafi());
    }

    
    @Test
    public void testSearchRafi() {
       System.out.println("search test");
        String keyword = "Rafi";
        ArrayList<Anggota1841720099Rafi> result = instance.searchRafi(keyword);
        ArrayList<Anggota1841720099Rafi> expResult = instance.getByNamaAlamatAndTeleponRafi(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveRafi() {
        System.out.println("save test");
        instance.saveRafi();
        ArrayList<Anggota1841720099Rafi> expResult = instance.getByNamaAlamatAndTeleponRafi(instance.getmNamaRafi(), instance.getmAlamatRafi(), instance.getmTeleponRafi());
        assertTrue(expResult.size() > 0);
    }

    
}
