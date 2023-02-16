package aula_05_0_Estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			Queue<String> fila = new LinkedList<String>();

			int opcao = -1;
			while (opcao != 0) {
				System.out.println("\nMenu:");
				System.out.println("1-Adicionar Cliente na Fila");
				System.out.println("2-Listar todos os clientes");
				System.out.println("3-Retirar Cliente da Fila");
				System.out.println("0-Sair");
				System.out.print("Entre com a opção desejada: ");
				opcao = leia.nextInt();

				if (opcao == 1) {
					System.out.print("Digite o nome: ");
					String nome = leia.next();
					fila.add(nome);
					System.out.println("Fila:");
					System.out.println("Cliente adicionado!");
				} else if (opcao == 2) {
					for (String nome : fila) {
						System.out.println(nome);
					}
				} else if (opcao == 3) {
					if (fila.isEmpty()) {
						System.out.println("A Fila está vazia!");
					} else {
						String nome = fila.poll();
						System.out.println("Fila:");
						System.out.println("Cliente retirado: " + nome);
					}
				}
			}
		}
		System.out.println("Programa finalizado!");
	}

}