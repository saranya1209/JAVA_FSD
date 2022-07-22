package arithmaticcalculator;

import java.util.Scanner;

public class arithmaticcalculator {
	public static void main(String[] args) {
		char op;
		Double number1,number2;
		Double res=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operator(+,-,*,/,%):");
		op=sc.next().charAt(0);
		
		System.out.println("Enter Two Numbers:");
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		
		
		if(op == '+') {
			
			res=number1+number2;
		}else if(op=='-') {
			res=number1-number2;
		}else if(op=='*') {
			res=number1*number2;
		}else if(op=='/') {
			res=number1/number2;
		}else if(op=='%') {
			res=number1%number2;
		}else {
			System.out.println("Invalid operator!");
		}
		System.out.println("Answer is:"+res);
		
	}

}
