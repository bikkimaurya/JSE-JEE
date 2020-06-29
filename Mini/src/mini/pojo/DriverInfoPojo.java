
package mini.pojo;

/**
 *
 * @author bikrant bikram
 */
public class DriverInfoPojo 
{

    public DriverInfoPojo(String name, int age, String dlNo, String dlValidFrom, String dlValidUpto, String contactNo, String address) {
        this.name = name;
        this.age = age;
        this.dlNo = dlNo;
        this.dlValidFrom = dlValidFrom;
        this.dlValidUpto = dlValidUpto;
        this.contactNo = contactNo;
        this.address = address;
    }

    public DriverInfoPojo() {
    }

    @Override
    public String toString() {
        return "DriverInfoPojo{" + "name=" + name + ", age=" + age + ", dlNo=" + dlNo + ", dlValidFrom=" + dlValidFrom + ", dlValidUpto=" + dlValidUpto + ", contactNo=" + contactNo + ", address=" + address + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDlNo() {
        return dlNo;
    }

    public void setDlNo(String dlNo) {
        this.dlNo = dlNo;
    }

    public String getDlValidFrom() {
        return dlValidFrom;
    }

    public void setDlValidFrom(String dlValidFrom) {
        this.dlValidFrom = dlValidFrom;
    }

    public String getDlValidUpto() {
        return dlValidUpto;
    }

    public void setDlValidUpto(String dlValidUpto) {
        this.dlValidUpto = dlValidUpto;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    private String name;
    private int age;
    private String dlNo;
    private String dlValidFrom;
    private String dlValidUpto;
    private String contactNo;
    private String address;
    
}
