package br.edu.ifpb;

import br.edu.ifpb.domain.Venda;
import br.edu.ifpb.strategy.Correios;
import br.edu.ifpb.strategy.FEDEX;
import br.edu.ifpb.strategy.PAC;
import br.edu.ifpb.strategy.Sedex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/05/2022, 09:20:50
 */
public class VendaTest {
    @Test
    public void testEntregaPorSedex(){
        Venda compra = new Venda();
        double taxas = compra.calcularTaxas(
                new Sedex()
        );
        double esperado = 2.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorPAC(){
        Venda compra = new Venda();
        double taxas = compra.calcularTaxas(
                new PAC()
        );
        double esperado = 1.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorCorreios(){
        Venda compra = new Venda();
        double taxas = compra.calcularTaxas(
                new Correios()
        );
        double esperado = 3.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorFEDEX(){
        Venda compra = new Venda();
        double taxas = compra.calcularTaxas(
                new FEDEX()
        );
        double esperado = 5.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorLambda(){
        Venda compra = new Venda();
        double taxas = compra.calcularTaxas(c -> c.itens() * 0.6);
        double esperado = 6.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
}
