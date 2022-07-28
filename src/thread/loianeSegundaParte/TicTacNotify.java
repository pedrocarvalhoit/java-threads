package thread.loianeSegundaParte;

public class TicTacNotify {

	boolean tic;

	synchronized void tic(boolean isRunning) {

		if (!isRunning) {
			tic = true;
			notify();
			return;
		}
		System.out.print("Tic");

		tic = true;

		notify();

		try {
			while (tic) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	synchronized void tac(boolean isRunning) {

		if (!isRunning) {
			tic = false;
			notify();
			return;
		}
		System.out.println("Tac");

		tic = false;

		notify();

		try {
			while (!tic) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
