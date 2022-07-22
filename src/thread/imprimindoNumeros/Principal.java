package thread.imprimindoNumeros;

public class Principal {
	
	public static void main(String[] args) {
		//Desafio:  Crie um programa com duas threads que imprimem números de 1 até 1000, além da ID da thread.
		
		new Thread(new Impressora()).start();
		new Thread(new Impressora()).start();
		
	}

}
