/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import contactlist.ContactList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hmuhire
 */
public class DAOTextImplIT {
    
    public DAOTextImplIT() {
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
     * Test of load method, of class DAOTextImpl.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        String filename = "";
        DAOTextImpl instance = new DAOTextImpl();
        ContactList result = instance.load("contacts.txt");
        ContactList expResult = result;
        
        assertEquals(expResult, result);
    }


    
}
