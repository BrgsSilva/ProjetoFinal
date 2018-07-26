package modelo;

public class Cliente {
	
	private int cod_cliente;
	private String nome;
	private String sobrenome;
	private String data_nascimento;
	private String cpf;
	private String email;
	private String senha;
	private Endereco endereco;
	private ClienteContato clientecontato;
	public PedidoProduto produtopedido;
	
	
	public Cliente(int cod_cliente, String nome, String sobrenome, String data_nascimento, String cpf, String email,
			String senha, Endereco endereco, ClienteContato clientecontato, PedidoProduto produtopedido) {
		super();
		this.cod_cliente = cod_cliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.clientecontato = clientecontato;
		this.produtopedido = produtopedido;
	}


	public int getCod_cliente() {
		return cod_cliente;
	}


	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getData_nascimento() {
		return data_nascimento;
	}


	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public ClienteContato getClientecontato() {
		return clientecontato;
	}


	public void setClientecontato(ClienteContato clientecontato) {
		this.clientecontato = clientecontato;
	}


	public PedidoProduto getProdutopedido() {
		return produtopedido;
	}


	public void setProdutopedido(PedidoProduto produtopedido) {
		this.produtopedido = produtopedido;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientecontato == null) ? 0 : clientecontato.hashCode());
		result = prime * result + cod_cliente;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((data_nascimento == null) ? 0 : data_nascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (clientecontato == null) {
			if (other.clientecontato != null)
				return false;
		} else if (!clientecontato.equals(other.clientecontato))
			return false;
		if (cod_cliente != other.cod_cliente)
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (data_nascimento == null) {
			if (other.data_nascimento != null)
				return false;
		} else if (!data_nascimento.equals(other.data_nascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}	
	
	
	
	