package br.edu.ifpb.nullobject;

import br.edu.ifpb.Desconto;

public class SemDesconto implements Desconto {

    public double aplicarEm(double total){
        return  total;
    }
}
