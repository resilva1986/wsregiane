package br.com.excecao.teste;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		
		
		
		try {
			//DriverManager.getConnection("","","");
			//int numero = Integer.parseInt("1");
			//System.out.println("Numero: " + numero);

			//String palavra="";
			//System.out.println("Qtde Letras:" + palavra.length());
			
			String palavras[] = new String[10];
			int indice = 0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			
			}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Vetores", JOptionPane.YES_NO_OPTION)==0);
			
			System.out.println(palavras); //posicao de memoria
			for (int contador=0;contador<indice;contador++) {
				System.out.println("Palavra n°" + (contador+1) + ":" + palavras[contador]);
			}
		
		
		}catch(Exception e) {
			System.err.println(MinhaExcecao.tratar(e));
			
		}finally {
			System.out.println("Volte Sempre");
			//encerrar banco de dados
		}
		

	}

}
