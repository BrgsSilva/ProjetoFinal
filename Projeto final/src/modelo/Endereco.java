package modelo;

public class Endereco {
	private int idendereco;
	private String logradouro;
	private int numero;
	private String complemento;
	private String cidade;
	private String bairro;
	private String cep;
	
	private Cliente cliente;
	
	public Endereco() {
		
	}

	public Endereco(int idendereco, String logradouro, int numero, String complemento, String cidade, String bairro,
			String cep, Cliente cliente) {
		super();
		this.idendereco = idendereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.cliente = cliente;
	}

	public int getIdendereco() {
		return idendereco;
	}

	public void setIdendereco(int idendereco) {
		this.idendereco = idendereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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
		result = prime * result + idendereco;
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
		Endereco other = (Endereco) obj;
		if (idendereco != other.idendereco)
			return false;
		return true;
	}
	
	
	
	
}
