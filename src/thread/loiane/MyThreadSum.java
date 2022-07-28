package thread.loiane;

public class MyThreadSum implements Runnable{
	
	private String name; 
	private int[] nums;
	private static Calculator calc = new Calculator();
	
	public MyThreadSum(String name, int[] sum) {
		this.name = name;
		this.nums = sum;
		new Thread(this, name).start();
	}

	@Override
	public void run() {
		
		System.out.println(this.name + "Started");
		
		int sum = calc.somaArray(this.nums);
		
		System.out.println("Thread " + this.name + " result: " + sum);
		
		System.out.println("Finished");
		
	}
	
	
	
}
