/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailroomproject;

/**
 *
 * @author Andrew Garner
 * @date 26/01/2020
 * @version 0.1
 */
public class StaffMember {
    String firstName;
    String lastName;
    int id;
    
    
    /**
     * Constructor.
     *
     * @param aName1 the first name of the staff member
     * @param aName2 the last name of the staff member
     * @param uniqueID the unique ID for each staff member
     */
    public StaffMember(String aName1, String aName2, int uniqueID) {
        firstName = aName1;
        lastName = aName2;
        id = uniqueID;
    }
    
    /**
     * Returns the full name and ID of the staff member
     *
     * @return the full name and ID
     */
    public String getStaffName() {
        String firstN = this.firstName;
        String lastN = this.lastName;
        int id = this.id;
        return firstN + " " + lastN + "(" + id + ")";
    }
    
     /**
     * Returns the first name of the staff member
     *
     * @return the first name
     */
    public String getFirstName() {
        return this.firstName;
    }
    
    /**
     * Returns the unique ID of the staff member
     *
     * @return the ID of the staff member
     */
    public int getStaffID() {
        return this.id;
    }

}
