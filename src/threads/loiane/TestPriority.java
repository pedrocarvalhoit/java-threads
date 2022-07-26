package threads.loiane;

public class TestPriority {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThreadRunnable("# 1", 500));
		Thread t2 = new Thread (new MyThreadRunnable("# 2", 500));
		Thread t3 = new Thread (new MyThreadRunnable("# 3", 500));
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
				
		t1.start();
		t2.start();
		t3.start();
	
	
		
	}

}
