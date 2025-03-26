package application;

import entities.Triangles;

import java.util.*;

class Test{ //interesting Strings functions
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);

        Triangles x,y;
        x = new Triangles();
        y = new Triangles();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.b = sc.nextDouble();
        double p = (x.a+x.b+x.c)/2;
        double p2 = (y.a+y.b+y.c)/2;
        double area = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
        double area2 = Math.sqrt(p2*(p2-y.a)*(p2-y.b)*(p2-y.c));
        System.out.println("Triangle X area: "+ area);
        System.out.println("Triangle Y area: "+area2);
        if (area>area2){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
