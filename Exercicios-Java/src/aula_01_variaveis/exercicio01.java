package aula_01_variaveis;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o salário bruto: ");
		float salarioBruto = input.nextFloat();
		System.out.println("Informe o Abono: ");
		float salarioAdd = input.nextFloat();

		float salarioNovo = salarioBruto + salarioAdd;
		System.out.println("O novo salário é: " + salarioNovo);
	}
}
