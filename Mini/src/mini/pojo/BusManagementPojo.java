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
public class BusManagementPojo {

    @Override
    public String toString() {
        return "BusManagementPojo{" + "posno=" + posno + ", busno=" + busno + ", drivername=" + drivername + ", priority=" + priority + ", rout=" + rout + '}';
    }

    public BusManagementPojo(int posno, String busno, String drivername, int priority, int rout) {
        this.posno = posno;
        this.busno = busno;
        this.drivername = drivername;
        this.priority = priority;
        this.rout = rout;
    }

    public BusManagementPojo() {
    }

    public int getPosno() {
        return posno;
    }

    public void setPosno(int posno) {
        this.posno = posno;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getRout() {
        return rout;
    }

    public void setRout(int rout) {
        this.rout = rout;
    }

  
    int posno;
    String busno;
    String drivername;
    int priority;
    int rout;
    
    
}
