package principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);

        ArrayList<Titulo> Lista = new ArrayList<>();
        Lista.add(filmeDoPaulo);
        Lista.add(outroFilme);
        Lista.add(meuFilme);
        Lista.add(lost);

//      Primeira maneira possível de fazer o forEach;
        for(Titulo item: Lista){
            System.out.println(item);
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());
        }

//      Maneira mais enxuta de fazer o forEach;
        Lista.forEach(nome -> System.out.println(nome));


    }
}
