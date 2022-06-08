package br.edu.ifpb.template;

import br.edu.ifpb.Compra;
import br.edu.ifpb.Confirmacao;
import br.edu.ifpb.Pagamento;
import br.edu.ifpb.factory.CartaoDeCredito;

public class ConfirmacaoAPrazo extends Confirmacao {
    public ConfirmacaoAPrazo(Compra compra) {
        super(compra);
    }

    @Override
    protected Pagamento pagamento() {
        return new CartaoDeCredito();
    }
//    @Override
//    protected void pagar(double valorTotal) {
//        System.out.println("Pagamento a prazo no valor de: "+valorTotal);
//    }

    @Override
    protected void concluir(Compra compra) {
        System.out.println("Aguardando o pagamento da compra....");
    }
}
