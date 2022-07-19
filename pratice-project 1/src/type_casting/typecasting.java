package type_casting;

public class typecasting {
public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		System.out.println();
		
		byte b = 3;
		System.out.println(b);
		
		short c = b;
		System.out.println(c);
		
		int i = b;
		System.out.println(i);
		
		long d = b;
		System.out.println(d);
		
		float e = i;
		System.out.println(e);
		
		double f = b;
		System.out.println(f);
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		System.out.println();
		double x=12.5;
		int y=(int)x;
		System.out.println(x);
		System.out.println(y);
		
	}

}
