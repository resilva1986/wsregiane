package br.com.lojagama.modelo;

public class Venda {

	private double valor;
	private String forma = new String();
	private String data = new String();
	
	public String getDia () {
		if (data.length()>2 ) {
			return data.substring(0,2);
		}
		return "Sem data válida";
		
		
	}

	@Override
	public String toString() {
		return "Venda [valor=" + valor + ", forma=" + forma + ", data=" + data + "]";
	}

	public Venda(int i, String string, Cliente cliente, Produto produto, Pagamento pagamento, int j) {
		super();
	}

	public Venda(double valor, String forma, String data) {
		super();
		this.valor = valor;
		this.forma = forma;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
