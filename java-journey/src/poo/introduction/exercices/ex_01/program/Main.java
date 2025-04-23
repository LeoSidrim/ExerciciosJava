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
        ContaBancaria conta;

        System.out.print("Enter account number: ");
        numero = sc.nextInt();
        sc.nextLine(); // Consumir o "enter" do buffer
        System.out.print("Enter the account holder: ");
        titular = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        temDeposito = sc.next().charAt(0);

        if (temDeposito == 'y' || temDeposito == 'Y'){
            System.out.print("Enter initial deposit value: ");
            depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numero,titular,depositoInicial);
            conta.exibirDados();
                System.out.println();
        } else {
            conta = new ContaBancaria(numero,titular);
            conta.exibirDados();
        }

        System.out.print("Enter a deposit value: ");
        conta.deposito(sc.nextDouble());

        System.out.print("Enter a withdraw value: ");
        conta.saque(sc.nextDouble());

    }
}
