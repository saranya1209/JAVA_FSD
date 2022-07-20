package collections;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		String[] TV = new String[3];
		TV[0]="Mi";
		TV[1]="Samsung";
		TV[2]="1+";
		System.out.println(TV[1]);
		
		ArrayList TVList = new ArrayList();
		TVList.add("Mi");
		TVList.add("Samsung");
		TVList.add("1+");
		
		TVList.remove("1+");
		System.out.println(TVList.contains("Sony"));
		System.out.println(TVList);
	}

}
