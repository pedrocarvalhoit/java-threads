package projeto.treinoPeitoral;

/**Classe para execu��o de alguns exerc�cios de treino de for�a para peitoral */
public class TreinoPeitoral {
	public static void main(String[] args) {
		
		ThreadPeitoral supino  = new ThreadPeitoral("Supino", 15);
		ThreadPeitoral voador = new ThreadPeitoral("Voador", 12);
	
		supino.executarSupino();
		supino.setRepeticoes();
		
		voador.executarVoador();
		voador.setRepeticoes();
		
		
		
		
	}

}
