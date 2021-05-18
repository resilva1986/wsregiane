package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {


		
		Aluno aluno = new Aluno ();
		
		aluno.setBasico("Regiane",  12345);
		aluno.setCpf("12345678911");
		aluno.setEmail("regiane@yahoo.com.br");
		aluno.setFone("4141-2841"); 
		
		Endereco endereco = new Endereco ();
		endereco.setBairro("Itaquera");
		endereco.setCep("12345-678");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("Viela5");
		endereco.setEstado("SP");
		endereco.setLogradouro("Avenida Itaquera");
		endereco.setNumero("5A");
		
		aluno.setEndereco(endereco);
		
		System.out.println(aluno.toString());

	}

}
