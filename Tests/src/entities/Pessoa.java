package entities;
import java.util.Scanner;
public class Pessoa {
    public String name;
    public int idade;

    public void apresentar(){
        System.out.println("Olá meu nome é "+ name+ "e tenho "+idade+" anos.");
    }
}

class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Pessoa pessoaA = new Pessoa();
        Pessoa pessoaB = new Pessoa();

        System.out.println("Insira seu nome e idade: ");
        pessoaA.name = (sc.nextLine());
        pessoaA.idade =(sc.nextInt());
        sc.nextLine();
        pessoaA.apresentar();

        System.out.println("Insira seu nome e idade: ");
        pessoaB.name = (sc.nextLine());
        pessoaB.idade =(sc.nextInt());
        pessoaB.apresentar();


        sc.close();
    }
}


