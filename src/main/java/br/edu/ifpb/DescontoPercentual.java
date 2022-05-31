package br.edu.ifpb;

public class DescontoPercentual implements Desconto{
    private final int percentual;
    public DescontoPercentual(int valor) {
        this.percentual = valor;
    }
    // 100.00 -> 90.00 (10%)
    public double aplicarEm(double total){ //fake
//        return  total - (total * this.percentual)/100; // 100.00 -> 100.00
        return  total - (total * this.percentual/100); // 100.00 -> 100.00
    }
}
