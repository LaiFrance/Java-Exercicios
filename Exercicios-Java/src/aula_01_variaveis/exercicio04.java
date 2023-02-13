package aula_01_variaveis;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro valor n1 : ");
		float n1 = entrada.nextFloat();
		System.out.println("Digite o segundo valor n2 : ");
		float n2 = entrada.nextFloat();
		System.out.println("Digite o terceiro valor n3 : ");
		float n3 = entrada.nextFloat();
		System.out.println("Digite o quarto valor n4 : ");
		float n4 = entrada.nextFloat();

		float resultado = (n1 * n2) - (n3 * n4);

		System.out.println("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: " + resultado);

	}

}
