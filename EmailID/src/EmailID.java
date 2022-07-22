import java.util.ArrayList;

public class EmailID {
	 public static void main(String[] args) {
	        
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        
	        emailID.add("vijay@star.com");
	        emailID.add("ajith@star.com");
	        emailID.add("surya@star.com");
	        emailID.add("kamal@star.com");
	        emailID.add("karthi@star.com");
	        emailID.add("sk@star.com");
	       
	        int c = 0;
	        
	   
	        String searchEmail = "surya@star.com";
	        
	                for(int i=0; i<emailID.size(); i++) {
	                    
	                    
	                    if(searchEmail==emailID.get(i)) {
	                        
	                        System.out.println("\n");
	                        
	                       c = 1;
	                        
	                        break;
	                        
	                    }
	                }
	                
	                if(c==1)
	                {System.out.println("email ID :" + searchEmail + "  is found");}
	                else{System.out.println("email ID Not found");}

	    }


}
