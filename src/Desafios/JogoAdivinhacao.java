package Desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int contador = 0;
        int numeroChutado = 0;
            while (numeroChutado != numeroAleatorio) {
                System.out.println("Advinhe o número de 0 a 100 que o computador sorteou para nós.");
                numeroChutado = leitura.nextInt();

                if (numeroChutado > numeroAleatorio){
                    System.out.println("Este número é maior que o número aleatório gerado, tente novamente.");
                } else if (numeroChutado < numeroAleatorio) {
                    System.out.println("Este número é menor que o número aleatório gerado, tente novamente");
                } else {
                    System.out.println("Parabéns, você acertou o número aleatório!");
                }
                break;
            }
    }
}
