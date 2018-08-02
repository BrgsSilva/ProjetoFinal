package modelo;

public class Contato {
	private int idcontato;
	private String telefone;
	private String celular;
	private String email;
	
	private Cliente cliente;
	
		
	public Contato() {
		
	}


	public Contato(int idcontato, String telefone, String celular, String email, Cliente cliente) {
		super();
		this.idcontato = idcontato;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.cliente = cliente;
	}


	public int getIdcontato() {
		return idcontato;
	}


	public void setIdcontato(int idcontato) {
		this.idcontato = idcontato;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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
		result = prime * result + idcontato;
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
		Contato other = (Contato) obj;
		if (idcontato != other.idcontato)
			return false;
		return true;
	}

}
	
	
	