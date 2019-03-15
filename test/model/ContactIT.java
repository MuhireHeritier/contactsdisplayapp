/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Contact;
import java.util.Calendar;
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
public class ContactIT {
    Contact contactObject = new Contact("Heritier", "Muhire", "+23054746061",
                "hmuhir200@gcu.ac.uk", "Business");
    public ContactIT() {
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
     * Test of getFirstName method, of class Contact.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Contact instance = contactObject;
        String expResult = "Heritier";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFirstName method, of class Contact.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Heritier";
        Contact instance = contactObject;
        instance.setFirstName(firstName);
     
    }

    /**
     * Test of getLastName method, of class Contact.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Contact instance = contactObject;
        String expResult = "Muhire";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLastName method, of class Contact.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Muhire";
        Contact instance = contactObject;
        instance.setLastName(lastName);
        
    }

    /**
     * Test of getTelephoneNumber method, of class Contact.
     */
    @Test
    public void testGetTelephoneNumber() {
        System.out.println("getTelephoneNumber");
        Contact instance = contactObject;
        String expResult = "+23054746061";
        String result = instance.getTelephoneNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTelephoneNumber method, of class Contact.
     */
    @Test
    public void testSetTelephoneNumber() {
        System.out.println("setTelephoneNumber");
        String telephoneNumber = "+23054746061";
        Contact instance = contactObject;
        instance.setTelephoneNumber(telephoneNumber);
        
    }

    /**
     * Test of getEmail method, of class Contact.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Contact instance = contactObject;
        String expResult = "hmuhir200@gcu.ac.uk";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmail method, of class Contact.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "hmuhir200@gcu.ac.uk";
        Contact instance = contactObject;
        instance.setEmail(email);
      
    }

    /**
     * Test of getDateCreated method, of class Contact.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        //Calendar now = Calendar.getInstance(); 
        Contact instance = contactObject;
        Calendar expResult = instance.getDateCreated();
        Calendar result = instance.getDateCreated();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getContactType method, of class Contact.
     */
    @Test
    public void testGetContactType() {
        System.out.println("getContactType");
        Contact instance = contactObject;
        String expResult = "Business";
        String result = instance.getContactType();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setContactType method, of class Contact.
     */
    @Test
    public void testSetContactType() {
        System.out.println("setContactType");
        String contactType = "Business";
        Contact instance = contactObject;
        instance.setContactType(contactType);
      
    }

    

    /**
     * Test of display method, of class Contact.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Contact instance = contactObject;
        instance.display();
        
    }
    
}
