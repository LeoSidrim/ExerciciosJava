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

        double areaX = x.area();
        double areaY = y.area();
        System.out.println("Triangle X area: "+ areaX);
        System.out.println("Triangle Y area: "+areaY);
        if (areaX>areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
