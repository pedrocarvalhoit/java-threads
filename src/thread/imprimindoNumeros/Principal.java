package thread.imprimindoNumeros;

public class Principal {
	
	public static void main(String[] args) {
		//Desafio:  Crie um programa com duas threads que imprimem n�meros de 1 at� 1000, al�m da ID da thread.
		
		new Thread(new Impressora()).start();
		new Thread(new Impressora()).start();
		
	}

}
