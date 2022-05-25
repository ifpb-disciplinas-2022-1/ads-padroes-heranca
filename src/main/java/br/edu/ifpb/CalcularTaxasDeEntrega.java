package br.edu.ifpb;

public class CalcularTaxasDeEntrega {
    public double calcularTaxas(int quantidade, Entrega entrega){
        return  quantidade * entrega.taxas(null);
//        if(TipoDeEntrega.SEDEX.equals(tipo)){
//            return quantidade * sedex();
//        }
//        if(TipoDeEntrega.PAC.equals(tipo)){
//            return quantidade * pac();
//        }
//        if(TipoDeEntrega.CORREIOS.equals(tipo)){
//            return quantidade * correios();
//        }
//        return  0.0;
    }
//    private double sedex(){
//        return new Sedex().taxas();
//    }
//    private double pac(){
//        return new PAC().taxas();
//    }
//    private double correios(){
//        return new Correios().taxas();
//    }
}
