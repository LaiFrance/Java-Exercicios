package aula_02_condicionais;

import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float saldo = 1000.00f;

		System.out.println("Digite o código da operação (1-Saldo, 2-Saque, 3-Depósito): ");
		int codigoOperacao = scanner.nextInt();

		switch (codigoOperacao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$ " + saldo);
			break;

		case 2:
			System.out.println("Operação - Saque");
			System.out.println("Digite o valor do saque: ");
			float valorSaque = scanner.nextFloat();

			if (valorSaque <= saldo) {
				saldo -= valorSaque;
				System.out.println("Novo Saldo: R$ " + saldo);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			break;

		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Digite o valor do depósito: ");
			float valorDeposito = scanner.nextFloat();

			saldo += valorDeposito;
			System.out.println("Novo Saldo: R$ " + saldo);
			break;

		default:
			System.out.println("Operação Inválida!");
			break;
		}
	}
}