package Modelos;

public class Animal {
    private String nome;
    private String machoOuFemea;
    private int idade;

    public String getNome(){
        return this.nome;
    }

    public String getMachoOuFemea(){
        return this.machoOuFemea;
    }

    public int getIdade(){
        return this.idade;
    }

    public Animal(String nome, String machoOuFemea, int idade) {
        this.nome = nome;
        this.machoOuFemea = machoOuFemea;
        this.idade = idade;
    }

}
