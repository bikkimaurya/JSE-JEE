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
public class PositionInfoPojo {

    public PositionInfoPojo(int positionNo, String PosionDetails) {
        this.positionNo = positionNo;
        this.PosionDetails = PosionDetails;
    }

    public PositionInfoPojo() {
    }

    @Override
    public String toString() {
        return "PositionInfo{" + "positionNo=" + positionNo + ", PosionDetails=" + PosionDetails + '}';
    }

    public int getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(int positionNo) {
        this.positionNo = positionNo;
    }

    public String getPosionDetails() {
        return PosionDetails;
    }

    public void setPosionDetails(String PosionDetails) {
        this.PosionDetails = PosionDetails;
    }
    int positionNo;
    String PosionDetails;
    
    
}
