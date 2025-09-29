package principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

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

        ArrayList<Titulo> Lista = new ArrayList<>();
        Lista.add(meuFilme);
        Lista.add(lost);
        Lista.add(filmeDoPaulo);
        Lista.add(outroFilme);

//      Primeira maneira possível de fazer o forEach;
        for(Titulo item: Lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
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
    }
}
