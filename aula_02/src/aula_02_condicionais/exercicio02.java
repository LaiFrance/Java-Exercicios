package aula_02_condicionais;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " é par");
		} else {
			System.out.println(numero + " é ímpar");
		}

		if (numero >= 0) {
			System.out.println(numero + " é positivo");
		} else {
			System.out.println(numero + " é negativo");
		}
	}
}
