package Modelos;

import java.util.ArrayList;

public class Cachorro extends Animal{
    private String lateOuNao;

    public Cachorro(String nome, String machoOuFemea, int idade, String lateOuNao){
        super(nome, machoOuFemea, idade);
        this.lateOuNao = lateOuNao;
    }

    @Override
    public String toString() {
        return "\nNome do animal: " + this.getNome() + "\nMacho ou fêmea? " + this.getMachoOuFemea() + "\nidade: " + this.getIdade() + "\nLate ou não? " + this.lateOuNao;
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bruce", "Macho", 6, "Late muito!");
        Cachorro cachorro1= new Cachorro("Mel", "Femea", 2, "Late muito!");



        ArrayList<Animal> ListaDeAnimais = new ArrayList<>();

        ListaDeAnimais.add(cachorro);
        ListaDeAnimais.add(cachorro1);

        for (Animal animal: ListaDeAnimais){
            System.out.println(animal.getNome());
            if (animal instanceof Cachorro cachorro2){
                System.out.println("Nome do dog: " + cachorro2.getNome());
            }

        }

    }
}
