package br.edu.ifpb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/05/2022, 09:22:50
 */
public class Compra {

    private List<ItemDeVenda> itens = new ArrayList<>();
    private LocalDate criadaEm = LocalDate.now();
    public void adicionar(int quantidade, Produto produto) {
        ItemDeVenda item = new ItemDeVenda(
            quantidade,produto
        );
        if (!itens.contains(item)) {
            itens.add(item);
        }
    }


    public double calcularTaxas(Entrega entrega){
        return  entrega.taxas(this);
//       return new CalcularTaxasDeEntrega().calcularTaxas(itens(), entrega);
    }
    public double valorTotal() {
        return itens.stream()
            .mapToDouble(ItemDeVenda::subTotal)
            .sum();
    }
    public int itens() {
        return 10;
    }
}
