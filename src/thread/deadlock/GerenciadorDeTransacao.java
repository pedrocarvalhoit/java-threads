package thread.deadlock;

public class GerenciadorDeTransacao {
	
	public void begin() {
		System.out.println("Come�a a transa��o");
			try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
