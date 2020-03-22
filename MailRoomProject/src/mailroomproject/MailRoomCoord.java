package mailroomproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author Andrew Garner
 * updated on 26/01/2020
 * @version 0.1
 */
public class MailRoomCoord {
    
    ArrayList<Parcel> parcelList = new ArrayList<Parcel>();
    ArrayList<StaffMember> staffList = new ArrayList<StaffMember>();

    /**
     * Returns the parcelList containing a list of all parcels
     *
     * @return the parcelList
     */
    public ArrayList<Parcel> getParcels() {
        return parcelList;
    }
    
    /**
     * Returns staffList containing all current Staff Members
     *
     * @return the staffList
     */
    public ArrayList<StaffMember> getStaffMembers() {
        return staffList;
    }
    
    /**
     * Creates and adds a parcel to parcelList
     *
     * @return a response String with parcel details
     * @param aName is the name of the employee booking in the parcel
     * @param aCourier is the courier who delivered the parcel
     * @param barcode is the unique barcode scanned on the parcel upon delivery
     * @param aDate is the time and date of when the parcel was received
     */
    public String addParcel(String aName, String aCourier, String barcode, String aDate) {
        Parcel newParcel = new Parcel(aName, aCourier, barcode, aDate);
        parcelList.add(newParcel);
        return barcode + " from " + aCourier + " has been receieved at " + aDate + " by " + aName;
    }
    
    /**
     * Creates and adds a StaffMember to staffList
     *
     * @return a response String with staff details
     * @param firstName is the first name of the employee
     * @param lastName is the last name of the employee
     * @param ID is the unique ID of the employee
     */
    public String addStaffMember(String firstName, String lastName, int ID) {
        StaffMember aStaffMember = new StaffMember(firstName, lastName, ID);
        staffList.add(aStaffMember);
        return aStaffMember.getStaffName() + " has been added to list of staff members.";
    }
    
    /**
     * Returns an ArrayList of all parcels barcodes
     *
     * @return an ArrayList containing all parcel barcodes
     * @param anArray is the list of all parcels currently booked into the system
     */
    public ArrayList<String> getParcelList(ArrayList<Parcel> anArray) {
        ArrayList<String> parcelBarcodes = new ArrayList<String>();
        for(int i = 0; i < anArray.size(); i++) {
            Parcel aParcel = anArray.get(i);
            String barcode = aParcel.getBarcodeList();
            parcelBarcodes.add(barcode);
        }
        return parcelBarcodes;
    }
    
    /**
     * Returns an ArrayList of all current staff members
     *
     * @return an ArrayList containing all current staff members
     * @param anArray is the list of all current staff members
     */
    public ArrayList<String> getStaffDetails(ArrayList<StaffMember> anArray) {
        ArrayList<String> staffNames = new ArrayList<String>();
        for(int i = 0; i < anArray.size(); i++) {
            StaffMember aStaffMember = anArray.get(i);
            String details = aStaffMember.getStaffName();
            staffNames.add(details);
        }
        return staffNames;
    }
    
    /**
     * Dispatches a parcel and removes it from parcelList
     *
     * @return a response String
     * @param aParcel is the unique barcode of the parcel
     * @param aTime is the current time the parcel is being dispatched at
     */
    public String dispatchParcel(String aParcel, String aTime) {
        String parcelBarcode = null;
        for(int i = 0; i < parcelList.size(); i++) {
            parcelBarcode = parcelList.get(i).getBarcodeList();
            if(parcelBarcode.equals(aParcel)) {
                parcelList.remove(i);
            }
        }
        return aParcel + " has been Dispatched at " + aTime;
    }
    
    /**
     * Removes a Staff Member from staffList
     *
     * @return a response String
     * @param staffName is the full name and unique ID of the staff member
     */
    public String removeStaffMember(String staffName) {
        String staffDetails = null;
        for(int i = 0; i < staffList.size(); i++) {
            staffDetails = staffList.get(i).getStaffName();
            if(staffDetails.equals(staffName)) {
                staffList.remove(i); 
            }        
        }
        return staffName + " has been removed from current members of staff.";
    }
    
}
