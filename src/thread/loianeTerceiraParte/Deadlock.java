package thread.loianeTerceiraParte;

public class Deadlock {
	public static void main(String[] args) {
		
		final String Recurso1 = "Recurso # 1";
		final String Recurso2 = "Recurso # 2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (Recurso1) {
					System.out.println("Thread #1: bloqueou o recurso 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #1: Tentando acessar o recurso 2");
					
					synchronized (Recurso2) {
						System.out.println("Thread #2: bloqueou o recurso 2");
					}
					
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (Recurso2) {
					System.out.println("Thread #2 bloqueou o recurso 2 ");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #2 tentando acessar o recurso 1");
					
					synchronized (Recurso1) {
						System.out.println("Thread #2: bloqueou o recurso 1");
					}
					
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}
