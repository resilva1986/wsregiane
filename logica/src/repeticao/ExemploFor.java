package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int cont=1;cont<110;cont+=1) {
			System.out.println(tabuada + "x" + cont + "=" + (tabuada*cont));
		}
		
		
		
		
		
		
		
		

	}

}
