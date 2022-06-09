package br.edu.ifpb.strategy;

import br.edu.ifpb.domain.Entrega;
import br.edu.ifpb.domain.Venda;

public class FEDEX implements Entrega {

    @Override
    public double taxas(Venda compra){
       return compra.itens() *  0.5;
    }
}
