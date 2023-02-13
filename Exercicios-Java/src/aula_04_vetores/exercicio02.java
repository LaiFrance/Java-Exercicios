package aula_04_vetores;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		 
        int[] vetor = new int[10];
        int soma = 0;
        double media;
        Scanner teclado = new Scanner(System.in);
 
        // Ler os 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = teclado.nextInt();
        }
 
        // Exibir os elementos no índice ímpar
        System.out.print("Elementos nos índices ímpares: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
 
        // Exibir os elementos pares
        System.out.print("Elementos pares: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
 
        // Soma de todos os elementos
        for (int i = 0; i < 10; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("Soma: " + soma);
 
        // Média dos elementos
        media = (double) soma / 10;
        System.out.println("Média: " + media);
    }
}
