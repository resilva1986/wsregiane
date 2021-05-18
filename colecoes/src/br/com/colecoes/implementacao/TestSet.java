package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		
		lista.add("DEV");
		lista.add("ANALISTA");
		lista.add("GERENTE DE PROJETOS");
		lista.add("DBA");
		lista.add("DBA");
		System.out.println("Completa:" + lista);
		//collections.sort(lista);
		// Não utilizamos o for convencional com o Set
		/*
		 Para o Set o ideal e o foreach
		 */
		
		for (String cargo : lista) {
			System.out.println("Cargo:" + cargo);
		}

	}

}
