package aula_03_lacosderepeticao;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		int idade;
		int sexo;
		int categoria;
		int totalBackend = 0;
		int totalFrontendFeminino = 0;
		int totalMobileMasculino = 0;
		int totalFullStackFeminino = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite a Idade:");
			idade = scanner.nextInt();
			
			System.out.println("Digite o Sexo:");
			sexo = scanner.nextInt();
			
			System.out.println("Digite a Categoria:");
			categoria = scanner.nextInt();
			
			if (categoria == 1) {
				totalBackend++;
			}
			
			if (sexo == 2 && categoria == 2) {
				totalFrontendFeminino++;
			}
			
			if (sexo == 1 && categoria == 3 && idade > 40) {
				totalMobileMasculino++;
			}
			
			if (sexo == 2 && categoria == 4 && idade < 30) {
				totalFullStackFeminino++;
			}
			
			System.out.println("Deseja continuar (S/N):");
			String resposta = scanner.next();
			
			if (resposta.equals("N")) {
				break;
			}
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + totalFrontendFeminino);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + totalMobileMasculino);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + totalFullStackFeminino);
	}

}
