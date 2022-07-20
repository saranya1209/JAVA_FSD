package collections;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		int[]a = {1,2,3};
		System.out.println(a[1]);
		
		HashSet<String> h = new HashSet<String>();
		h.add("tiger");
		h.add("lion");
		h.add("elephant");
		h.add("monkey");
		
		h.remove("lion");
		System.out.println(h);
		System.out.println(h.contains("elephant"));
		System.out.println(h.size());
        
	}

	

}
