package aula_05_Estrutura_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		fila.add("A");
		fila.add("B");
		fila.add("C");
		fila.add("D");
		fila.add("E");
		fila.add("F");

		Iterator<String> iFila = fila.iterator();

		while (iFila.hasNext()) {
			System.out.println(iFila.next());
		}
		System.out.println("Removendo o primeiro elemento da fila: " + fila.poll());
		System.out.println("fila: " + fila);
		System.out.println("Removendo o primeiro elemento da fila: " + fila.peek());
		System.out.println("fila: " + fila);
		System.out.println("Removendo o primeiro elemento da fila: " + fila.size());
		System.out.println("fila: " + fila);
	}

}


