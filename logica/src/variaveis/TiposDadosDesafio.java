package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Nome do produto");
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor de Compra"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		double valorVenda = valorCompra *1.2;
		double totalVenda = valorVenda* qtde;
		double impostos = totalVenda * 0.22;
		System.out.println("Produto: "+ produto);
		System.out.println("Valor Venda: " + valorVenda);
		System.out.println("Total (- Impostos):" + (totalVenda-impostos));
		
		
		
		
		                                                                                                                                      
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
