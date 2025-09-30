package Modelos;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    private double limiteCartaoDeCredito;

    public ContaBancaria(int numeroDaConta, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public ContaBancaria(double limiteCartaoDeCredito){
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
    }

    public ContaBancaria(){

    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getLimiteCartaoDeCredito(){
        return limiteCartaoDeCredito;
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(10,800);
        ContaBancaria contaBancaria1 = new ContaBancaria(50, 699);

        List<ContaBancaria> contaBancariaList = new ArrayList<>();
        contaBancariaList.add(contaBancaria);
        contaBancariaList.add(contaBancaria1);

        ContaBancaria maiorSaldo = contaBancariaList.get(0);

        for(ContaBancaria conta: contaBancariaList){
            if (conta.getSaldo() > maiorSaldo.getSaldo()){
                maiorSaldo = conta;
            }
        }
                System.out.printf("Conta de maior saldo:%nNúmero: %s%nSaldo: %.2f%n ",maiorSaldo.getNumeroDaConta(), maiorSaldo.getSaldo());

    }
}
