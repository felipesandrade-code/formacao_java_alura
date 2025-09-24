package Desafios;

public class ConversaoTemperatura {
    public static void main (String[] args){
        double temperatura = 30.4;
        double temperaturaFarenheit = (temperatura *1.8) + 32;

        String mensagem = String.format("A temperatura de %.0f Celsius é equivalente a %.0f Fahrenheit", temperatura, temperaturaFarenheit);

        System.out.println(mensagem);

        int temperaturaEmFahremheightInteira = (int) (temperaturaFarenheit);
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahremheightInteira);
    }

}
