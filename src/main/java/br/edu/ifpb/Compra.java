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
    private Desconto desconto;
    public Compra(){
//        this(new SemDesconto()); // Classe Concreta
//        this(Desconto.SEMDESCONTO); // Constante
//        this(new Desconto.SemDesconto()); //SmartClass
        this((total) -> total); //Expression Lambda
    }
    //ctor principal
    public Compra(Desconto desconto){
        this.desconto = desconto;
    }
    public void adicionar(int quantidade, Produto produto) {
        ItemDeVenda item = new ItemDeVenda(
            quantidade,produto
        );
        if (!itens.contains(item)) {
            itens.add(item);
        }
    }
    public double total(Entrega entrega){
        return valorDosItens() - desconto() + calcularTaxas(entrega);
    }
    public double desconto(){
        //se não tem desconto, retorno o valor total
//        if(desconto==null) return valorDosItens();
        return this.desconto.aplicarEm(
                valorDosItens()
        );
    }
    public double calcularTaxas(Entrega entrega){
        return  entrega.taxas(this);
//       return new CalcularTaxasDeEntrega().calcularTaxas(itens(), entrega);
    }
    public double valorDosItens() {
        return itens.stream()
            .mapToDouble(ItemDeVenda::subTotal)
            .sum();
    }
    public int itens() {
        return 10;
    }
}
