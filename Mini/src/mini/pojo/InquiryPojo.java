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
public class InquiryPojo {

    @Override
    public String toString() {
        return "InquiryPojo{" + "mobno=" + mobno + ", emailId=" + emailId + ", purpose=" + purpose + ", type=" + type + ", msg=" + msg + '}';
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public InquiryPojo(String mobno, String emailId, String purpose, String type, String msg) {
        this.mobno = mobno;
        this.emailId = emailId;
        this.purpose = purpose;
        this.type = type;
        this.msg = msg;
    }

    public InquiryPojo() {
    }
    String mobno;
    String emailId;
    String purpose;
    String type;
    String msg;
    
    
    
}
