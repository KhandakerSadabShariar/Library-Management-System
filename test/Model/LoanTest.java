
package Model;

import Model.Loan;
import Model.Staff;
import Model.Book;
import Model.Borrower;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LoanTest {
    
    public LoanTest() {
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
     * Test of getBook method, of class Loan.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        Loan instance = null;
        Book expResult = null;
        Book result = instance.getBook();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getIssuer method, of class Loan.
     */
    @Test
    public void testGetIssuer() {
        System.out.println("getIssuer");
        Loan instance = null;
        Staff expResult = null;
        Staff result = instance.getIssuer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReceiver method, of class Loan.
     */
    @Test
    public void testGetReceiver() {
        System.out.println("getReceiver");
        Loan instance = null;
        Staff expResult = null;
        Staff result = instance.getReceiver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIssuedDate method, of class Loan.
     */
    @Test
    public void testGetIssuedDate() {
        System.out.println("getIssuedDate");
        Loan instance = null;
        Date expResult = null;
        Date result = instance.getIssuedDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnDate method, of class Loan.
     */
    @Test
    public void testGetReturnDate() {
        System.out.println("getReturnDate");
        Loan instance = null;
        Date expResult = null;
        Date result = instance.getReturnDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBorrower method, of class Loan.
     */
    @Test
    public void testGetBorrower() {
        System.out.println("getBorrower");
        Loan instance = null;
        Borrower expResult = null;
        Borrower result = instance.getBorrower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFineStatus method, of class Loan.
     */
    @Test
    public void testGetFineStatus() {
        System.out.println("getFineStatus");
        Loan instance = null;
        boolean expResult = false;
        boolean result = instance.getFineStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturnedDate method, of class Loan.
     */
    @Test
    public void testSetReturnedDate() {
        System.out.println("setReturnedDate");
        Date dReturned = null;
        Loan instance = null;
        instance.setReturnedDate(dReturned);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFineStatus method, of class Loan.
     */
    @Test
    public void testSetFineStatus() {
        System.out.println("setFineStatus");
        boolean fStatus = false;
        Loan instance = null;
        instance.setFineStatus(fStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReceiver method, of class Loan.
     */
    @Test
    public void testSetReceiver() {
        System.out.println("setReceiver");
        Staff r = null;
        Loan instance = null;
        instance.setReceiver(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeFine1 method, of class Loan.
     */
    @Test
    public void testComputeFine1() {
        System.out.println("computeFine1");
        Loan instance = null;
        double expResult = 0.0;
        double result = instance.computeFine1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payFine method, of class Loan.
     */
    @Test
    public void testPayFine() {
        System.out.println("payFine");
        Loan instance = null;
        instance.payFine();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renewIssuedBook method, of class Loan.
     */
    @Test
    public void testRenewIssuedBook() {
        System.out.println("renewIssuedBook");
        Date iDate = null;
        Loan instance = null;
        instance.renewIssuedBook(iDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
