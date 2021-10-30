/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessServices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class BusinessServicesTest {

    public BusinessServicesTest() {
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
     * Test of authenticate method, of class BusinessServices.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String username = "test";
        String password = "test";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.authenticate(username, password);
        assertEquals(true, result);
        username = "fsgdg";
        password = "fgfdg";
        result = instance.authenticate(username, password);
        assertEquals(false, result);
    }

    /**
     * Test of checkUsername method, of class BusinessServices.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "test";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(true, result);
    }

    /**
     * Test of checkEmail method, of class BusinessServices.
     */
    @Test
    public void testCheckEmail() {
        System.out.println("checkEmail");
        String email = "pssdilshan1996@gmail.com";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.checkEmail(email);
        assertEquals(true, result);
    }

    /**
     * Test of addCustomerToLogin method, of class BusinessServices.
     */
    @Test
    public void testAddCustomerToLogin() {
        System.out.println("addCustomerToLogin");
        String email = "pssdilshan1996@gmail.com";
        String username = "sandun";
        String password = "sandun";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.addCustomerToLogin(email, username, password);
        assertEquals(true, result);
        result = instance.searchCustomer(username);
        assertEquals(true, result);
    }

    /**
     * Test of searchCustomer method, of class BusinessServices.
     */
    @Test
    public void testSearchCustomer() {
        System.out.println("searchCustomer");
        String email = "sandun";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.searchCustomer(email);
        assertEquals(true, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDocEmail method, of class BusinessServices.
     */
    @Test
    public void testCheckDocEmail() {
        System.out.println("checkDocEmail");
        String email = "testDocone@gmail.com";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.checkDocEmail(email);
        assertEquals(true, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocToLogin method, of class BusinessServices.
     */
    @Test
    public void testAddDocToLogin() {
        System.out.println("addDocToLogin");
        String docName = "sandun";
        String email = "pssdilshan1996@gmail.com";
        String phone = "0719202275";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.addDocToLogin(docName, email, phone);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkDocUsername method, of class BusinessServices.
     */
    @Test
    public void testCheckDocUsername() {
        System.out.println("checkDocUsername");
        String docName = "sandun";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.checkDocUsername(docName);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of addAppointment method, of class BusinessServices.
     */
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        String User = "sandun";
        String Date = "2021-10-30";
        String Time = "10:30";
        String Doctor = "testDocone";
        Float Payment = null;
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.addAppointment(User, Date, Time, Doctor, Payment);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of deletetheCustomer method, of class BusinessServices.
     */
    @Test
    public void testDeletetheCustomer() {
        System.out.println("deletetheCustomer");
        String username = "";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.deletetheCustomer(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatetheCustomer method, of class BusinessServices.
     */
    @Test
    public void testUpdatetheCustomer() {
        System.out.println("updatetheCustomer");
        String address = "";
        String nic = "";
        String email = "";
        String phone = "";
        String gender = "";
        String dob = "";
        String bloodType = "";
        String joinedDate = "";
        String emerContact = "";
        String username = "";
        BusinessServices instance = new BusinessServices();
        Boolean expResult = null;
        Boolean result = instance.updatetheCustomer(address, nic, email, phone, gender, dob, bloodType, joinedDate, emerContact, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDoctor method, of class BusinessServices.
     */
    @Test
    public void testDeleteDoctor() {
        System.out.println("deleteDoctor");
        String email = "";
        BusinessServices instance = new BusinessServices();
        boolean expResult = false;
        boolean result = instance.deleteDoctor(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatetheDoctor method, of class BusinessServices.
     */
    @Test
    public void testUpdatetheDoctor() {
        System.out.println("updatetheDoctor");
        String email = "";
        String docName = "";
        String phone = "";
        BusinessServices instance = new BusinessServices();
        Boolean expResult = null;
        Boolean result = instance.updatetheDoctor(email, docName, phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAppointment method, of class BusinessServices.
     */
    @Test
    public void testDeleteAppointment() {
        System.out.println("deleteAppointment");
        String username = "";
        BusinessServices instance = new BusinessServices();
        boolean expResult = true;
        boolean result = instance.deleteAppointment(username);
        assertEquals(true, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of updatetheAppointment method, of class BusinessServices.
     */
    @Test
    public void testUpdatetheAppointment() {
        System.out.println("updatetheAppointment");
        String username = "";
        String Time = "";
        String Payment = "";
        BusinessServices instance = new BusinessServices();
        Boolean expResult = null;
        Boolean result = instance.updatetheAppointment(username, Time, Payment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
