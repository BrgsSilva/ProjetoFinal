package modelo;

public class Pagamento {
	private int idpagamento;
	private String formapagamento;
	
	
	public int getIdpagamento() {
		return idpagamento;
	}
	public void setIdpagamento(int idpagamento) {
		this.idpagamento = idpagamento;
	}
	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idpagamento;
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
		Pagamento other = (Pagamento) obj;
		if (idpagamento != other.idpagamento)
			return false;
		return true;
	}
	
}
