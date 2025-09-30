package Modelos;

public class Numeros implements Comparable<Numeros> {
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Número: " + this.getNumero();
    }

    @Override
    public int compareTo(Numeros outroNumero) {
        if (this.getNumero() > outroNumero.getNumero()) {
            return 1;
        } else if (this.getNumero() < outroNumero.getNumero()) {
            return -1;
        } else
            return 0;
    }
}
