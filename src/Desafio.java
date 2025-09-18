public class Desafio {
    public static void main (String[] args){
//       Primeiro desafio
        double nota1 = 8.5;
        double nota2 = 4.5;
        double media = (nota1 + nota2) / 2;

        System.out.println(media);

//        Segundo desafio
        double variavelExemplo = 2.0;
        int exemploVariavel;
        exemploVariavel = (int) (variavelExemplo);
        System.out.println(exemploVariavel);

//        Terceiro desafio
        char letra = 'a';
        String palavra = "Lindo";
        String mensagemDesafio3 = letra + palavra;
        System.out.println(mensagemDesafio3);

//        Quarto desafio
        double precoProduto = 150.0;
        int quantidade = 5;
        double resultado = precoProduto * quantidade;
        System.out.println("O preço do produto quando se compra 5 unidades dele é: R$%.2f".formatted(resultado));


        //        quinto desafio
        double valorEmDolares = 150.0;
        double conversaoRealParadolar = valorEmDolares * 4.94;
        System.out.println("O valor de $150 dólares convertido para reais é de: R$%.2f".formatted(conversaoRealParadolar));

//          Sexto desafio
        double precoOriginal = 150.0;
        double percentualDesconto = 10;
        double resultadopercentual = precoOriginal * (percentualDesconto/100);
        double resultadoContaDesconto = precoOriginal - resultadopercentual;
        System.out.println("Preço Original: %f Preço com o desconto aplicado: %f".formatted(precoOriginal,resultadoContaDesconto));

    }
}
