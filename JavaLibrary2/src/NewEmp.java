
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class NewEmp {
    public static void main(String args[] )
    {
       ArrayList<Emp> empList=new ArrayList<>();
        Emp e= new  Emp(21,"ravi",200000.0);
        Emp f= new  Emp(91,"ravi",200000.0);
        Emp g= new Emp(41,"ravi",200000.0);
        Emp h= new Emp(71,"ravi",200000.0);
        empList.add(e);
        empList.add(f);
        empList.add(g);
        empList.add(h);
 
        for(Emp emp: empList )
            {
                System.out.println(emp);
            }
        Scanner kb = new  Scanner(System.in);
        Collections.sort(empList);
        System.out.println("after sorting "+empList);
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        /* System.out.println("enter age name sal");
               int age= kb.nextInt();
               String name=kb.next();
                double sal=kb.nextDouble();
                Emp k= new Emp(age,name,sal);
                int x=empList.indexOf(k);
            
                empList.remove(k);
       
       
       
     
        /* System.out.println(   "emp removed"+empList.remove(k));*/
       
         /*for(Emp emp: empList )
            {
                System.out.println(emp);
            }
        */
 
    }
    
}
