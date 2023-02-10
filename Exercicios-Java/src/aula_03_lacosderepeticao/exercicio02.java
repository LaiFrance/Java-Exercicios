package aula_03_lacosderepeticao;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numPar = 0;
		int numImpar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			int num = entrada.nextInt();

			if (num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}

		System.out.println("Total de números pares: " + numPar);
		System.out.println("Total de números ímpares: " + numImpar);
	}
}
