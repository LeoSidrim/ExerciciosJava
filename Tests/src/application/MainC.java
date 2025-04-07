package application;
import entities.Student;
import java.util.Scanner;

public class MainC {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Student student = new Student();

        System.out.print("Insert the student name: ");
        student.name = (sc.nextLine());
        System.out.println("Insert the average of the exams: ");
        student.n1 = (sc.nextFloat());
        student.n2 = (sc.nextFloat());
        student.n3 = (sc.nextFloat());
        student.status();
        sc.close();
    }
}
