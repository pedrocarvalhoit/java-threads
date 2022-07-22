package thread.um;

class Printer{
	
	void imprimirDocumento(int numDeCopias, String docNome) {
		for(int i =1; i <= numDeCopias; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" >> Imprimir " + docNome + " " +  i);
		}
	}
}

class MinhaThread extends Thread{
	
	Printer pRef;
	
	MinhaThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized (pRef) {
			pRef.imprimirDocumento(10, "PerfilPedro.pdf");
		}
	}
}

class SuaThread extends Thread{
	
	Printer pRef;
	
	SuaThread(Printer p){
		pRef = p;
	}
	
	@Override
	public void run() {
		synchronized (pRef) {
			pRef.imprimirDocumento(10, "PerfilVictor.pdf");
		}
	}
}

public class MultiThread {
	
	public static void main(String[] args) {
		
		System.out.println("== Início==");
		
		Printer printer = new Printer();
//		printer.imprimirDocumento(10, "Perfil Pedro.pdf");
		
		MinhaThread mRef = new MinhaThread(printer);
		SuaThread vRef = new SuaThread(printer);
		
		mRef.start();
		
		vRef.start();
		
		
		System.out.println("==Fim==");
		
	}

}
