package principal;

import Modelos.*;
import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(filmeDoPaulo);
        ListaDeFilmes.add(meuFilme);
        ListaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + ListaDeFilmes.size());
        System.out.println("Nome do primeiro filme: " + ListaDeFilmes.getFirst().getNome());
        System.out.println(ListaDeFilmes);
        System.out.println("toString do filme" + ListaDeFilmes.get(0).toString());


//      Realização do exercício não obrigatório do cap1 do curso Java: trabalhando com listas e coleções de dados.
        var fernanda = new Pessoa("Fernanda", 16);

        var felipe = new Pessoa("Felipe", 20);

        var viviane = new Pessoa("Viviane", 54);


        ArrayList<Pessoa> ListaDePessoas = new ArrayList<>();
        ListaDePessoas.add(felipe);
        ListaDePessoas.add(fernanda);
        ListaDePessoas.add(viviane);

        System.out.println("Vamos imprimir o tamanho da lista de pessoas que criamos: " + ListaDePessoas.size());
        System.out.println("Primeira pessoa da nossa lista de pessoas é: " + ListaDePessoas.getFirst().getNome());
        System.out.println("Segue agora a nossa lista completa de pessoas: " + ListaDePessoas);

//       Realização do desafio do cap 2 do curso Java: trabalhando com listas e coleções de dados.
        Produto cafe = new Produto("Café", 20.30, 40);

        Produto chocolate = new Produto("Chocolate", 14.50, 20);

        Produto balaDeGoma = new Produto("Bala de goma", 3.50, 60);


        ArrayList<Produto> ListaDeProdutos = new ArrayList<>();
        ListaDeProdutos.add(cafe);
        ListaDeProdutos.add(chocolate);
        ListaDeProdutos.add(balaDeGoma);

        System.out.println("Nossa lista de produtos possui o tamanho de: " + ListaDeProdutos.size() + " produtos.");
        System.out.println("Nosso segundo produto da lista é: " + ListaDeProdutos.get(1).getNome());
        System.out.println("Nossa lista: "+ ListaDeProdutos.toString());

        ProdutoPerecivel pao = new ProdutoPerecivel(LocalDate.of(2025,02,15), "pão", 16.30, 10);

        ProdutoPerecivel iorgute = new ProdutoPerecivel(LocalDate.of(2025, 12, 01), "iorgute", 25.30, 15);

        ArrayList<ProdutoPerecivel> ListaDeProdutosPereciveis = new ArrayList<>();
        ListaDeProdutosPereciveis.add(pao);
        ListaDeProdutosPereciveis.add(iorgute);

        System.out.println("Segue a nossa lista de produtos perecíveis: " + ListaDeProdutosPereciveis.toString());


    }
}