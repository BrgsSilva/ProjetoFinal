package modelo;

public class DetalhePedido {
	private int iddetalhepedido;
	private int quantidade;
	private double valor;
	
	
	public int getIddetalhepedido() {
		return iddetalhepedido;
	}
	public void setIddetalhepedido(int iddetalhepedido) {
		this.iddetalhepedido = iddetalhepedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iddetalhepedido;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalhePedido other = (DetalhePedido) obj;
		if (iddetalhepedido != other.iddetalhepedido)
			return false;
		return true;
	}
		
}
