package modelo;

public class Pedido {
	
	public int cod_pedido;
	public String descricao_pedido;
	public Produto produto;
	private Cliente cliente;
	private Endereco endereco;
	
	
	public Pedido(int cod_pedido, String descricao_pedido, Produto produto, Cliente cliente, Endereco endereco) {
		super();
		this.cod_pedido = cod_pedido;
		this.descricao_pedido = descricao_pedido;
		this.produto = produto;
		this.cliente = cliente;
		this.endereco = endereco;
	}


	public int getCod_pedido() {
		return cod_pedido;
	}


	public void setCod_pedido(int cod_pedido) {
		this.cod_pedido = cod_pedido;
	}


	public String getDescricao_pedido() {
		return descricao_pedido;
	}


	public void setDescricao_pedido(String descricao_pedido) {
		this.descricao_pedido = descricao_pedido;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + cod_pedido;
		result = prime * result + ((descricao_pedido == null) ? 0 : descricao_pedido.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (cod_pedido != other.cod_pedido)
			return false;
		if (descricao_pedido == null) {
			if (other.descricao_pedido != null)
				return false;
		} else if (!descricao_pedido.equals(other.descricao_pedido))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
	
	
	
	
	

}
