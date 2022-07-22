package thread.deadlock;

public class TarefaAcessaProcedimento implements Runnable {
	
	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		
		synchronized (pool) {
			System.out.println("Pegue a conexão");
			pool.getConnection();
			
			synchronized(tx) {
				System.out.println("Começando a tx");
				tx.begin();
				
		}
		}
		
	}

}
