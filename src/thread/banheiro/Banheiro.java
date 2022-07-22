package thread.banheiro;

public class Banheiro {
	
	private boolean ehSujo = true;
	
	public void fazNumero1() {
		
		String nome = Thread.currentThread().getName();

	    System.out.println(nome + " batendo na porta");

	    synchronized (this) {

	        System.out.println(nome + " entrando no banheiro");

	        if (this.ehSujo) {
	            esperaLaFora(nome);
	        }
			
			System.out.println(nome + " fazendo coisa r�pida");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
			
			System.out.println(nome + " Dando descarga");
			System.out.println(nome + " Lavando a m�o");
			System.out.println(nome + " Saindo do banheiro");			
		}
		
		
	}

	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + "Batando na porta");
		
		synchronized(this) {
			System.out.println(nome + " Entrando no banheiro");
			
			if(ehSujo) {
				esperaLaFora(nome);
			}
			
			System.out.println(nome + " fazendo coisa r�pida");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
			System.out.println(nome + " Dando descarga");
			System.out.println(nome + " Lavando a m�o");
			System.out.println(nome + "Saindo do banheiro");
		}
	}
	
	public void limpa() {

	    String nome = Thread.currentThread().getName();

	    System.out.println(nome + " batendo na porta");

	    synchronized (this) {

	        System.out.println(nome + " entrando no banheiro");

	        if (!this.ehSujo) {
	            System.out.println(nome + ", n�o est� sujo, vou sair");
	            return;
	        }

	        System.out.println(nome + " limpando o banheiro");
	        this.ehSujo = false;

	        try {
	            Thread.sleep(13000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        this.notifyAll();

	        System.out.println(nome + " saindo do banheiro");
	    }
	}
	
	private void esperaLaFora(String nome) {
		System.out.println(nome + ", eca, o banheiro est� sujo");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
