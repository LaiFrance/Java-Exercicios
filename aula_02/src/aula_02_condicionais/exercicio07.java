package aula_02_condicionais;

import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
		float numero1, numero2;
		int codigo;
		float resultado;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o 1º número: ");
		numero1 = teclado.nextFloat();
		System.out.print("Digite o 2º número: ");
		numero2 = teclado.nextFloat();
		System.out.print("Operação: ");
		codigo = teclado.nextInt();

		switch (codigo) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + resultado);
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}
	}

}
