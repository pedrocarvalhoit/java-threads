package thread.imprimindoNumeros;

public class Impressora implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <= 1000; i++) {
			Thread threadNumeros = Thread.currentThread();
			System.out.println(threadNumeros.getId() + " - " + i);
		}
		
	}

}
