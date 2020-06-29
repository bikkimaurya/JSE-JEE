

import java.util.HashSet;
import java.util.Iterator;
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
public class hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //   HashSet<String> list1= new HashSet<>();
        TreeSet<String> list1= new TreeSet<>();

        list1.add("january");
        list1.add("fabruary");
        list1.add("march");
        list1.add("april");
        list1.add("may");
        System.out.println("first list using refeance name:"+ list1);
//       Iterator it=list1.iterator();
//        System.out.println("name of monthes using iterator");
//       while(it.hasNext())
//       {
//           System.out.println(it.next());
//       }
       Iterator <String> it=list1.iterator();
        System.out.println("name of monthes using iterator");
       while(it.hasNext())
       {
           String s=it.next();
           System.out.println(s);
       }
       
      
    }

}
