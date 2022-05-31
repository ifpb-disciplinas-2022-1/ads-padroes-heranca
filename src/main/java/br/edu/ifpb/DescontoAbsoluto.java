package br.edu.ifpb;

public class DescontoAbsoluto implements Desconto{
    private final double valor;
    public DescontoAbsoluto(double valor) {
        this.valor = valor;
    }
    // 100.00 -> 90.00 (10% ou R$ 10)
    public double aplicarEm(double total){ //fake
        return  total - this.valor; // 100.00 -> 100.00
    }
}
