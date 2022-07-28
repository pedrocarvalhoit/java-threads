package thread.loiane;

public class TestIsAliveJoin {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThreadRunnable("# 1", 500));
		Thread t2 = new Thread (new MyThreadRunnable("# 2", 700));
		Thread t3 = new Thread (new MyThreadRunnable("# 3", 800));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Not the best way to set this function
	/*	while(t1.isAlive()|| t2.isAlive()|| t3.isAlive()){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		System.out.println(" Execution finished");
		
	}

}
