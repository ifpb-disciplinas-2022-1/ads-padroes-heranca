package br.edu.ifpb;

public abstract class Confirmacao {
    private Compra compra;
    public Confirmacao(Compra compra) {
        this.compra = compra;
    }

    public final void confirmar(Entrega entrega){
        // cômputo da taxa de entrega
        double taxas = compra.calcularTaxas(entrega);
        // aplicar o desconto
        double desconto = compra.desconto();
        double subTotal = compra.valorDosItens();
        double valorTotal = subTotal - desconto + taxas;
        // pagar (boleto ou cartão)
        pagamento().pagar(valorTotal);
        // concluir a Compra
        concluir(compra);
    }
    // 3 - Factory Method // delegando à subclasse a responsabilidade de CRIAR o pagamento
    protected abstract Pagamento pagamento();
    // delegando à subclasse a responsabilidade de definir o comportamento do pagamento
//    protected abstract void pagar(double valorTotal); //hook method
    protected abstract void concluir(Compra compra);//hook method
}
