package Modelos;

import java.time.LocalDate;
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
}
