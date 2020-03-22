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
public class ParcelTest {
    
    public ParcelTest() {
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
     * Test of getBarcode method, of class Parcel.
     */
    @Test
    public void testGetBarcode() {
        System.out.println("getBarcode");
        Parcel instance = new Parcel("Andrew", "Royal Mail", "BA0000001", "26-03-2020 15:00:00");
        String expResult = "BA0000001";
        String result = instance.getBarcode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getReceivedBy method, of class Parcel.
     */
    @Test
    public void testGetReceivedBy() {
        System.out.println("getReceivedBy");
        Parcel instance = new Parcel("Andrew", "Royal Mail", "BA0000001", "26-03-2020 15:00:00");
        String expResult = "Andrew";
        String result = instance.getReceivedBy();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourier method, of class Parcel.
     */
    @Test
    public void testGetCourier() {
        System.out.println("getCourier");
        Parcel instance = new Parcel("Andrew", "Royal Mail", "BA0000001", "26-03-2020 15:00:00");
        String expResult = "Royal Mail";
        String result = instance.getCourier();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeReceived method, of class Parcel.
     */
    @Test
    public void testGetTimeReceived() {
        System.out.println("getTimeReceived");
        Parcel instance = new Parcel("Andrew", "Royal Mail", "BA0000001", "26-03-2020 15:00:00");
        String expResult = "26-03-2020 15:00:00";
        String result = instance.getTimeReceived();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDetails method, of class Parcel.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        Parcel instance = new Parcel("Andrew", "Royal Mail", "BA0000001", "26-03-2020 15:00:00");
        String expResult = "Parcel BA0000001 from Royal Mail, received by Andrew on 26-03-2020 15:00:00.";
        String result = instance.getDetails();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBarcodeList method, of class Parcel.
     */
    @Test
    public void testGetBarcodeList() {
        System.out.println("getBarcodeList");
        Parcel instance = new Parcel("Andrew", "Royal Mail", "BA0000001", "26-03-2020 15:00:00");
        String expResult = "BA0000001(Royal Mail)";
        String result = instance.getBarcodeList();
        assertEquals(expResult, result);
    }
    
}
