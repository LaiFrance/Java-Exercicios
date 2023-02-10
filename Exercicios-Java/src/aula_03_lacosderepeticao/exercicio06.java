package aula_03_lacosderepeticao;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 1;
        double soma = 0;
        int quantidade = 0;
        double media = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = leitor.nextInt();
            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                quantidade++;
            }
        } while (numero != 0);
        leitor.close();
        media = soma / quantidade;
        System.out.println("A média de todos os números múltiplos de 3 é: " + media);
    }
}