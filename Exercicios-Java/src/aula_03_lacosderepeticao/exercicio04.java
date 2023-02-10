package aula_03_lacosderepeticao;

import java.util.Scanner;

public class exercicio04 {
	public class SomaMultiplos3 {
		  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int number, total = 0, count = 0;
		    
		    System.out.print("Digite um número: ");
		    number = input.nextInt();
		    
		    while (number != 0) {
		      if (number % 3 == 0) {
		        total = total + number;
		        count = count + 1;
		      }
		      System.out.print("Digite um número: ");
		      number = input.nextInt();
		    }
		    
		    if (count > 0) {
		      System.out.println("A média de todos os números múltiplos de 3 é: " + (total / count));
		    } else {
		      System.out.println("Não existem números múltiplos de 3");
		    }
		    
		    input.close();
		  }
		}
}
