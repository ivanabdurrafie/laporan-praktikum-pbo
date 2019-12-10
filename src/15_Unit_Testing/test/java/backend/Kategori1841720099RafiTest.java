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
public class Kategori1841720099RafiTest extends TestCase{

    Kategori1841720099Rafi instance;

    public Kategori1841720099RafiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720099Rafi("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchRafi() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720099Rafi> result = instance.searchRafi(keyword);
        ArrayList<Kategori1841720099Rafi> expResult = instance.getByNamaAndKeteranganRafi(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveRafi() {
        System.out.println("save test");
        this.instance.saveRafi();
        ArrayList<Kategori1841720099Rafi> expResult = instance.getByNamaAndKeteranganRafi(instance.getmNamaRafi(), instance.getmKeteranganRafi());
        assertTrue(expResult.size()>0);
    }

}
