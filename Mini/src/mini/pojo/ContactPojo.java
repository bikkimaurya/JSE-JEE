/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pojo;

/**
 *
 * @author bikrant bikram
 */
public class ContactPojo {

    @Override
    public String toString() {
        return "ContactPojo{" + "name=" + name + ", department=" + department + ", contactNo=" + contactNo + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public ContactPojo(String name, String department, String contactNo) {
        this.name = name;
        this.department = department;
        this.contactNo = contactNo;
    }

    public ContactPojo() {
    }
    String name;
    String department;
    String contactNo;
    
}
