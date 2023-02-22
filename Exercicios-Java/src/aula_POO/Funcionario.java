package aula_POO;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String email;
	private double salario;
	
	public Funcionario(String nome, String cpf, String dataNascimento, String email, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("E-mail: " + this.email);
		System.out.println("Salário: " + this.salario);
	}
	
	public class TestaFuncionario {
		
		public static void main(String[] args) {
			
			Funcionario funcionario1 = new Funcionario("Fulano", "000.000.000-00", "01/01/2020", "fulano@gmail.com", 12000.00);
			Funcionario funcionario2 = new Funcionario("Ciclano", "000.000.000-00", "10/10/2020", "ciclano@gmail.com", 13000.00);
			
			funcionario1.visualizar();
			System.out.println();
			funcionario2.visualizar();
			
		}
}

	
}