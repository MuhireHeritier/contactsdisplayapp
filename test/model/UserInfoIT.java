/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.UserImplPart1;
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
public class UserInfoIT {
    UserImplPart1 newUserInfo = new UserImplPart1(101,"Muhire",23, 3, "Rwandan");
    
    public UserInfoIT() {
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
     * Test of getStudentId method, of class UserImplPart1.
     */
    @Test
    public void testStudentId() {
        System.out.println("studentId");
        UserImplPart1 instance = newUserInfo;
        int expResult = 101;
        int result = instance.getStudentId();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setStudentId method, of class UserImplPart1.
     */
    @Test
    public void testSetStudentId() {
        System.out.println("setStudentId");
        int studentId = 101;
        UserImplPart1 instance = newUserInfo;
        instance.setStudentId(studentId);
        
    }

    /**
     * Test of getName method, of class UserImplPart1.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserImplPart1 instance = newUserInfo;
        String expResult = "Muhire";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class UserImplPart1.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Muhire";
        UserImplPart1 instance = newUserInfo;
        instance.setName(name);
        
    }
    /**
     * Test of getAge method, of class UserImplPart1.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        UserImplPart1 instance = newUserInfo;
        int expResult = 23;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAge method, of class UserImplPart1.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 23;
        UserImplPart1 instance = newUserInfo;
        instance.setAge(age);
        
    }

     /**
     * Test of getSchoolYear method, of class UserImplPart1.
     */
    @Test
    public void testGetSchoolYear() {
        System.out.println("getSchoolYear");
        UserImplPart1 instance = newUserInfo;
        int expResult = 3;
        int result = instance.getSchoolYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSchoolYear method, of class UserImplPart1.
     */
    @Test
    public void testSetSchoolYear() {
        System.out.println("setSchoolYear");
        int schoolYear = 3;
        UserImplPart1 instance = newUserInfo;
        instance.setSchoolYear(schoolYear);
        
    }

    /**
     * Test of getNationality method, of class UserImplPart1.
     */
    @Test
    public void testGetNationality() {
        System.out.println("getNationality");
        UserImplPart1 instance = newUserInfo;
        String expResult = "Rwandan";
        String result = instance.getNationality();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNationality method, of class UserImplPart1.
     */
    @Test
    public void testSetNationality() {
        System.out.println("setNationality");
        String nationality = "Rwandan";
        UserImplPart1 instance = newUserInfo;
        instance.setNationality(nationality);
        
    }

    /**
     * Test of display method, of class UserImplPart1.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        UserImplPart1 instance = newUserInfo;
        instance.display();
        
    }

   
}
