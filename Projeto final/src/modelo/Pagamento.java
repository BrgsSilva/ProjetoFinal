package modelo;



public class Pagamento extends Lancamento {
	
	int tipo;
	
	public final int Dinheiro = 1;
	public final int Cartao = 2;
	
	
	public Pagamento(int tipo, String data, String descricao, double valor) {
		super(data, descricao, valor);
		this.tipo = tipo;
	}


	public Pagamento(int tipo) {
		super();
		this.tipo = tipo;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "Pagamento{ " + data +  ", " + descricao + ", " + valor + "(C), " + tipo + '}';
	}

}
