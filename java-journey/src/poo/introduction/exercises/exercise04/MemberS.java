package poo.introduction.exercises.exercise04;
import java.util.Scanner;
import java.util.Locale;
//Testing static members with direct reference in the same Class
public class MemberS {

    public static final double PI = 3.141592;
    public static double circumference(double r){
        return (4*PI)*(r*r);
    }
    public static double volume(double r){
        return ((double) 4/3)*PI*Math.pow(r,3);
    }

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert radius: ");
        double r = sc.nextDouble();
        double c = circumference(r);
        double v = volume(r);
        System.out.printf("Circumference: %.2f",c);
        System.out.printf("Volume: %.2f",v);
        System.out.printf("PI value: %.2f",PI);


        sc.close();
    }
}
