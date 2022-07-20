package maps;

import java.util.Hashtable;

public class hashtable {
	public static void main(String args[])
    {

        Hashtable<Integer, String> ht1 = new Hashtable<>();
  
        ht1.put(1, "a");
        ht1.put(2, "b");
        ht1.put(3, "c");
  
        System.out.println("HASHTABLE of ht1 : " + ht1);
        
    }

}
