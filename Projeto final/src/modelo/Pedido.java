package modelo;

public class Pedido {
	private int idpedido;
	private String data;
	
	private DetalhePedido detalhe;
	private Produto produto;
	private Cliente cliente;
	private Pagamento pagamento;
	
	public Pedido() {
	
	}

	public Pedido(int idpedido, String data, DetalhePedido detalhe, Produto produto, Cliente cliente,
			Pagamento pagamento) {
		super();
		this.idpedido = idpedido;
		this.data = data;
		this.detalhe = detalhe;
		this.produto = produto;
		this.cliente = cliente;
		this.pagamento = pagamento;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DetalhePedido getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(DetalhePedido detalhe) {
		this.detalhe = detalhe;
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

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

}