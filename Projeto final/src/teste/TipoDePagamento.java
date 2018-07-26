package teste;

public class TipoDePagamento {
	
	public void ExecutarPagamento(String[] args) {

		Pagamento pagamento = new Pagamento();
		
		pagamento.setForma_pagamento("cartao");
		pagamento.setValor(500d);
		
		Pagamento dinheiro = new Pagamento();
		
		dinheiro.setForma_pagamento("dinheiro");
		dinheiro.setValor(500d);
	}
}
