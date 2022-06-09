package br.edu.ifpb.factory;

import br.edu.ifpb.domain.Pagamento;
import java.time.LocalDate;

public class Boleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        LocalDate.now();//
        LocalDate.of(1,1,1);//
        System.out.println("Pagando via Boleto o valor de: "+valor);
    }
}
