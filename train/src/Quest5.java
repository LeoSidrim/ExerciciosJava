import java.util.Scanner;
public class Quest5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        float a, b, c, d;
        char answer;
        do {
            System.out.println("Insert the number of cases: ");
            x = sc.nextInt();
            System.out.println("Insert 3 Real numbers for calculate the avarage") ;
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
            d = ((a*2)+(b*3)+(c*5))/10;
            System.out.println("Saída: "+ d);
            System.out.println("Deseja repetir (s/n)");
            answer = sc.next().charAt(0);
        } while (answer != 'n');

        sc.close();
    }
}
//weighted average of 3 Real numbers