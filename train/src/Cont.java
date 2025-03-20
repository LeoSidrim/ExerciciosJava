import java.util.Scanner;
public class Cont {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =1; i<=x;i++) {
            if (i % 2 ==1) {
                System.out.println("Number : " + i);
            }

        }
        sc.close();
        }

    }
// contador de Number ímpares
