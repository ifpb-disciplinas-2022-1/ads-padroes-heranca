package br.edu.ifpb.strategy;

import br.edu.ifpb.Compra;
import br.edu.ifpb.Entrega;

public class PAC implements Entrega {

    @Override
    public double taxas(Compra compra){
        return compra.itens() * 0.1;
    }
}
