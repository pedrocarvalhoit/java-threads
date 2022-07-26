package threads.loiane;

public class Test {

	public static void main(String[] args) {

		MyThread thread = new MyThread("Thread #1", 600);
		//thread.start();
		
		MyThread thread2 = new MyThread("Thread #2", 900);
		
		MyThread thread3 = new MyThread("Thread #3", 2000);
		
	}

}
