package thread.loiane;

public class Calculator{

	private int sum;
	
	public synchronized int somaArray(int[] array) {
		 
		sum = 0;
		
		 for(int i = 0; i < array.length; i++) {
			 
			 sum += array[i];
			 
			 System.out.println("Executed by: " + Thread.currentThread().getName()+ 
					 " sum " + array[i] + " total " + sum);
			 
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		
		return sum;
	}
	
}
