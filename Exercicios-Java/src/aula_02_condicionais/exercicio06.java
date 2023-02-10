package aula_02_condicionais;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do colaborador: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o código do cargo: ");
		int codigo = entrada.nextInt();
		System.out.print("Digite o salário: R$");
		float salario = entrada.nextFloat();

		float novoSalario = salario;
		switch (codigo) {
		case 1:
			novoSalario = salario + (salario * 0.10f);
			break;
		case 2:
			novoSalario = salario + (salario * 0.07f);
			break;
		case 3:
			novoSalario = salario + (salario * 0.09f);
			break;
		case 4:
			novoSalario = salario + (salario * 0.06f);
			break;
		case 5:
			novoSalario = salario + (salario * 0.05f);
			break;
		case 6:
			novoSalario = salario + (salario * 0.08f);
			break;
		default:
			break;
		}

		String cargo = "";
		switch (codigo) {
		case 1:
			cargo = "Gerente";
			break;
		case 2:
			cargo = "Vendedor";
			break;
		case 3:
			cargo = "Supervisor";
			break;
		case 4:
			cargo = "Motorista";
			break;
		case 5:
			cargo = "Estoquista";
			break;
		case 6:
			cargo = "Técnico de TI";
			break;
		default:
			break;
		}

		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$ " + novoSalario);
	}
}
