package br.edu.ifpb;

import br.edu.ifpb.domain.Desconto;
import br.edu.ifpb.domain.venda.Produto;
import br.edu.ifpb.domain.Venda;
import br.edu.ifpb.nullobject.DescontoAbsoluto;
import br.edu.ifpb.nullobject.DescontoPercentual;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/05/2022, 09:20:50
 */
public class DescontoTest {
    @Test
    public void testCompraSemDesconto(){
        Venda compra = new Venda();
        double taxas = compra.desconto();
        double esperado = 0.0;
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testCompraComDescontoNosItens(){
        Desconto desconto = new DescontoAbsoluto(100.00);
        Venda compra = new Venda(desconto);
        compra.adicionar(1,
                new Produto("TV", 1000.0)
        );
        double taxas = compra.desconto();
        double esperado = 900.0;
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testCompraComDescontoPercentual(){
        Desconto desconto = new DescontoPercentual(15); //15%
        Venda compra = new Venda(desconto);
        compra.adicionar(1,
                new Produto("TV", 1000.0)
        );
        double taxas = compra.desconto();
        double esperado = 850.0;
        assertEquals(esperado,taxas, 0.0001);
    }
}
