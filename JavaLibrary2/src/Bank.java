
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
public class Bank 
{
    private HashMap<Long,Account> hm=new HashMap();
   public  HashMap<Long,Account> getAllAccounts()
    {
       return hm; 
    }
   public Account getAccount(long i)
   {
       Account acc;
       acc=hm.get(i);
       return acc;
       
   }
   public Object  removeAccount(long acc)
   {
    Object o =hm.remove(acc);
    return o;
   
   }
   public int getCount()
   {int count=0;
     
   count=hm.size();
   return count;
   }
  public Object  addAccount(long ac,Account a)
  {   
      Object o;
      o=hm.put(ac, a);
      return o;
  }
    
    
}
