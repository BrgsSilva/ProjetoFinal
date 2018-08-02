package modelo;

public class DetalhePedido {
	
	private int iddetalhepedido;
	private  String quantidade;
	private double valor;
	private int idpedido;
	
	public DetalhePedido() {
	
	}

	public DetalhePedido(int iddetalhepedido, String quantidade, double valor, int idpedido) {
		super();
		this.iddetalhepedido = iddetalhepedido;
		this.quantidade = quantidade;
		this.valor = valor;
		this.idpedido = idpedido;
	}

	public int getIddetalhepedido() {
		return iddetalhepedido;
	}

	public void setIddetalhepedido(int iddetalhepedido) {
		this.iddetalhepedido = iddetalhepedido;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
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