package nssaga.beginner.thread;

public class Ex07StopThreadExternally {
	public static void main(String ar[]) {
		myRunnable m = new myRunnable();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.start();
		t2.start();
		System.out.println("End main");
		try{
			System.in.read();
			m.exit = true;
		}catch(Exception e){
			System.err.println("Error in reading");
		}
	}
}

class myRunnable implements Runnable{
	boolean exit = false;
	@Override
	public void run() {
		System.out.println("In run");
		for(int i=0;i<500;i++){
			synchronized (this) {
				try{
					Thread.sleep(3000);
					System.out.println(i+" Thread Name :: "+Thread.currentThread().getName());
				}catch(InterruptedException ie){
					System.err.println("Inturrepted");
				}				
				if(exit){
					System.out.println("Enter pressed exiting...");
					return;
				}
			}			
		}		
	}
}
