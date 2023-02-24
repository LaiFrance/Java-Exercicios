package aula_06_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia extends Farmacia {

	public TestaFarmacia(long id, String nome, String nomeComercial, String fabricante, String foto, float preco) {
		super(id, nome, nomeComercial, fabricante, foto, preco);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		long id;
		String nome, nomeComercial, fabricante, foto, opcao;
		float preco;
		
		do {
			
		System.out.println("\nId: " );
		id = leia.nextLong();
		
		System.out.println("\nNome: " );
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nNome Comercial: " );
		nomeComercial = leia.nextLine();
		
		System.out.println("\nFabricante: " );
		fabricante = leia.nextLine();
		
		System.out.println("\nFoto: " );
		foto = leia.nextLine();
		
		System.out.println("\nPreÃ§o: " );
		preco = leia.nextFloat();
		
		Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);
		
		medicamentos.add(f1);
		
		System.out.println("\nDeseja continuar? " );
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Quimica", "-", 20.0f);

		f2.visualizar();
		
		leia.close();
	}

}
