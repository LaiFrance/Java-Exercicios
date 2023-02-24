package aula_POO;

//Classe PessoaJuridica
public class PessoaJuridica extends Cliente {
	private String cnpj;

	// Método Construtor
	public PessoaJuridica(String nome, String email, String cpf, String telefone, String endereco, String cnpj) {
		super(nome, email, cpf, telefone, endereco);
		this.cnpj = cnpj;
	}

	// Métodos Get
	public String getCnpj() {
		return cnpj;
	}

	// Métodos Set
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	// Método Visualizar
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
}