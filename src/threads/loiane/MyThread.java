package threads.loiane;

public class MyThread extends Thread{
	
	private String name;
	private int time;
	
	public MyThread(String name, int time) {
		this.name = name;
		this.time = time;
		//It is possible to put the start order inside the constructor
		start();
	}

	public void run() {
		
		
			try {
				for(int i = 0; i < 6; i++) {
					System.out.println(name + " Counter = " + i );
				Thread.sleep(time);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(name + "Execution finished");
	}

}
