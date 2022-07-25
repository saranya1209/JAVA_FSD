package THREAD;

public class runnablethread {
	 public static int myCount = 0;
	    public runnablethread(){
	         
	    }
	    public void run() {
	        while(runnablethread.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++runnablethread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    }
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        runnablethread run = new runnablethread();
	        thread t = new thread();
	        t.run();
	        while(runnablethread.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++runnablethread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        }
}
