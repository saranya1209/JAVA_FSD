
public class main {
	public static void main(String[] args) {
		kthsmallst ob = new kthsmallst(); 
	    int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
	    int n = arr.length,k = 4; 
	    System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
	}


}
