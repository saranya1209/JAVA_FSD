package innerclasses;

public class innerclass {
	private String msg="Welcome to my world"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", start work");}  
	 }  


	public static void main(String[] args) {

		innerclass obj=new innerclass();
		innerclass.Inner in=obj.new Inner();  
		in.hello();  
	}

}
