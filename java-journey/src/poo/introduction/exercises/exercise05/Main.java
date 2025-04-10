package poo.introduction.exercises.exercise05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = (sc.nextLine());
        System.out.print("Gross salary: ");
        double grossSalary = (sc.nextDouble());
        System.out.print("tax: ");
        double tax = (sc.nextDouble());
        Employee employee = new Employee(name,grossSalary,tax);
        System.out.println("Employee: "+ employee.name+", $" +employee.netSalary());
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary((sc.nextDouble()));
        System.out.println("Updated data: "+ employee.name+", $"+employee.grossSalary);
        sc.close();
    }
}
