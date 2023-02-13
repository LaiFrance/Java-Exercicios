package aula_04_vetores;

public class exercicio03 {
	public static void main(String[] args) {
		// Matriz com dados do tipo inteiro

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		System.out.println("Elementos da Diagonal Principal:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
			somaPrincipal += matriz[i][i];
		}
		System.out.println();
		System.out.println("Elementos da Diagonal Secundária:");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
			somaSecundaria += matriz[i][2 - i];
		}
		System.out.println();
		System.out.println("Soma dos Elementos da Diagonal Principal:");
		System.out.println(somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária:");
		System.out.println(somaSecundaria);
	}
}