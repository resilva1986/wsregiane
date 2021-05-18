package br.com.bakofoz.implementar;

import br.com.bankofoz.beans.Agencia;
import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Endereco;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magic;

public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				"Regina",
				"regina@gamaacademy",
				"1234-5678",
				new Endereco(),
				1
				);
		
		Agencia agencia = new Agencia(
				"Itaquera",
				666,
				"6789-1234"
				);
		
		int resposta = Integer.parseInt(Magic.s("<1> Corrente\n<2> Poupanca"));
		while (resposta<1 || resposta>2) {
			resposta = Integer.parseInt(Magic.s("<1> Corrente\n<2> Poupanca"));
		}
		Conta conta = new Conta();
		double saldo = Magic.d("Saldo");
		int numero = Magic.i("Numero");
	if (resposta==1) {
			conta = new Corrente(
					numero,
					saldo,
					cliente,
					agencia,
					Magic.d("Limite"),
					Magic.d("Taxa")
					);
			
	}else {
				conta = new Poupanca(
					numero,
					saldo,
					cliente,
					agencia,
					Magic.d("Rendimento"),
					Magic.s("Aniversario")
					);
			}
					
			conta.depositar(1000);	
			System.out.println("Depositou:" + conta.getSaldo());
			conta.sacar(500);
			System.out.println("Sacou:" + conta.getSaldo());
			conta.sacar(100000);
			System.out.println("Sacou absurdo:" + conta.getSaldo());
			
			if (conta instanceof Poupanca) {
				((Poupanca) conta).creditarRendimentos();
				System.out.println("Dia:" + ((Poupanca) conta).getAniversario());
				System.out.println("Saldo:" + conta.getSaldo());
		}
		
		
		
		
	}

}
