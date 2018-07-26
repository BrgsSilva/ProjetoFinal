package modelo;

public class PedidoProduto {
	
	public int codpedidoProduto;
	public int pPQuantidade;
	public int pPpreco;
	public Pedido pedido;
	public Produto produto;
	private Cliente cliente;
	
	
	
	public PedidoProduto(int codpedidoProduto, int pPQuantidade, int pPpreco, Pedido pedido, Produto produto,
			Cliente cliente) {
		super();
		this.codpedidoProduto = codpedidoProduto;
		this.pPQuantidade = pPQuantidade;
		this.pPpreco = pPpreco;
		this.pedido = pedido;
		this.produto = produto;
		this.cliente = cliente;
	}



	public int getCodpedidoProduto() {
		return codpedidoProduto;
	}



	public void setCodpedidoProduto(int codpedidoProduto) {
		this.codpedidoProduto = codpedidoProduto;
	}



	public int getpPQuantidade() {
		return pPQuantidade;
	}



	public void setpPQuantidade(int pPQuantidade) {
		this.pPQuantidade = pPQuantidade;
	}



	public int getpPpreco() {
		return pPpreco;
	}



	public void setpPpreco(int pPpreco) {
		this.pPpreco = pPpreco;
	}



	public Pedido getPedido() {
		return pedido;
	}



	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + codpedidoProduto;
		result = prime * result + pPQuantidade;
		result = prime * result + pPpreco;
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
		PedidoProduto other = (PedidoProduto) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (codpedidoProduto != other.codpedidoProduto)
			return false;
		if (pPQuantidade != other.pPQuantidade)
			return false;
		if (pPpreco != other.pPpreco)
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
	
	
	
	
	
	


	
	
	
	
	
}
