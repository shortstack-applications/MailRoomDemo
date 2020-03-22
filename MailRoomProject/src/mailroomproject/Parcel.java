package mailroomproject;
import java.time.LocalDateTime;

/**
 *
 * @author Andrew Garner
 * updated on 26/01/2020
 * @version 0.1
 */
public class Parcel {
    String barcode;
    String receivedBy;
    String courier;
    String time;
    
    /**
     * Constructor.
     *
     * @param aName the name of the staff member who received the parcel
     * @param aCourier the name of the delivery courier
     * @param aBarcode the unique tracking reference of the parcel
     * @param aTime the time the parcel was booked in
     */
    public Parcel(String aName, String aCourier, String aBarcode, String aTime) {
        barcode = aBarcode;
        receivedBy = aName;
        courier = aCourier;
        time = aTime;
    }
    
    
    /**
     * Returns the barcode of the parcel
     *
     * @return the barcode
     */
    public String getBarcode() {
        return this.barcode;
    }
    
    /**
     * Returns the name of the staff member who received the parcel
     *
     * @return the name of the receiver
     */
    public String getReceivedBy() {
        return this.receivedBy;
    }
    
    /**
     * Returns the name of the courier
     *
     * @return the name of the courier
     */
    public String getCourier() {
        return this.courier;
    }
    
    /**
     * Returns the date and time the parcel was received
     *
     * @return the full date and time
     */
    public String getTimeReceived() {
        return this.time;
    }
    
    
    /**
     * Returns the full details of the parcel in String format
     *
     * @return the full details in String format
     */
    public String getDetails() {
        String name = this.receivedBy;
        String courier = this.courier;
        String barcode = this.barcode;
        String time = this.time;
        return "Parcel " + barcode + " from " + courier + ", received by " + name + " on " + time + ".";
        
    }
    
    /**
     * Returns the barcode and courier in a String format
     *
     * @return the barcode and courier in String format
     */
    public String getBarcodeList() {
        String barcode = this.barcode;
        String courier = this.courier;
        return barcode + "(" + courier + ")";
    }
}
