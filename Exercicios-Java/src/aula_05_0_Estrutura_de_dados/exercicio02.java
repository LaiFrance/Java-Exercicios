package aula_05_0_Estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		Stack<String> pilhaLivros = new Stack<String>();

		do {
			System.out.println("\nMenu: ");
			System.out.println("\n1-Adicionar Livro na pilha");
			System.out.println("\n2-Listar todos os Livros");
			System.out.println("\n3-Retirar Livro da pilha");
			System.out.println("\n0-Sair");
			System.out.print("\nEntre com a opção desejada: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome: ");
				String nomeLivro = entrada.next();
				pilhaLivros.push(nomeLivro);
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				System.out.println("\nPilha: ");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				break;
			case 3:
				if (!pilhaLivros.empty()) {
					System.out.println("\nLivro retirado:");
					System.out.println(pilhaLivros.pop());
				} else {
					System.out.println("\nPilha vazia!");
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
			}
		} while (opcao != 0);
	}

}
