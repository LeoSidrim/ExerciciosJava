package pre_oop.sequencial.exercises.exercise01;
/*
 * 📌 Exercício 01 - Entrada e saída de dados
 * ---------------------------------------------------
 * Peça ao usuário que digite seu nome e sua idade.
 * Depois, exiba a seguinte mensagem:
 * Olá, [nome]! Você tem [idade] anos.
 *
 * ✅ Exemplo:
 * Digite seu nome: Leo
 * Digite sua idade: 19
 * Olá, Leo! Você tem 19 anos.
 */
import java.util.Scanner;
public class Ex01_EntradaNomeSaida {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.close();
        System.out.printf("Olá, %s! Você tem %d anos.",nome,idade);
    }
}

