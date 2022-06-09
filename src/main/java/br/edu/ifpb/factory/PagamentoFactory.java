package br.edu.ifpb.factory;

import br.edu.ifpb.domain.Pagamento;
import br.edu.ifpb.abstractfactory.Confirmacao;
import br.edu.ifpb.template.ConfirmacaoAVista;

//Exemplos de Factory
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
