package br.edu.ifpb;

import br.edu.ifpb.factory.Boleto;
import br.edu.ifpb.factory.CartaoDeCredito;
import br.edu.ifpb.template.ConfirmacaoAVista;

public class PagamentoFactory {

    // 1 - Factory Simples Responsabilidade de criar o tipo Pagamento
    public Pagamento criar(Confirmacao confirmacao){
        if(confirmacao instanceof ConfirmacaoAVista)
            return new Boleto();
        return new CartaoDeCredito();
    }
    // 2 - Static Factory
    public static Pagamento create(Confirmacao confirmacao){
        if(confirmacao instanceof ConfirmacaoAVista)
            return new Boleto();
        return new CartaoDeCredito();
    }

    public static void main(String[] args) {
        Pagamento boleto = new PagamentoFactory()
                .criar(new ConfirmacaoAVista(null)); //Boleto
        Pagamento boleto2 =  PagamentoFactory.create(
                new ConfirmacaoAVista(null)); //Boleto
    }
}
