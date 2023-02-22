package aula_POO;

public class Cliente {
	 private String nome;
	    private String email;
	    private String cpf;
	    private String telefone;
	    private String endereco;
	    
	    //Método Construtor
	    public Cliente(String nome, String email, String cpf, String telefone, String endereco) {
	        this.nome = nome;
	        this.email = email;
	        this.cpf = cpf;
	        this.telefone = telefone;
	        this.endereco = endereco;
	    }
	    
	    //Métodos Get
	    public String getNome() {
	        return nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    //Métodos Set
	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }
	    
	    //Método visualizar
	    public void visualizar() {
	        System.out.println("Nome: "+this.nome);
	        System.out.println("Email: "+this.email);
	        System.out.println("CPF: "+this.cpf);
	        System.out.println("Telefone: "+this.telefone);
	        System.out.println("Endereco: "+this.endereco);
	    }
	    public class TestaCliente {
	    	public static void main(String[] args) {
	    		Cliente cliente1 = new Cliente("Laise Farias", "laise94@email.com", "000.000.000-00", "9 9291-3230", "Rua x, 123");
	    		Cliente cliente2 = new Cliente("Maria", "maria@email.com", "000.000.000-00", "9 9536-7777", "Rua y, 123");
	    		
	    		cliente1.visualizar();
	    		System.out.println("-------------------");
	    		cliente2.visualizar();
	    	}
	    }
	    
	}

