
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class UseLibrary {
    public static void main(String[] args) 
    {
        
        LinkedList<Book> list1= new LinkedList<>();
        
        Book e=new Book("the complete refrence","Herbert Schildt",700);
        Book f=new Book("the complete refrence","Herbert Schildt",700);
        Book g=new Book("the complete refrence","Herbert Schil",700);
        Book h=new Book("the complete refrence","Herbert Schi",700);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);
        
        
        Library l= new Library();
        l.addBook(e);   
        l.addBook(f);
        l.addBook(g); 
        l.addBook(h);
        list1=l.getAllBook();
        l.getBookCount();
       // System.out.println(list1);
       for(int i=0;i<list1.size();i++)
            System.out.println(list1.get(i));
         
        
    }
    
}
