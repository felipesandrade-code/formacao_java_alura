package Modelos;

import calculos.FormaInterface;

import java.util.ArrayList;

public class Circulo implements FormaInterface {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea(){
        return 3.14 * Math.pow(raio, raio);
    }
    public static void main(String[] args) {
        Circulo circulo = new Circulo(6.5);

        System.out.println("Área do círculo em questão: " + circulo.getArea());
    }
}
