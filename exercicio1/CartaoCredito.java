package interface_pagamento;

public class CartaoCredito implements Pagamento{
	@Override
	public void realizar_pagamento(double valor) {
		System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
	}
}
