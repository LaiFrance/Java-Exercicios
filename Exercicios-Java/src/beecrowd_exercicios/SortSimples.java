package beecrowd_exercicios;

import java.util.Scanner;

public class SortSimples {
	
	 
	 public static void main(String[] args) {
	 
	  Scanner sc = new Scanner(System.in);
	  
	  int n1 = 30;
	  int n2 = 14;
	  int n3 = 4;
	  
	  int menor, meio, maior;
	  
	  if(n1 < n2 && n1 < n3) {
	   menor = n1;
	   if(n2 < n3) {
	    meio = n2;
	    maior = n3;
	   } else {
	    meio = n3;
	    maior = n2;
	   }
	  } else if(n2 < n1 && n2 < n3) {
	   menor = n2;
	   if(n1 < n3) {
	    meio = n1;
	    maior = n3;
	   } else {
	    meio = n3;
	    maior = n1;
	   }
	  } else {
	   menor = n3;
	   if(n1 < n2) {
	    meio = n1;
	    maior = n2;
	   } else {
	    meio = n2;
	    maior = n1;
	   }
	  }
	  
	  System.out.println(menor);
	  System.out.println(meio);
	  System.out.println(maior);
	  System.out.println();
	  System.out.println(n1);
	  System.out.println(n2);
	  System.out.println(n3);
	 
	 }
	 
	
}
