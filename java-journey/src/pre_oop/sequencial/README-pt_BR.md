< [Voltar ao menu](../../../../README-pt_BR.md)
# PRÉ OOP - Java ☕︎

--- 
## 📌 Tópicos abordados
- Estrutura sequencial
- - 📌 Entrada e saída de dados
- - ✏️ Declaração de variáveis
- - 🔢 Tipos de dados primitivos
- - 🧮 Operadores aritméticos
- - - 💡 Precedência de operadores
- - 🧠 Casting (conversão de tipos)
- - 📏 Ordem lógica da execução
- - 🧾 Concatenação de strings
- - 🧊 Constantes (final em Java)
- - [📐 Exercícios]()
---

## Entrada e saída de dados
- - Para começarmos a entender mais sobre Java, primeiro devemos fazer o rito de qualquer linguagem, escrever
 "Hello world". 
```java
public class Main {
    public static void main (String[] args){
        System.out.println("Hello world");
    }
}
```
- - -
### Para exibirmos dados no console, normalmente usaremos 3 comandos:
- - `System.out.println();` "ln" significa "line", do inglês "linha". Isto é, **imprime e quebra linha**. 
 Perfeito para exibir dados simples, sem formatação. Também pode ser usado apenas para quebrar a linha. Ex:
 ```java
public class Main {
    public static void main (String[] args){
        System.out.print("Hello world");
        System.out.println();
        System.out.print("Hello world");
    }
}
```
- - `System.out.print();` Apenas imprime. Não possui quebra de linha. Os dois "Hello world" sairão na mesma linha.
```java
public class Main {
    public static void main (String[] args){
        System.out.print("Hello world");
        System.out.print("Hello world");
    }
}
```
- - `System.out.prinf();` Imprime e possui possibilidade de formatação. Usado para formatar a saída. Existem vários
 especificadores de formatos.

```java
public class Main {
    public static void main (String[] args){ // Vamos nos focar apenas nas saídas de dados.
        int num = 25;
        double pi = 3.14159265359;
        String name = "Java Dev";
        char ch = 'a';

        System.out.printf("Inteiro: %d\n",num); // "\n é usado para quebrar linhas em Java.
        System.out.printf("Ponto flutuante: %f\n",pi);
        System.out.printf("String: %s\n",name);
        System.out.printf("Único caráctere: %c\n",ch);
        System.out.printf("Largura :|%5d|\n",num); // Podemos definir largura mínima das variáveis. 
        System.out.printf("Precisão (Números) :%.2f\n",pi); //Se o valor for menor, ele ser preenchido por espaços (por padrão)
        System.out.printf("Precisão (Strings) :%.3s\n",name);
        System.out.printf("Largura e precisão :|%5.2f|\n",pi);
        System.out.printf("Sinal : %+d\n",num); //+ logo após %, define o sinal
        System.out.printf("Alinha à esquerda : |%-5d|\n",num);
        System.out.printf("Preenche com 0´s à esquerda : |%05d|\n",num);
        System.out.printf("Pi: %.2f, num: %d, name: %s",pi,num,name); // Formatação de múltiplos valores.
    }
}
```
- - Existem mais alguns especificadores de formatos, mas estes são os principais.
- - -
## Declaração de variáveis
- -
