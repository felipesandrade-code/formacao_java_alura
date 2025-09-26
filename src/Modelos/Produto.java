package Modelos;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double precoMedio;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPrecoMedio(){
        return precoMedio;
    }

    @Override
    public String toString() {
        return "\nProduto: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade: " + this.quantidade;
    }


    public static void main(String[] args) {
        Produto cpu = new Produto("PC", 5500, 1);
        Produto teclado = new Produto("Kumara", 450.50,1);
        double precoMedio = 0;

        ArrayList<Produto> Carrinho = new ArrayList<>();
        Carrinho.add(cpu);
        Carrinho.add(teclado);

        for (Produto produtos: Carrinho){
            double produtosPreco = produtos.getPreco();
            precoMedio = produtosPreco / Carrinho.size();
            System.out.println("Lista de produtos: " + Carrinho);
            System.out.println("Preço médio dos produtos: " + precoMedio);
        }
    }
}
