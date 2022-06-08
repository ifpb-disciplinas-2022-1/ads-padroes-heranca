package br.edu.ifpb;

import br.edu.ifpb.nullobject.DescontoAbsoluto;
import br.edu.ifpb.nullobject.DescontoPercentual;
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
public class CompraTest {
    @Test
    public void testEntregaPorSedex(){
        Compra compra = new Compra();
        double taxas = compra.calcularTaxas(
                new Sedex()
        );
        double esperado = 2.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorPAC(){
        Compra compra = new Compra();
        double taxas = compra.calcularTaxas(
                new PAC()
        );
        double esperado = 1.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorCorreios(){
        Compra compra = new Compra();
        double taxas = compra.calcularTaxas(
                new Correios()
        );
        double esperado = 3.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorFEDEX(){
        Compra compra = new Compra();
        double taxas = compra.calcularTaxas(
                new FEDEX()
        );
        double esperado = 5.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
    @Test
    public void testEntregaPorLambda(){
        Compra compra = new Compra();
        double taxas = compra.calcularTaxas(c -> c.itens() * 0.6);
        double esperado = 6.0; // 10 itens
        assertEquals(esperado,taxas, 0.0001);
    }
}
