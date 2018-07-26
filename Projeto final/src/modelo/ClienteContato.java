package modelo;

public class ClienteContato {
	
	private int cod_clientecontato;
	private String clientecontato;
	private Cliente cliente;
	
	
	
	public ClienteContato(int cod_clientecontato, String clientecontato, Cliente cliente) {
		
		this.cod_clientecontato = cod_clientecontato;
		this.clientecontato = clientecontato;
		this.cliente = cliente;
	}



	public int getCod_clientecontato() {
		return cod_clientecontato;
	}



	public void setCod_clientecontato(int cod_clientecontato) {
		this.cod_clientecontato = cod_clientecontato;
	}



	public String getClientecontato() {
		return clientecontato;
	}



	public void setClientecontato(String clientecontato) {
		this.clientecontato = clientecontato;
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
		result = prime * result + ((clientecontato == null) ? 0 : clientecontato.hashCode());
		result = prime * result + cod_clientecontato;
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
		ClienteContato other = (ClienteContato) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (clientecontato == null) {
			if (other.clientecontato != null)
				return false;
		} else if (!clientecontato.equals(other.clientecontato))
			return false;
		if (cod_clientecontato != other.cod_clientecontato)
			return false;
		return true;
	}
	
	
	

}
