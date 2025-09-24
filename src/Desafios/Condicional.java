package Desafios;

public class Condicional {
    public static void main (String[] args){
        int anoDeLancamento = 2022;
        boolean incluidoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "ronald";


        if (anoDeLancamento>= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else{
            System.out.println("Filme Retrô que vale a pena assistir!");
        }

        if(incluidoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Mude a sua assinatura para a assinatura Plus para ter acesso a este filme.");
        }
    }
}
