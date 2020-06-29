/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myempmgmtapp.pojo;

/**
 *
 * @author bikrant bikram
 */
public class EmpPojo {

    public EmpPojo(int empno, String ename, double esal) {
        this.empno = empno;
        this.ename = ename;
        this.esal = esal;
    }

    public EmpPojo() {
    }
    
    
    
    

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }
    private int empno;
    private String ename;
    private double esal;
    
    
}
