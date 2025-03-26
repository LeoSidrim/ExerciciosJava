package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("--Summing N numbers--\n1-Entry\n2-Exit");
            int x = sc.nextInt();
            if(x==2){
                break;
            }
            System.out.println("Enter the quantity of numbers");
            int n = sc.nextInt();
            int sum = 0;
            for(int i =0; i<n; i++){
                int j = sc.nextInt();
                sum = sum + j;
            }
            System.out.println("Final value: \n" + sum);
       }
        sc.close();
    }
}