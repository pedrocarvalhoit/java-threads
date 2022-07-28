package projeto.treinoPeitoral;

/**
 * S� existe 1 banco, ent�o � preciso esperar o fim de um exerc�cio para iniciar
 * outro
 */
public class ThreadPeitoral implements Runnable {

	private String exercicio;
	private int repeticoes;

	public ThreadPeitoral(String exercicio, int repeticoes) {
		super();
		this.exercicio = exercicio;
		this.repeticoes = repeticoes;
		new Thread(this).start();
	}

	@Override
	public void run() {

	}

	public void executarSupino() {

		System.out.println("--- Iniciando treino ---");

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ajustando o aparelho: " + this.exercicio);

		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Bora la, iniciando repeti��es.");

	}
	
	public void executarVoador() {

		System.out.println("--- Iniciando treino ---");

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ajustando o aparelho: " + this.exercicio);

		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Bora la, iniciando repeti��es.");

	}

	public void setRepeticoes() {

		try {
			for (int i = 0; i <= this.repeticoes; i++) {
				System.out.println("Repeti��o: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fim da s�rie");
	}

}
