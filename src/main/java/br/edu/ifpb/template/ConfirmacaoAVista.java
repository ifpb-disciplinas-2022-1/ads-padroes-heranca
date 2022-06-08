package br.edu.ifpb.template;

import br.edu.ifpb.Compra;
import br.edu.ifpb.Confirmacao;
import br.edu.ifpb.Pagamento;
import br.edu.ifpb.factory.Boleto;

public class ConfirmacaoAVista extends Confirmacao {
    public ConfirmacaoAVista(Compra compra) {
        super(compra);
    }

    @Override
    protected Pagamento pagamento() {
        return new Boleto();
    }

//    @Override
//    protected void pagar(double valorTotal) {
//        System.out.println("Pagamento a vista no valor de: "+valorTotal);
//    }
    @Override
    protected void concluir(Compra compra) {
        System.out.println("Feito!");
    }

}
