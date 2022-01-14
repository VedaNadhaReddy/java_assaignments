package Java_assignments;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		        //Hashmap
		
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"veda");    
			      hm.put(2,"nadha");    
			      hm.put(3,"Reddy");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			    
			      //HashTable
			      
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"Madhu");  
			      ht.put(5,"meenakshi");  
			      ht.put(6,"Madhu");  
			      ht.put(7,"jathin");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      
			      //TreeMap
			      
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"santhosh");    
			      map.put(9,"bhuvan");    
			      map.put(10,"Reddy");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    
			      
			   }
}


