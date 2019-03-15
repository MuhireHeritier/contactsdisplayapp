/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class IDisplayableIT {
    
    public IDisplayableIT() {
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
     * Test of display method, of class IDisplayable.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        IDisplayable instance = new IDisplayableImpl();
        instance.display();

    }

    public class IDisplayableImpl implements IDisplayable {

        public void display() {
        }
    }
    
}
