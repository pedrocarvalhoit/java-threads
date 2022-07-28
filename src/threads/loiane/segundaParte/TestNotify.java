package threads.loiane.segundaParte;

public class TestNotify {
	public static void main(String[] args) {
		
		TicTacNotify tt = new TicTacNotify();
		ThreadTicTac tic = new ThreadTicTac("Tic", tt);
		ThreadTicTac tac = new ThreadTicTac("Tac", tt);
		
		try {
			tic.t.join();
			tac.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
