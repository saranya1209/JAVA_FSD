package collections;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Rajiv");
		linkedlist.add("Ravi");
		linkedlist.add("Surya");
		System.out.println(linkedlist);
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.get(2));
		
		}

}
