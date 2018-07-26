package modelo;

public class Produto {
	
	public int cod_produto;
	public String nome_produto;
	public String descricao;
	public double valor;
	
	
	public Produto(int cod_produto, String nome_produto, String descricao, double valor) {
		super();
		this.cod_produto = cod_produto;
		this.nome_produto = nome_produto;
		this.descricao = descricao;
		this.valor = valor;
	}


	public int getCod_produto() {
		return cod_produto;
	}


	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}


	public String getNome_produto() {
		return nome_produto;
	}


	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod_produto;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome_produto == null) ? 0 : nome_produto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Produto other = (Produto) obj;
		if (cod_produto != other.cod_produto)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome_produto == null) {
			if (other.nome_produto != null)
				return false;
		} else if (!nome_produto.equals(other.nome_produto))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
	
	
	

}
