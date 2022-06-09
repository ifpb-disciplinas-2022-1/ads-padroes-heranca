package br.edu.ifpb.template;

import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.Pagamento;
import br.edu.ifpb.domain.Venda;
import br.edu.ifpb.abstractfactory.Confirmacao;
import br.edu.ifpb.factory.Boleto;
import br.edu.ifpb.nullobject.DescontoPercentual;

public class ConfirmacaoAVista extends Confirmacao {
    public ConfirmacaoAVista(Venda compra) {
        super(compra);
    }

    @Override
    protected Pagamento pagamento() {
        return new Boleto();
    }

    @Override
    protected Desconto desconto() {
        // Nas compras a vista teremos um desconto de 10%
        return new DescontoPercentual(10);
    }

    //    @Override
//    protected void pagar(double valorTotal) {
//        System.out.println("Pagamento a vista no valor de: "+valorTotal);
//    }
    @Override
    protected void concluir(Venda venda) {
        System.out.println("Feito!");
    }

}
