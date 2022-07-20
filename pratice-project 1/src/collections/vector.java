package collections;
import java.util.*; 
public class vector {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Lavanyaa");  
		v.add("Saranya");  
		v.add("Harshitha");  
		v.add("Shobitha");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}

}
