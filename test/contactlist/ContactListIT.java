/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import model.Contact;
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
public class ContactListIT {
    
    public ContactListIT() {
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
     * Test of getHead method, of class ContactList.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        ContactList instance = new ContactList();
        Node<Contact> expResult = instance.getHead();
        Node<Contact> result = instance.getHead();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHead method, of class ContactList.
     */
    @Test
    public void testSetHead() {
        System.out.println("setHead");
        Node<Contact> head = null;
        ContactList instance = new ContactList();
        instance.setHead(head);
    }

    /**
     * Test of setnextItem method, of class ContactList.
     */
    @Test
    public void testSetnextItem() {
        System.out.println("setnextItem");
        Node<Contact> c = null;
        ContactList instance = new ContactList();
        instance.setnextItem(c);
    }

    /**
     * Test of getSize method, of class ContactList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ContactList instance = new ContactList();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class ContactList.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ContactList instance = new ContactList();
        instance.setSize(size);
    }

    /**
     * Test of insertContact method, of class ContactList.
     */
    @Test
    public void testInsertContact() {
        System.out.println("insertContact");
        Contact contact = null;
        ContactList instance = new ContactList();
        instance.insertContact(contact);
    }

    /**
     * Test of removeContact method, of class ContactList.
     */
    @Test
    public void testRemoveContact() {
        System.out.println("removeContact");
        String fname = "";
        ContactList instance = new ContactList();
        instance.removeContact(fname);
    }

    /**
     * Test of searchByTelephone method, of class ContactList.
     */
    @Test
    public void testSearchByTelephone() {
        System.out.println("searchByTelephone");
        String telephone = "";
        ContactList instance = new ContactList();
        instance.searchByTelephone(telephone);
    }

    /**
     * Test of searchByName method, of class ContactList.
     */
    @Test
    public void testSearchByName() {
        System.out.println("searchByName");
        String name = "";
        ContactList instance = new ContactList();
        instance.searchByName(name);
    }

    /**
     * Test of print method, of class ContactList.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        ContactList instance = new ContactList();
        instance.print();
    }
    
}
