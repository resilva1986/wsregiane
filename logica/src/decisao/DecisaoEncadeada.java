package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
	public static void main(String[] args) {

		short faltas = Short.parseShort(JOptionPane.showInputDialog ("Faltas"));
		String disciplina = JOptionPane.showInputDialog ("Disciplina").toUpperCase();

		if (faltas<20) {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("nota1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("nota2"));
			float media = (nota1+nota2)/2;


			// && => and    // || => or

			if(media>=6) {
				System.out.println(" Voc? foi aprovado na disciplina: " + disciplina);
			}

			else if(media<4 )	{
				System.out.println(" Voc? foi reprovado na disciplina: " + disciplina);
			}

			else  {
				System.out.println(" Voc? tem chance no exame");
			}

			System.out.println(" sua m?dia foi: " + media);	

		} else {
			System.out.println("Voc? foi reprovado por faltas.");
		}


	}




}
