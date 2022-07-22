package thread.um;

/*class MinhaTarefa {
	void executarTarefa() {
		for(int doc = 1; doc <= 10; doc++ ) {
			System.out.println("@@ Documento # " + doc + "Impressora 2");
		}

	}	
}*/

//Criando uma classe Thread
class MinhaTarefa implements Runnable{
	@Override
	public void run() {
		for(int doc = 1; doc <= 10; doc++ ) {
			System.out.println("@@ Documento # " + doc + "Impressora 2");
		}

	}	
}

class SuaTarefa implements Runnable{
	@Override
	public void run() {
		for(int doc = 1; doc <= 10; doc++ ) {
			System.out.println("@@ Documento # " + doc + "Impressora 3");
		}

	}	
}

public class Aplicacao {
	
	//O main representa a Tread principal
	public static void main(String[] args) {
		//Threads sempre irão executar as funções em sequência.

		//Tarefa 1
		System.out.println("==Início Aplicação==");
		
		//Agora que a classe é uma Thread, ela roda em simultâneo com o Main.
		//Tarefa 2
		Thread tarefa = new Thread(new MinhaTarefa());
		tarefa.setDaemon(true);
		tarefa.start();
		
		
		
		//Tarefa 3
		for(int doc = 1; doc <= 10; doc++ ) {
			System.out.println("Documento # " + doc + "Impressora 1");
		}
		//Tarefa 4
		System.out.println("==Fim Aplicação==");
		
		//Tarefa 5 -> Melhorand a escrita
		new Thread(new SuaTarefa()).start();
	}

}
