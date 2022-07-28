package thread.loiane;

public class TestRunnable {
	public static void main(String[] args) {

		new Thread(new MyThreadRunnable("# 1", 1200)).start();

		new Thread(new MyThreadRunnable("# 2", 500)).start();

		new Thread(new MyThreadRunnable("# 3", 600)).start();

	
	}

}
