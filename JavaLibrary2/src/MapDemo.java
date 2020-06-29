
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
public class MapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap <Long ,String> hs=new HashMap<>();
        System.out.println(hs.put(9424308293l,"abhishek"));
        System.out.println(hs.put(9893959352l,"raghwendra pratap"));
        System.out.println(hs.put(9893959352l,"mr.raghwendra pratap"));
        System.out.println(hs.put(94243082933l,"abhishek kumar"));
        System.out.println(hs);
//        System.out.println(hs.remove(9424308293l));
//        System.out.println(hs);
//       // System.out.println( hs.get(2)); 
//           Set hd= hs.keySet();
//       Iterator <Long> it=hd.iterator();
//        System.out.println("name of keys using iterator");
//       while(it.hasNext())//wrong done
//       {
//           Long s=it.next();
//           System.out.println(s);
//       }
       Set hv= hs.entrySet();
       Iterator<Map.Entry>  i=hv.iterator();
        System.out.println("name of keys using iterator");
       while(i.hasNext())//wrong done
       {
        Map.Entry et =i.next();
           System.out.print(et.getKey());
           System.out.println(et.getValue());
       }
       
     




    }
    
}
