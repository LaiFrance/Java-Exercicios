package beecrowd_exercicios;

import java.util.Scanner;
public class SomadeImparesConsecutivos {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int x = 6;
			int y = -5;
			
			int soma = 0;
			
			if(x < y) {
				for (int i = x+1; i < y; i++) {
					if(i % 2 != 0) {
						soma = soma + i;
					}
				}
				System.out.println(soma);
			}
			else {
				for (int i = y+1; i < x; i++) {
					if(i % 2 != 0) {
						soma = soma + i;
					}
				}
				System.out.println(soma);
			}
			
			sc.close();
		}
	}

