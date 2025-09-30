package principal;

import Modelos.Filme;
import Modelos.Numeros;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(3.0);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(3.0);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(5.0);

        Filme f1 = filmeDoPaulo;

        List<Titulo> Lista = new LinkedList<>();
        Lista.add(meuFilme);
        Lista.add(lost);
        Lista.add(filmeDoPaulo);
        Lista.add(outroFilme);

//      Primeira maneira possível de fazer o forEach;
        for (Titulo item : Lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }


//     Maneira mais enxuta de fazer o forEach;
//        Lista.forEach(nome -> System.out.println(nome));

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenção temos: ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(Lista);
        System.out.println(Lista);

//    Forma mais moderna para compararmos no Java.
        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(Lista);


//      Desafio 1 do capítulo 4 do curso Java: Trabalhando com listas e coleções de dados.
        Numeros numero1 = new Numeros(6);
        Numeros numero2 = new Numeros(9);
        Numeros numero3 = new Numeros(5);

//        Podemos criar essa lista tanto como ArrayList<>() quanto LinkedList<>().
        List<Numeros> numerosList = new LinkedList<>();
        numerosList.add(numero1);
        numerosList.add(numero2);
        numerosList.add(numero3);
        System.out.println("Lista dos números antes de serem ordenados: " + numerosList);
        Collections.sort(numerosList);
        System.out.println("Lista dos números após serem ordenados: " + numerosList);


    }
}
