package aula_POO;


public class TestaCliente {
	public static void main(String[] args) {
		PessoaFisica pessoaF1 = new PessoaFisica("Laise Farias", "laise94@email.com", "000.000.000-00", "9 9291-3230", "Rua x, 123", 30);
		PessoaFisica pessoaF2 = new PessoaFisica("Maria", "maria@email.com", "000.000.000-00", "9 9536-7777", "Rua y, 123", 46);
		PessoaJuridica pessoaJ1 = new PessoaJuridica("Empresa Lai dev", "ltdadev@email.com", "000.000.000-00", "9 9291-3230", "Rua x, 123", "54.562.000/0001-00");
		PessoaJuridica pessoaJ2 = new PessoaJuridica("Empresa javalai", "javalai@email.com", "000.000.000-00", "9 9536-7777", "Rua y, 123", "00.000.000/0001-00");
		
		pessoaF1.visualizar();
		System.out.println("-------------------");
		pessoaF2.visualizar();
		System.out.println("-------------------");
		pessoaJ1.visualizar();
		System.out.println("-------------------");
		pessoaJ2.visualizar();
	}

}