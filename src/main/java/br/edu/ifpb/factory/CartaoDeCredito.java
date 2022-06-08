package br.edu.ifpb.factory;

import br.edu.ifpb.Pagamento;

public class CartaoDeCredito implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando via Boleto o valor de: "+valor);
    }
}
