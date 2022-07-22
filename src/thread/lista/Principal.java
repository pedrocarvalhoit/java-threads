package thread.lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

     	Lista lista = new Lista();
   
        for (int i = 0; i < 100; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }
        
        new Thread(new TarefaImprimir(lista)).start();
       
    }
}