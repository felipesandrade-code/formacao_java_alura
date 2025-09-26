package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ProdutoPerecivel extends Produto {

    private LocalDate dataValidade;

    public ProdutoPerecivel(LocalDate dataValidade, String nome, double preco, int quantidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade(){
        return dataValidade;
    }

    public boolean estaVencido(){
        return LocalDate.now().isAfter(dataValidade);
    }

    @Override
    public String toString() {
        return "\nProduto: " + this.getNome() + "\nPreço " + this.getPreco() + "\nQuantidade: " + this.getQuantidade() + "\nData de validade: " + this.dataValidade + "\nEstá vencido: " + this.estaVencido();
    }

    public static void main(String[] args) {
        ProdutoPerecivel iorgute = new ProdutoPerecivel(LocalDate.of(2025, 02, 15), "iorgute", 100, 10);
        ProdutoPerecivel queijo = new ProdutoPerecivel(LocalDate.of(2026, 10, 12), "queijo mussarela", 10, 50);

        ArrayList<ProdutoPerecivel> ListaDeProdutosPereciveis = new ArrayList<>();
        ListaDeProdutosPereciveis.add(iorgute);
        ListaDeProdutosPereciveis.add(queijo);

//      Ex 1 do capítulo 03. Lista de objetos distintos.
        for(ProdutoPerecivel produto: ListaDeProdutosPereciveis){
            System.out.println(produto.toString());
        }

    }
}
