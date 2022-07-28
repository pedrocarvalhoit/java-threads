package projeto.treinoPeitoral;

/**Classe para execução de alguns exercícios de treino de força para peitoral */
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
