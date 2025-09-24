import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Pessoa;
import Modelos.Serie;
import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar");
        outroFilme.setAnoDeLancamento(2023);
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

        var filmeDoPaulo = new Filme("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
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
        var fernanda = new Pessoa();
        fernanda.setIdade(16);
        fernanda.setNome("Fernanda");

        var felipe = new Pessoa();
        felipe.setNome("Felipe");
        felipe.setIdade(20);

        var viviane = new Pessoa();
        viviane.setNome("Viviane");
        viviane.setIdade(54);

        ArrayList<Pessoa> ListaDePessoas = new ArrayList<>();
        ListaDePessoas.add(felipe);
        ListaDePessoas.add(fernanda);
        ListaDePessoas.add(viviane);

        System.out.println("Vamos imprimir o tamanho da lista de pessoas que criamos: " + ListaDePessoas.size());
        System.out.println("Primeira pessoa da nossa lista de pessoas é: " + ListaDePessoas.getFirst().getNome());
        System.out.println("Segue agora a nossa lista completa de pessoas: " + ListaDePessoas);




    }
}