package threads.loiane;

public class MyThreadRunnable implements Runnable {

	private String name;
	private int time;

	public MyThreadRunnable(String name, int time) {
		this.name = name;
		this.time = time;
	//	Thread t = new Thread(this);
	//	t.start();
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(name + " counter = " + i);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println(name + " Execution finished");
	}

}
