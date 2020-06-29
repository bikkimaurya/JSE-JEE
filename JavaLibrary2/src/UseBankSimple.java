
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class UseBankSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank b= new Bank();
        long count=12;
        Account a= new Account(count++,"abhishek maurya",20000l);
        System.out.println("added"+b.addAccount(count, a));
//       b.addAccount(123456l,a);
        Account f= new Account(count++,"bikki maurya",20000);
         System.out.println("added"+b.addAccount(count, f));
//       b.addAccount(123456778l, f);
        Account c= new Account(count++,"bikrant maurya",20000);
        System.out.println("added"+b.addAccount(count,c));
//      b.addAccount(234567l, c);
        Account d= new Account(count++,"bikram  maurya",20000);
         System.out.println("added"+b.addAccount(count, d));
//        b.addAccount(123456789l, d);
        Account e= new Account(count,"pratap maurya",20000);
//        b.addAccount(12345667l, e);
               System.out.println("added"+b.addAccount(count, e));
               System.out.println("total account "+ b.getCount());
               System.out.println("accounts are ;");
               HashMap<Long,Account> hm=b.getAllAccounts();
               Set s = hm.entrySet();
               Iterator<Map.Entry> i= s.iterator();
               while(i.hasNext())
               {
                   Map.Entry et= i.next();
                   Account ac=(Account)et.getValue();
                   System.out.println(ac);
                   
               }
               System.out.println("get account"+b.getAccount(count));
               System.out.println("REMOve account"+b.removeAccount(count));
               
        //       System.out.println(hm);
               i=s.iterator();
               System.out.println("after removing");
                while(i.hasNext())
               {
                   Map.Entry et= i.next();
                   Account ac=(Account)et.getValue();
                   System.out.println(ac);
                   
               }
                System.out.println("total account  after removing "+ b.getCount());
                
                   
                   
               
               
        
        
        
        
        
        
        
    }
    
}
