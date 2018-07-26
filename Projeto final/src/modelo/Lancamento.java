package modelo;

public class Lancamento {
	
	protected String data;
	protected String descricao;
	protected double valor;
	
	
	public Lancamento() {
		
	}


	public Lancamento(String data, String descricao, double valor) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		
		 return "Lancamento{" + "data=" + data + ", descricao=" + descricao + ", valor=" + valor + '}';
	
	}
	
}	
	