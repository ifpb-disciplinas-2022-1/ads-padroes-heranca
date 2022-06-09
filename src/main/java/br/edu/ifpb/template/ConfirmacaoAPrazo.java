package br.edu.ifpb.template;

import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.Pagamento;
import br.edu.ifpb.domain.Venda;
import br.edu.ifpb.abstractfactory.Confirmacao;
import br.edu.ifpb.factory.CartaoDeCredito;

public class ConfirmacaoAPrazo extends Confirmacao {
    public ConfirmacaoAPrazo(Venda compra) {
        super(compra);
    }

    @Override
    protected Pagamento pagamento() {
        return new CartaoDeCredito();
    }

    @Override
    protected Desconto desconto() {
        return new Desconto.SemDesconto();
    }
//    @Override
//    protected void pagar(double valorTotal) {
//        System.out.println("Pagamento a prazo no valor de: "+valorTotal);
//    }

    @Override
    protected void concluir(Venda venda) {
        System.out.println("Aguardando o pagamento da compra....");
    }
}
