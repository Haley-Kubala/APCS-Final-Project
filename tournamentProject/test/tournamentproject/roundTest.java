/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentproject;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kubala.Haley17
 */
public class roundTest {
    
    public roundTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of bracketSize method, of class round.
     */
    @Test
    public void testBracketSize() {
        System.out.println("bracketSize");
        int size = 0;
        ArrayList<competitor> c = new ArrayList<>();
        round instance = new round(c, size);
        int expResult = 0;
        int result = instance.bracketSize(size);
        assertEquals(expResult, result);
        assertEquals(8, instance.bracketSize(5));
        assertEquals(16, instance.bracketSize(9));
        assertEquals(32, instance.bracketSize(32));
        assertEquals(128, instance.bracketSize(66));
        assertEquals(2, instance.bracketSize(2));
        
    }

    
    /**
     * Test of runRound method, of class round.
     */
    /*
    @Test
    public void testRunRound() {
        System.out.println("runRound");
        round instance = null;
        instance.runRound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
    
}
