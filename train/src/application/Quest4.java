package application;

import java.util.Scanner;
public class Quest4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float fah,cel,x;
        char answer;
        do {
        System.out.println("Insira a temperatura em Celsius: ");
        cel = sc.nextFloat();
        fah = (9*cel)/5 + 32;
        System.out.println("Equivalente em Fahrenheit: "+ fah);
        System.out.println("Deseja repetir? (s/n)");
        answer = sc.next().charAt(0);
        } while (answer != 'n');

        sc.close();
    }
}
//Conversor Celsius to Fahrenheit