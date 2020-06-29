
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
public class Book implements Comparable
{
private String aname;
private String bname;
private int price;

    public Book(String aname, String bname, int price)
    {
        this.aname = aname;
        this.bname = bname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "author name=" + aname + ", book name=" + bname + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.aname);
        hash = 59 * hash + Objects.hashCode(this.bname);
        hash = 59 * hash + this.price;
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
        final Book other = (Book) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.aname, other.aname)) {
            return false;
        }
        if (!Objects.equals(this.bname, other.bname)) {
            return false;
        }
        return true;
    }

////    @Override
////    public int compareTo(Object o) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    
////   // if(price<(Object)o.price)
//// // return(super.compareTo());
////   
//    
//    

    @Override
    public int compareTo(Object o) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    
    

}
