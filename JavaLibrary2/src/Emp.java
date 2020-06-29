
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class Emp implements  Comparable
{
    private int  age;
    private String name;
    private double sal;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" + "age=" + age + ", name=" + name + ", sal=" + sal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.age;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.sal) ^ (Double.doubleToLongBits(this.sal) >>> 32));
        return hash;



    }
    @Override
   
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emp other = (Emp) obj;
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.sal) != Double.doubleToLongBits(other.sal)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o)
    {
        if(this.sal>((Emp)o).sal)
                {
                    return 1;
                }
        else   if(this.sal<((Emp)o).sal)
                {
                    return -1;
                }
        else 
            if(this.age>((Emp)o).age)
                return 1;
            else if (this.age<((Emp)o).age)
                return -1;
        return 0;
       
    }
   
    
}
