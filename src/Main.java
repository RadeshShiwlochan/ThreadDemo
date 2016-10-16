
public class Main {
	public static void main(String [] args) {
		RunDemo threadOne = new RunDemo("Thread-One");
		threadOne.start();
		
		RunDemo threadTwo = new RunDemo("Thread-Two");
		threadTwo.start();
		
		
	}

}
