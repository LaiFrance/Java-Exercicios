package aula_05_1_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio03_Set {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Scanner input = new Scanner(System.in);
		int value;
		System.out.println("Digite 10 valores inteiros não repetidos:");
		for (int i = 0; i < 10; i++) {
			value = input.nextInt();
			set.add(value);
		}
		// Mostrando os dados do Set
		System.out.println("\nListar dados do Set:");
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}