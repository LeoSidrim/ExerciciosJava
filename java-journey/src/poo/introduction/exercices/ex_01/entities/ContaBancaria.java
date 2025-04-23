package poo.introduction.exercices.ex_01.entities;

public class ContaBancaria {
    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String nome, double depositoInicial) { // Construtor mais completo
        this.numero = numero;
        this.nome = nome;
        this.saldo = depositoInicial;
    }
    public ContaBancaria (int numero, String nome){ // Construtor sem depósito inicial
        this(numero,nome,0);
    }

    public void deposito (double valor){
        if (valor > 0){
            this.saldo += valor;    // implementa valor na conta
            System.out.printf("Depósito de %.2f feito com sucesso",valor);
        } else {
            System.out.print("Valor inválido");
        }
        exibirDados();
    }
    public void saque (double valor){
        double valorSaque = valor + 5; // acréscimo de taxa
        if (valorSaque > this.saldo || this.saldo == 0){
            System.out.println("Saldo insuficiente");
        } else  {
            this.saldo -= valorSaque;
            System.out.printf("Saque de %.2f feito com sucesso\n",valor);
        }
        exibirDados();

    }
    public void setName(String newName){
        this.nome = newName;
        System.out.println("Nome alterado com sucesso");
    }
    public void exibirDados(){
       System.out.printf("\nAccount data: \nAccount %d, HOLDER: %s, Balance: $ %.2f\n",numero,nome,saldo);
    }
}
