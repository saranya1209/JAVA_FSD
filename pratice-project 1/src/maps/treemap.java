package maps;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
	public static void main(String args[]){  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(1,"Vijay");    
		      map.put(2,"Ajith");    
		      map.put(10,"Nine");    
		      map.put(3,"Kamal");    
		        
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
		 }  

}
