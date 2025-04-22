package poo.introduction.exercices.ex_01.program;
import java.util.Scanner;
import poo.introduction.exercices.ex_01.entities.ContaBancaria;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String titular;
        int numero;
        double depositoInicial;
        char temDeposito;
        ContaBancaria conta = null;

        while(true){
            System.out.println("---MENU---\n");
            System.out.println("1 - CADASTRO DE CONTA");
            System.out.println("2 - SAQUE");
            System.out.println("3 - DEPOSITO");
            System.out.println("4 - SAIR\n");
            int x = sc.nextInt(); // Navegar pelo switch

            switch (x){
                case 1:

                    System.out.println("---CADASTRO DE CONTAS---");
                    sc.nextLine();
                    System.out.println("Insira seu nome: ");
                    titular = sc.nextLine();
                    System.out.println("Insira o número da conta: ");
                    numero = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Deseja fazer depósito inicial? ");
                    temDeposito = sc.next().charAt(0);



                    if (temDeposito == 's' || temDeposito == 'S'){
                        System.out.println("Insira valor de depósito inicial: ");
                        depositoInicial = sc.nextDouble();
                        conta = new ContaBancaria(numero,titular,depositoInicial); // Cria objeto conta com todos os parâmetros
                    } else {
                        conta = new ContaBancaria(numero,titular);
                    }
                    break;
                case 2:
                    System.out.print("Insira valor para saque: ");
                    conta.saque(sc.nextDouble());

                    break;
                case 3:

                    break;
                case 4:

                    System.out.print("Encerrando programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida");

            }
            System.out.println();
        }


    }
}
