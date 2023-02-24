package aula_POO;

//Classe PessoaFisica 
public class PessoaFisica extends Cliente {
	private int idade;

	// Método Construtor
	public PessoaFisica(String nome, String email, String cpf, String telefone, String endereco, int idade) {
		super(nome, email, cpf, telefone, endereco);
		this.idade = idade;
	}

	// Métodos Get
	public int getIdade() {
		return idade;
	}

	// Métodos Set
	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Método Visualizar
	public void visualizar() {
		super.visualizar();
		System.out.println("Idade: " + this.idade);
	}
}