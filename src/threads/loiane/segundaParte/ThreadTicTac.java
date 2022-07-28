package threads.loiane.segundaParte;

public class ThreadTicTac implements Runnable{
	
	TicTacNotify tt;
	Thread t;
	
	final int NUM = 5;

	public ThreadTicTac(String name, TicTacNotify tt) {
		this.tt = tt;
		t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		
		if(t.getName().equalsIgnoreCase("tic")) {
			for (int i = 0; i < NUM; i++) {
				tt.tic(true);
			}
			tt.tic(false);
		}else {
			for (int i = 0; i < NUM; i++) {
				tt.tac(true);
		}
			tt.tic(false);
	}	
}
}