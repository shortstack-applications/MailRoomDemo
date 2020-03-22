package mailroomproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew Garner
 * updated on 26/01/2020
 * @version 0.1
 */
public class StaffMemberTest {
    
    public StaffMemberTest() {
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
     * Test of getStaffName method, of class StaffMember.
     */
    @Test
    public void testGetStaffName() {
        System.out.println("getStaffName");
        StaffMember instance = new StaffMember("Andrew", "Garner", 0);
        String expResult = "Andrew Garner(0)";
        String result = instance.getStaffName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFirstName method, of class StaffMember.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        StaffMember instance = new StaffMember("Andrew", "Garner", 0);
        String expResult = "Andrew";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStaffID method, of class StaffMember.
     */
    @Test
    public void testGetStaffID() {
        System.out.println("getStaffID");
        StaffMember instance = new StaffMember("Andrew", "Garner", 0);
        int expResult = 0;
        int result = instance.getStaffID();
        assertEquals(expResult, result);
    }
    
}
