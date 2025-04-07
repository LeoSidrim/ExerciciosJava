package application;
import java.util.Scanner;
import entities.Employee;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = (sc.nextLine());
        System.out.print("Gross salary: ");
        employee.grossSalary = (sc.nextDouble());
        System.out.print("tax: ");
        employee.tax = (sc.nextDouble());
        System.out.println("Employee: "+ employee.name+", $" +employee.netSalary());
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary((sc.nextDouble()));
        System.out.println("Updated data: "+ employee.name+", $"+employee.grossSalary);
        sc.close();
    }
}
