package aula_03_lacosderepeticao;

import java.util.Scanner;

public class exercicio05 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int number, total = 0;
		    
		    System.out.print("Digite um número: ");
		    number = input.nextInt();
		    
		    while (number != 0) {
		      if (number > 0) {
		        total = total + number;
		      }
		      System.out.print("Digite um número: ");
		      number = input.nextInt();
		    }
		    
		    System.out.println("A soma dos números positivos é: " + total);
		    
		    input.close();
		  }
		

}
