package Desafios;

import java.util.Scanner;

public class Desafio {
    public static void main (String[] args){
////       Primeiro desafio
//        double nota1 = 8.5;
//        double nota2 = 4.5;
//        double media = (nota1 + nota2) / 2;
//
//        System.out.println(media);
//
////        Segundo desafio
//        double variavelExemplo = 2.0;
//        int exemploVariavel;
//        exemploVariavel = (int) (variavelExemplo);
//        System.out.println(exemploVariavel);
//
////        Terceiro desafio
//        char letra = 'a';
//        String palavra = "Lindo";
//        String mensagemDesafio3 = letra + palavra;
//        System.out.println(mensagemDesafio3);
//
////        Quarto desafio
//        double precoProduto = 150.0;
//        int quantidade = 5;
//        double resultado = precoProduto * quantidade;
//        System.out.println("O preço do produto quando se compra 5 unidades dele é: R$%.2f".formatted(resultado));
//
//
//        //        quinto desafio
//        double valorEmDolares = 150.0;
//        double conversaoRealParadolar = valorEmDolares * 4.94;
//        System.out.println("O valor de $150 dólares convertido para reais é de: R$%.2f".formatted(conversaoRealParadolar));
//
////          Sexto desafio
//        double precoOriginal = 150.0;
//        double percentualDesconto = 10;
//        double resultadopercentual = precoOriginal * (percentualDesconto/100);
//        double resultadoContaDesconto = precoOriginal - resultadopercentual;
//        System.out.println("Preço Original: %f Preço com o desconto aplicado: %f".formatted(precoOriginal,resultadoContaDesconto));

//        -----------------------------------------------
//        Desafios do capítulo 3. Controlando o fluxo da aplicação.
//        Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        Scanner leitura = new Scanner(System.in);
//        System.out.println("digite um número");
//        int numero = leitura.nextInt();
//        if (numero > 1){
//            System.out.println("Este número é positivo");
//        } else{
//            System.out.println("Este número é negativo");
//        }
//
////        Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
//        System.out.println("Digite dois número inteiros: ");
//        int n1 = leitura.nextInt();
//        int n2 = leitura.nextInt();
//        if (n1 > n2){
//            System.out.println("Primeiro número é maior que o segundo número digitado e são diferentes.");
//        } else if(n1 < n2){
//            System.out.println("Segundo número é maior que o primeiro número digitado e são diferentes");
//        } else{
//            System.out.println("Estes números são iguais!");
//        }
//
//
////       Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
//        System.out.println("Bem vindo a nossa calculadora!");
//        System.out.println("Supondo que nosso quadrado tenha as 4 faces com 5cm e o círculo com o raio de 3cm");
//        System.out.println("Digite 1 para calcular área do quadrado ou 2 para calcular a área do círculo");
//        int opcao = leitura.nextInt();
//
//        switch (opcao){
//            case 1:
//               int faceQuadrado = 5;
//               int areaQuadrado = faceQuadrado * 4;
//                System.out.println("O resultado da área deste quadrado é: " + areaQuadrado);
//            break;
//
//            case 2:
//                double raioCirculo = 3;
//                double areaCirculo = 3.14 * Math.pow(raioCirculo,2.0);
//                System.out.println("A área do círculo é de: " + areaCirculo);
//                break;
//        }

//        Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
//        System.out.println("Digite um número de 1 a 10 e veja a tabuada dele.");
//        int numeroTabuada = leitura.nextInt();
//        System.out.println("Tabuada do número: " + numeroTabuada);
//            for(int i = 1; i < 11; i ++){
//                int tabuada = numeroTabuada * i;
//                System.out.println(tabuada);
//            }
//
//    }
//       Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
//        System.out.println("Digite um número para verificarmos se ele é par ou ímpar por favor.");
//        int numeroDigitado = leitura.nextInt();
//        int divisor = 2;
//        if (numeroDigitado % divisor == 0){
//            System.out.println(numeroDigitado + "é divisível por " + divisor);
//        } else {
//            System.out.println(numeroDigitado + " não é divísivel por " + divisor);
//        }

//        Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
//        System.out.println("Digite um número para calcular o fatorial:");
//        int numeroFatorial = leitura.nextInt();
//        int resultadoFatorial = 0;
//        if(numeroFatorial < 1){
//            System.out.println("Números negativos não são aceitos, tente novamente!");
//            return;
//        } else{
//            for(int i = 1; i <= numeroFatorial; i++){
//                resultadoFatorial =numeroFatorial * i;
//                System.out.println(numeroFatorial + " *" + i + " =" + resultadoFatorial);
//            }
//        }
    }
}
