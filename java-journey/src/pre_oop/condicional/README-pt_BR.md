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

-

