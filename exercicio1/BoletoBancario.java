package interface_pagamento;

public class BoletoBancario implements Pagamento {
    @Override
    public void realizar_pagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto Bancário.");
    }
}
