package Desafios;

import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        String nomeCliente = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldoConta = 2500;
        Scanner leitura = new Scanner(System.in);
        double valorRecebido = 0;
        double valorTransferido = 0;
        System.out.println("*****************");
        System.out.println("\nDados Iniciais do cliente:");
        System.out.println("Nome:               " + nomeCliente);
        System.out.println("Tipo conta:         " + tipoConta);
        System.out.println("Saldo inicial:      R$" + saldoConta);
        System.out.println("\n*****************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nOperações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo Atual da conta da " + nomeCliente + " é de:  R$" + saldoConta);
                    System.out.println();
                break;

                case 2:
                    System.out.println("Digite o valor que irá receber/depositar na sua conta: ");
                    valorRecebido = leitura.nextDouble();
                    saldoConta += valorRecebido;
                    System.out.println("Valor recebido! Agora o saldo da sua conta é de: R$" + saldoConta);
                    System.out.println();
                break;

                case 3:
                    System.out.println("Digite o valor que irá transferir para a conta digitada: ");
                    valorTransferido = leitura.nextDouble();
                    if (valorTransferido > saldoConta){
                        System.out.println("Valor para transferência excede o saldo da conta!");
                        System.out.println();
                    } else {
                        saldoConta -= valorTransferido;
                        System.out.println("Valor transferido! Agora o saldo da sua conta é de: R$" + saldoConta);
                        System.out.println();
                    }
                break;

                case 4:
                    System.out.println("Saindo da aplicação.....");
                    System.out.println();
                break;

                default:
                    System.out.println("Opção digitada inválida, tente novamente!");
                    System.out.println();
                break;
            }
        }
    }
}
