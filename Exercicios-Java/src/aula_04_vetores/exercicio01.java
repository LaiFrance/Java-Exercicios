package aula_04_vetores;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar: ");
		int numero = sc.nextInt();
		int posicao = -1;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			}
		}

		if (posicao >= 0) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("Não foi encontrado!");
		}
	}
}