package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float fgts = salario * (float) 0.08; // Ocorre o casting
		int numero = 5;
		byte resultado = (byte) (numero + 2) ; //Ocorre o casting
		
	}
	
	
}
