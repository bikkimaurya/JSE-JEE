
package mini.pojo;

/**
 *
 * @author bikrant bikram
 */
public class StudentPojo {

    @Override
    public String toString() {
        return "StudentPojo{" + "name=" + name + ", enrollmentNo=" + enrollmentNo + ", mobNo=" + mobNo + ", fathersMobNo=" + fathersMobNo + ", roomNo=" + roomNo + '}';
    }

    public StudentPojo(String name, String enrollmentNo, String mobNo, String fathersMobNo, String roomNo) {
        this.name = name;
        this.enrollmentNo = enrollmentNo;
        this.mobNo = mobNo;
        this.fathersMobNo = fathersMobNo;
        this.roomNo = roomNo;
    }

    public StudentPojo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getFathersMobNo() {
        return fathersMobNo;
    }

    public void setFathersMobNo(String fathersMobNo) {
        this.fathersMobNo = fathersMobNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
    String name;
    String enrollmentNo;
    String mobNo;
    String fathersMobNo;
    String roomNo;
    
    
}
