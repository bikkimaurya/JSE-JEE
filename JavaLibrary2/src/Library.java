
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class Library
{
   // privateHash HashSet<Book> b= new HashSet<>();
     private TreeSet<Book> b= new TreeSet<>();
    
    public void getBookCount()
    {
        System.out.println("total no of books available in the library :");
        System.out.println(b.size());
    }
    public LinkedList<Book> getAllBook()
    {
        LinkedList<Book> rt= new LinkedList<>();
        Iterator <Book> i=b.iterator();
//        System.out.println("book available inside the library are :");
        while(i.hasNext())
        {
//            System.out.println(i.next()); 
            rt.add(i.next());
            
        }   
        return rt;

    }

    void addBook(Book e) {
        
        System.out.println(b.add(e));
    }
    
    
}
