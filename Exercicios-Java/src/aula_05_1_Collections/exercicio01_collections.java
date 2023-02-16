package aula_05_1_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio01_collections {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 5 cores:");
		for (int i = 0; i < 5; i++) {
			cores.add(sc.nextLine());
		}

		System.out.println("Listar todas as cores:");
		for (String s : cores) {
			System.out.println(s);
		}

		Collections.sort(cores);

		System.out.println("Ordenar as cores:");
		for (String s : cores) {
			System.out.println(s);
		}
		sc.close();
	}

}
