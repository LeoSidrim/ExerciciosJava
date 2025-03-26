package application;

import java.util.Scanner;
public class Questão3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira quantidade N de números: ");
        int n = sc.nextInt();
        int sum=0;
        int sum2=0;

        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x>=10 && x<=20){
                sum++;
            } else{
                sum2++;
            }
        }
        System.out.println(sum+" in");
        System.out.println(sum2+" out");
        sc.close();
    }
} // In e Out
