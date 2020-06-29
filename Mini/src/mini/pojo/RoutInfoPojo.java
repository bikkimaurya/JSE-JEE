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
public class RoutInfoPojo {
    @Override
    public String toString() {
        return "RoutInfoPojo{" + "routNo=" + routNo + ", rout=" + rout + ", routDetalis=" + routDetalis + '}';
    }

    public int getRoutNo() {
        return routNo;
    }

    public void setRoutNo(int routNo) {
        this.routNo = routNo;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public String getRoutDetalis() {
        return routDetalis;
    }

    public void setRoutDetalis(String routDetalis) {
        this.routDetalis = routDetalis;
    }

    public RoutInfoPojo(int routNo, String rout, String routDetalis) {
        this.routNo = routNo;
        this.rout = rout;
        this.routDetalis = routDetalis;
    }

    public RoutInfoPojo() {
    }
    private int routNo;
    private String rout;
    private String routDetalis;
    
    
}
