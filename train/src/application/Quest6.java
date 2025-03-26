package application;

import java.util.Scanner;
public class Quest6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Insert the number: ");
        int x = sc.nextInt();
        int z = 1;
        int fatorial = 0;
        if (x == 0){
            System.out.println("Valor: 0");
        }
        while (x>1){
            fatorial = x * (x-1);
            z = z * fatorial;
            x--;
            x--;
        }
        System.out.println(z);
        sc.close();
    }
}
//fatorial
