package aula_02_condicionais;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o código do produto:");
		int codigo = scanner.nextInt();

		System.out.println("Digite a quantidade:");
		int quantidade = scanner.nextInt();
		double preco, total;

		switch (codigo) {
		case 1:
			preco = 10.00;
			total = quantidade * preco;
			System.out.println("Produto escolhido: Cachorro Quente");
			System.out.println("Valor total da conta: R$" + total);
			break;
		case 2:
			preco = 15.00;
			total = quantidade * preco;
			System.out.println("Produto escolhido: X-Salada");
			System.out.println("Valor total da conta: R$" + total);
			break;
		case 3:
			preco = 18.00;
			total = quantidade * preco;
			System.out.println("Produto escolhido: X-Bacon");
			System.out.println("Valor total da conta: R$" + total);
			break;
		case 4:
			preco = 12.00;
			total = quantidade * preco;
			System.out.println("Produto escolhido: Bauru");
			System.out.println("Valor total da conta: R$" + total);
			break;
		case 5:
			preco = 8.00;
			total = quantidade * preco;
			System.out.println("Produto escolhido: Refrigerante");
			System.out.println("Valor total da conta: R$" + total);
			break;
		case 6:
			preco = 13.00;
			total = quantidade * preco;
			System.out.println("Produto escolhido: Suco de laranja");
			System.out.println("Valor total da conta: R$" + total);
			break;
		default:
			System.out.println("Produto inválido!");
		}
	}
}