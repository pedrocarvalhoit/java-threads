package thread.deadlock;

public class GerenciadorDeTransacao {
	
	public void begin() {
		System.out.println("Começa a transação");
			try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
