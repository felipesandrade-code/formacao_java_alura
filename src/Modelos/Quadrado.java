package Modelos;

import calculos.FormaInterface;

import java.util.ArrayList;
import java.util.List;

public class Quadrado implements FormaInterface {
    private double base;
    private double altura;

    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    public double getArea(){
        return getBase() *  getAltura();
    }

    public static void main(String[] args) {
        List<FormaInterface> formas = new ArrayList<>();

        formas.add(new Quadrado(5.0, 10.5));
        formas.add(new Circulo(7.9));

        for(FormaInterface formaInterface: formas){
            System.out.printf("Área: %1.2f%n",  formaInterface.getArea());
        }


    }
}
