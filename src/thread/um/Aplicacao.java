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
		//Threads sempre ir�o executar as fun��es em sequ�ncia.

		//Tarefa 1
		System.out.println("==In�cio Aplica��o==");
		
		//Agora que a classe � uma Thread, ela roda em simult�neo com o Main.
		//Tarefa 2
		Thread tarefa = new Thread(new MinhaTarefa());
		tarefa.setDaemon(true);
		tarefa.start();
		
		
		
		//Tarefa 3
		for(int doc = 1; doc <= 10; doc++ ) {
			System.out.println("Documento # " + doc + "Impressora 1");
		}
		//Tarefa 4
		System.out.println("==Fim Aplica��o==");
		
		//Tarefa 5 -> Melhorand a escrita
		new Thread(new SuaTarefa()).start();
	}

}
