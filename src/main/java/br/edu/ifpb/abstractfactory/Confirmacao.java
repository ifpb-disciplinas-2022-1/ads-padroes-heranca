package br.edu.ifpb.abstractfactory;

import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.Entrega;
import br.edu.ifpb.domain.Pagamento;
import br.edu.ifpb.domain.Venda;

public abstract class Confirmacao {
    private Venda compra;
    public Confirmacao(Venda venda) {
        this.compra = venda;
    }

    public final void confirmar(Entrega entrega){
        // cômputo da taxa de entrega
        double taxas = compra.calcularTaxas(entrega);
        // aplicar o desconto
        double subTotal = compra.valorDosItens();
        double desconto = desconto().aplicarEm(subTotal);
        double valorTotal = subTotal - desconto + taxas;
        // pagar (boleto ou cartão)
        pagamento().pagar(valorTotal);
        // concluir a Compra
        concluir(compra);
    }
    // 3 - Factory Method // delegando à subclasse a responsabilidade de CRIAR o pagamento
    protected abstract Pagamento pagamento();
    // 4 - Abstract Factory
    protected abstract Desconto desconto();
    // delegando à subclasse a responsabilidade de definir o comportamento do pagamento
//    protected abstract void pagar(double valorTotal); //hook method
    protected abstract void concluir(Venda venda);//hook method
}
