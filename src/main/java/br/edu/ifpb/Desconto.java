package br.edu.ifpb;

public interface Desconto {

//    public final static  Desconto SEMDESCONTO = new SemDesconto();
    // 100.00 -> 90.00 (10% ou R$ 10)
    public double aplicarEm(double total);
//    SmartClass
    public class SemDesconto implements Desconto{
        public double aplicarEm(double total){
            return  total;
        }
    }
}
