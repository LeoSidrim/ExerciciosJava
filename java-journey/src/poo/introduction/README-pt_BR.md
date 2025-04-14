> [Voltar para o menu](../../../../README-pt_BR.md)
# Introdução a OOP (Programação orientada a Objetos)

---
## 📌 Tópicos abordados
- O que é OOP
- Classes e Objetos
- - Boas práticas para criação de Classes e Objetos
- - Atributos e métodos
- Encapsulamento
- - Set e Get
- - Construtores
- - Palavra this
- - Sobrecarga
- - Modificadores de acesso

## 📚 Sumário teórico
Nessa seção, eu darei uma explicação sobre os conceitos acima, em minhas próprias palavras,
é um meio de reforçar meu aprendizado, mostrar que domino estes assuntos e ajudar outros estudantes
que estão começando sua jornada em Java, ou OOP.
- - -
- ### O que é OOP?
- - OOP é um dos 4 principais paradigmas da programação, sendo vastamente usada para aplicações de grande porte. 
 Quando usamos OOP, nós conseguimos representar algo na forma de um objeto.
 A grande vantagem da OOP é sua fácil escalabilidade, uma vez que podemos reutilizar códigos facilmente. Também temos 
 grande eficiência e facilidade para projetos colaborativos.
- - -
- ### Classes e Objetos
- - A OOP gira em torno de Classes e Objetos. Classes são moldes para formarmos um Objeto. Na Classe, definimos os atributos
 (características) e métodos (comportamento) de um Objeto. Para representar melhor imaginemos
 a criação de um Carro. 

 ```java
 //Ignoraremos os modificadores para focarmos na estrutura da classe.
 
 public class Carro{
    public String nome;
    public String modelo; 
    public String fabricante; // Atributos (Características de todo carro)
    public String cor;
    public int ano;
    
    public void acelerar(){
        
    }                       // Métodos (Comportamentos de todo carro)
    public void frear(){
        
    }  
 }
```
- - De fato sabemos que maioria dos carros, tem estes atributos. Possuem nome, modelo, fabricante, cor e ano. Além de claro, como
 comportamento, acelerar e frear. Qualquer Objeto criado com a estrutura dessa Classe, terá estes atributos e métodos.
 Digamos que eu quero representar um Fusca, como eu faria? Simples, como eu já possuo a estrutura de qualquer carro, 
 basta apenas criar o Objeto e instanciar os dados que eu quero nele, vejamos.

```java

public class Main
{
	public static void main(String[] args) {
		Carro carro = new Carro(); // crio um Objeto chamado "carro"
		carro.nome = "Fusca";
		carro.modelo = "Typ 1";     // instancio os dados que quero dentro do meu objeto
		carro.fabricante = "Volkswagen";
		carro.ano = 2002;
		
		carro.acelerar();   // métodos do meu objeto 
		carro.frear        // todos os objetos criado pela classe também "herdam" seus métodos.
	}
}

```
- - Na primeira linha, criei um Objeto chamado `carro` utilizando a estrutura da classe `Carro`. Para conseguirmos instanciar,
 ou seja, alocar dados no Objeto criado, basta instanciar diretamente mediante `(nomeDoObjeto.atributo)` **apenas se o atributo for do tipo public**.
 Feito isso, conseguimos criar um Objeto com os dados de um fusca. Mas, e se eu quisesse criar um Corolla, Civic, Celta?
 Ora, estes não são carros? Então, apenas criaríamos um novo Objeto para cada carro. Não precisamos ficar reescrevendo códigos para criar cada um.
 Pois, mesmo que eles tenham atributos (características) diferentes, continuam tendo a mesma estrutura, pois são carros.

- - -
- #### Boas práticas para criação de Classes e Objetos

- - Em qualquer linguagem de programação devemos ter boas práticas na escrita de códigos para melhorar sua legibilidade, 
 facilitar compreensão de outras pessoas, visto que você provavelmente não trabalhará só, e deixar seu código mais limpo.
 Tudo que escrevemos deve ter clareza e fazer sentido lógico. Por exemplo:
```java
public class Carro{
    public String a;
    public String b; 
    public String c; 
    public String d;
    public int e;
    
    public void f(){
        
    }                      
    public void g(){
        
    }  
 }

```
- - Não houve mudança lógica para o sistema, mas para nós sim. O simples fato de mudarmos o nome de um atributo deixou o 
 código bem mais confuso. Devemos sempre pensar em como deixar as coisas simples e claras.

- - Em java, temos convenções de nomenclatura para padronizar como devem ser nomeados os identificadores.
 as convenções mais comuns são:
- - - camelCase para variáveis, atributos e métodos;
- - - PascalCase para Classes, enum e interfaces;
- - - SCREAMING_SNAKE_CASE para constantes.
```java
 public class Pessoa{  // Classe padrão PascalCase 
    public String nome;
    public float alturaAtual;  // Atributos padrão camelCase
    public int idadeAtual;
    
    final String CPF;    // SCREAMING_SNAKE_CASE para constantes
    final String TIPO_SANGUÍNEO;
    
    public void comer(){
        
    }                       // Métodos padrão camelCase
    public void andar(){
        
    }  
 }
```
- - Em Java, a palavra reservada `final` define um atributo ou variável como constante.

- - -
- ### Atributos e Métodos
- - Atributos e métodos são os membros de uma classe. Como vimos anteriormente, atributos são apenas as características 
 de um objeto como cpf, nome, idade de uma pessoa. Métodos, seriam as ações que este objeto faz, correr, andar, pular, 
 comer. 
- - -





