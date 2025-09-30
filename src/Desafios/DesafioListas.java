package Desafios;

import Modelos.ContaBancaria;
import Modelos.Produto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DesafioListas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 1;
        System.out.println("Digite o limite do seu cartão de crédito: ");
        List<Produto> listaProdutos = new LinkedList<>();
        double limiteCartao = leitura.nextDouble();
        while (opcao != 0) {
            ContaBancaria conta = new ContaBancaria(limiteCartao);

            System.out.println("Digite a descrição do produto que você vai comprar: ");
            String descricaoProduto = leitura.next();

            System.out.println("Digite o valor do produto: ");
            double valorProduto = leitura.nextDouble();
            Produto produto = new Produto(descricaoProduto, valorProduto);
            listaProdutos.add(produto);
            if (valorProduto > limiteCartao) {
                System.out.println("Saldo insuficiente!");
                return;
            } else {
                limiteCartao = conta.getLimiteCartaoDeCredito() - valorProduto;
                System.out.println("Digite 1 para cadastrar outro produto ou 0 para sair");
                opcao = leitura.nextInt();
                if (opcao != 1 && opcao != 0) {
                    System.out.println("Opção digitada inválida, 1 para continuar a cadastrar ou 0 para sair.");
                } else if (opcao == 0) {
                    Collections.sort(listaProdutos);
                    System.out.println("*********************");
                    System.out.println("Lista de produtos comprados: ");
                    System.out.println(listaProdutos);
                    System.out.println("*********************");
                    System.out.println();
                    System.out.println("Saldo do cartão: " + limiteCartao);
                }
            }


        }
    }
}

