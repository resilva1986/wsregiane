package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Digite o email com @").toLowerCase();
		}

		System.out.println("Usu�rio: "+email.substring(0, email.indexOf("@")));
		String nome = JOptionPane.showInputDialog("Digite o nome").toLowerCase();


		while(nome.length()<=3 || nome.length()>=15) {
			nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		}

		
			System.out.println("Nome: " + nome);


		}



	}
