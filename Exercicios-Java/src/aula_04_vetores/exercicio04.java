package aula_04_vetores;

public class exercicio04 {
	public static void main(String[] args) {
		double[][] notas = new double[][] { { 4.0, 5.0, 7.0, 3.0 }, { 2.5, 6.5, 4.7, 8.0 }, { 10.0, 8.5, 9.5, 8.0 },
				{ 9.0, 6.5, 7.6, 8.2 }, { 5.0, 5.0, 5.0, 6.3 }, { 7.0, 8.0, 9.0, 8.5 }, { 5.5, 3.5, 2.5, 1.0 },
				{ 8.0, 9.0, 10.0, 9.5 }, { 5.6, 5.8, 6.5, 7.0 }, { 7.5, 8.5, 9.5, 10.0 } };

		double[] media = new double[10];

		for (int i = 0; i < 10; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			media[i] = soma / 4;
		}

		System.out.println("Médias dos alunos:");
		for (int i = 0; i < 10; i++) {
			System.out.print(media[i] + " ");
		}
	}

}
