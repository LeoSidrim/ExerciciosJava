< [🔙 Voltar ao menu](../README-pt_BR.md)
# PRÉ OOP - Java ☕︎

--- 
## 📌 Tópicos abordados

- 🌟 **Estrutura condicional**
  - 🛤️ Fluxo de decisão
    - 🔁 Condições simples (`if`)
    - 🔄 Condições compostas (`if...else`)
    - 🔀 Múltiplas escolhas (`if...else if`)
    - 🧭 Estrutura `switch`
    - 🎚️ Operador ternário (`? :`)
  - 🧮 Operadores relacionais e lógicos
  - 🧠 Boas práticas e legibilidade
  - 📋 Simulações com problemas do dia a dia

---

## 🛤️ Fluxo de decisão

Códigos obedecem uma linha sequencial, mas e se quisermos mudar o fluxo?
Utilizamos a estrutura condicional.
---
### 🔁 Condições simples (`if`)
   
- O operador `if` é usado para alterar o fluxo do código. Ele ira executar um bloco de código se uma condição for 
 verdadeira. Caso contrário, o bloco será ignorado.
```java
public class Main{
    public static void main (String[] args){
        int idade = 18;
        if(idade >= 18){ 
            System.out.print("Você é maior de idade");
        }
    }
}
```
```java
public class Main{
    public static void main (String[] args){
        int idade = 15;
        if(idade >= 18){
            System.out.print("Você é maior de idade");
        }
    } // Não terá saída
}
```
---

### 🔄 Condições compostas (`if...else`)

- As condições compostas também são usadas para alterar o fluxo do código. Entretanto, serão dois caminhos `if` e `else`.
```java
import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.close();
        if(idade >= 18){
            System.out.print("Você é maior de idade");
        } else {
            System.out.println("Você não é maior de idade");
        }  // Dois fluxos de resposta.
    } 
}
```
---

### 🔀 Múltiplas escolhas (`if...else if`)

- Aqui podemos fazer caminhos infinitos, dependendo da quantidade de fluxos que iremos querer que nosso código tenha. 
 Melhor para tratar desigualdades, comparações de múltiplas variáveis e expressões mais complexas.
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();
        sc.close();
        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else {
            System.out.println("Reprovado");
        }
    }
}
```
---
### 🧭 Estrutura `switch`

- Usamos o switch quando temos que várias opções baseadas no mesmo valor, menus de jogos, dias da semana, notas escolares.
 Usado para comparar valores fixos e expressões simples.
```java
public class Main{
    public static void main (String[] args){
        
      int opcao = 2;
      switch (opcao) {
        case 1:
          System.out.println("Novo jogo");
          break;
        case 2:
          System.out.println("Carregar jogo");
          break;
        case 3:
          System.out.println("Sair");
          break;
        default: // Default é usado para prevenir casos inesperados
          System.out.println("Opção inválida");
      }
    }
}
```
---
### 🎚️ Operador ternário (`? :`)

- O operador ternário é uma forma elegante de escrever `if - else`. Ele é chamado ternário porque envolve três partes.
```java
public class Main{
    public static void main (String[] args){
        int numero = 8;
        String tipo = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(tipo);
    }
}
```
---
### 

