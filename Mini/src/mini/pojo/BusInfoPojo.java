

package mini.pojo;

/**
 *
 * @author bikrant bikram
 */
public class BusInfoPojo 
{

    public BusInfoPojo() {
    }

    public BusInfoPojo(String busNo, String ownerName, String contactNo, int capacity) {
        this.busNo = busNo;
        this.ownerName = ownerName;
        this.contactNo = contactNo;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return busNo + "    " + ownerName + "    " + contactNo + "    " + capacity ;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    private String busNo;
    private String ownerName;
    private String contactNo;
    private int capacity;
    
}
