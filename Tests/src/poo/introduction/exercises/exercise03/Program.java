package poo.introduction.exercises.exercise03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many dollar will be bought?: ");
        double d = CurrencyConverter.converter(sc.nextDouble());
        System.out.printf("Amount to be paid in reais: %.2f",d);
        sc.close();
    }
}
