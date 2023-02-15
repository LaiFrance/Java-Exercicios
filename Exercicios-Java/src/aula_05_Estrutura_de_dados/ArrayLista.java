package aula_05_Estrutura_de_dados;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLista {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		int opcao = 0;
		double nota = 0.0;
		do {
			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar notas");
			System.out.println("3 - Procurar nota");
			System.out.println("4 - Remover nota");
			System.out.println("5 - Atualizar nota");
			System.out.println("6 - Sair");

			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota de 1 a 10: ");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println("Listar todas as nota: ");
				for (var listaNota : notas)
					System.out.println(listaNota);
				break;
			case 3:
				System.out.println("Procurar nota: ");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				if (notas.contains(nota)) {
					System.out.println("Nota encontrada" + nota + "na posição" + notas.indexOf(nota));
				} else {
					System.out.println("Nota não encontrada");
				}
				break;
			case 4:
				System.out.println("Remover nota: ");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				if (notas.contains(nota)) {
					notas.remove(nota);
					System.out.println("Nota removida");
				} else {
					System.out.println("Nota não encontrada");
				}
				break;
			case 5:
				System.out.println("Atualizar nota: ");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();
				if (notas.contains(nota)) {
					nota = leia.nextDouble();
					System.out.println("Digite a nova nota: ");
					double listanota = leia.nextDouble();
					notas.set(notas.indexOf(notas), listanota);
					System.out.println("Nota atualizada");
				} else {
					System.out.println("Nota não encontrada");
				}
				break;

			default:
				if (opcao > 6)
					System.out.println("Opção invalida");
			}
		} while (opcao != 6);
	}
}
