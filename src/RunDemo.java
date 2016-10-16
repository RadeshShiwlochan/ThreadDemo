
public class RunDemo implements Runnable {
	public Thread thread;
	public String nameOfThread;
	
	RunDemo(String nameOfThread) {
		this.nameOfThread = nameOfThread;
		System.out.println("In constructor to create " + nameOfThread);
	}
	
	public void run() {
		System.out.println("In Run Method " + nameOfThread);
		
		try {
			for(int i = 4; i > 0; i--) {
				System.out.println("This is thread " + nameOfThread + " , " + i);
				Thread.sleep(3000);
			}
		} catch(InterruptedException exception) {
			System.out.println("This is the thread that was interrupted " + nameOfThread);
		}
		System.out.print("Thread exiting : " + nameOfThread);
	}
	
	public void start() {
		System.out.println("Starting " + nameOfThread);
		if(thread == null) {
			thread = new Thread(this, nameOfThread);
			thread.start();
		}
	}

}
