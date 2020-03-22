/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailroomproject;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author short
 */
public class MailRoomCoordTest {
    
    public MailRoomCoordTest() {
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
     * Test of getParcels method, of class MailRoomCoord.
     */
    @Test
    public void testGetParcels() {
        System.out.println("getParcels");
        //Create test parcels
        Parcel parcel1 = new Parcel("Andrew", "Royal Mail", "BA0000001", "23-02-2020 10:15:27");
        Parcel parcel2 = new Parcel("Hannah", "UPS", "BA0000002", "05-03-2020 13:43:01");
        Parcel parcel3 = new Parcel("Bob", "FedEx", "BA0000003", "26-03-2020 15:11:02");
        
        MailRoomCoord instance = new MailRoomCoord();
        instance.parcelList.add(parcel1);
        instance.parcelList.add(parcel2);
        instance.parcelList.add(parcel3);
        
        ArrayList<Parcel> expResult = new ArrayList<Parcel>();
        expResult.add(parcel1);
        expResult.add(parcel2);
        expResult.add(parcel3);
        
        ArrayList<Parcel> result = instance.getParcels();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStaffMembers method, of class MailRoomCoord.
     */
    @Test
    public void testGetStaffMembers() {
        System.out.println("getStaffMembers");
        
        //Create test staff members
        StaffMember andrew = new StaffMember("Andrew", "Garner", 0);
        StaffMember bob = new StaffMember("Bob", "Smith", 1);
        StaffMember isaac = new StaffMember("Isaac", "MacLeod", 2);
        
        MailRoomCoord instance = new MailRoomCoord();
        instance.staffList.add(andrew);
        instance.staffList.add(bob);
        instance.staffList.add(isaac);
        
        ArrayList<StaffMember> expResult = new ArrayList<StaffMember>();
        expResult.add(andrew);
        expResult.add(bob);
        expResult.add(isaac);
        
        ArrayList<StaffMember> result = instance.getStaffMembers();
        assertEquals(expResult, result);
    }

    /**
     * Test of addParcel method, of class MailRoomCoord.
     */
    @Test
    public void testAddParcel() {
        System.out.println("addParcel");
        
        //Create test variables
        String aName = "Andrew";
        String aCourier = "Royal Mail";
        String barcode = "BA0000001";
        String aDate = "26/03/2020 15:00:00";
        
        MailRoomCoord instance = new MailRoomCoord();
        String expResult = "BA0000001 from Royal Mail has been receieved at 26/03/2020 15:00:00 by Andrew";
        String result = instance.addParcel(aName, aCourier, barcode, aDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of addStaffMember method, of class MailRoomCoord.
     */
    @Test
    public void testAddStaffMember() {
        System.out.println("addStaffMember");
        
        //Create test variables
        String firstName = "Andrew";
        String lastName = "Garner";
        int ID = 0;
        
        MailRoomCoord instance = new MailRoomCoord();
        String expResult = "Andrew Garner(0) has been added to list of staff members.";
        String result = instance.addStaffMember(firstName, lastName, ID);
        assertEquals(expResult, result);
    }

    /**
     * Test of getParcelList method, of class MailRoomCoord.
     */
    @Test
    public void testGetParcelList() {
        System.out.println("getParcelList");
        
        //Create test parcels
        Parcel parcel1 = new Parcel("Andrew", "Royal Mail", "BA0000001", "23-02-2020 10:15:27");
        Parcel parcel2 = new Parcel("Hannah", "UPS", "BA0000002", "05-03-2020 13:43:01");
        Parcel parcel3 = new Parcel("Bob", "FedEx", "BA0000003", "26-03-2020 15:11:02");
        
        ArrayList<Parcel> anArray = new ArrayList<Parcel>();
        anArray.add(parcel1);
        anArray.add(parcel2);
        anArray.add(parcel3);
        
        MailRoomCoord instance = new MailRoomCoord();
        
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("BA0000001(Royal Mail)");
        expResult.add("BA0000002(UPS)");
        expResult.add("BA0000003(FedEx)");
        
        ArrayList<String> result = instance.getParcelList(anArray);        
        assertEquals(expResult, result);
    }

    /**
     * Test of getStaffDetails method, of class MailRoomCoord.
     */
    @Test
    public void testGetStaffDetails() {
        System.out.println("getStaffDetails");
        
        //Create test staff members
        StaffMember andrew = new StaffMember("Andrew", "Garner", 0);
        StaffMember bob = new StaffMember("Bob", "Smith", 1);
        StaffMember isaac = new StaffMember("Isaac", "MacLeod", 2);
        
        ArrayList<StaffMember> anArray = new ArrayList<StaffMember>();
        anArray.add(andrew);
        anArray.add(bob);
        anArray.add(isaac);
        
        MailRoomCoord instance = new MailRoomCoord();
        
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("Andrew Garner(0)");
        expResult.add("Bob Smith(1)");
        expResult.add("Isaac MacLeod(2)");
        
        ArrayList<String> result = instance.getStaffDetails(anArray);
        assertEquals(expResult, result);
    }

    /**
     * Test of dispatchParcel method, of class MailRoomCoord.
     */
    @Test
    public void testDispatchParcel() {
        System.out.println("dispatchParcel");
        String aParcel = "BA0000001(UPS)";
        String aTime = "22/03/2020 15:45:00";
        MailRoomCoord instance = new MailRoomCoord();
        String expResult = "BA0000001(UPS) has been Dispatched at 22/03/2020 15:45:00";
        String result = instance.dispatchParcel(aParcel, aTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeStaffMember method, of class MailRoomCoord.
     */
    @Test
    public void testRemoveStaffMember() {
        System.out.println("removeStaffMember");
        String staffName = "Andrew Garner(0)";
        MailRoomCoord instance = new MailRoomCoord();
        String expResult = "Andrew Garner(0) has been removed from current members of staff.";
        String result = instance.removeStaffMember(staffName);
        assertEquals(expResult, result);
    }
    
}
