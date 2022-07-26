package diamond;

public class testclass implements first, Second 
{  
    public void show() 
    {  
        first.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        testclass ob = new testclass(); 
        ob.show(); 
    } 
}
