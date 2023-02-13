package aula_01_variaveis;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		float salarioLiquido;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o salário bruto? ");
		salarioBruto = entrada.nextFloat();
		System.out.println("Qual o adicional noturno? ");
		adicionalNoturno = entrada.nextFloat();
		System.out.println("Quantas horas extras foram trabalhadas? ");
		horasExtras = entrada.nextFloat();
		System.out.println("Qual o total de descontos? ");
		descontos = entrada.nextFloat();

		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.println("O salário líquido é R$ " + salarioLiquido);
	}

}
