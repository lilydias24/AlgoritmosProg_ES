package Atividades;
import java.util.Scanner;


/* fazer um programa em Java que receba do usuário um número inteiro ímpar 
referente à altura das asas de uma borboleta 
e que desenha um padrão de borboleta na tela conforme os exemplos. 
Para N = 3

X  X
XXX
X  X

Para N = 5

X      X
 XX  XX
  XXXXX
 XX  XX
X      X

Observação: seu programa não deve aceitar números pares e nem números acima de 20.
*/
public class ativ01 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;
        do{
            System.out.print("Informe um número ímpar, menor do que 20, referente a altura das asas de uma borboleta : ");
            num = entrada.nextInt();
            if (num % 2 == 0 || num >= 20) { // informa ao usuário sobre a entrada inserida
                System.out.println("Valor não aceito, tente novamente!");
            } else {
                System.out.println("A borboleta possui asas de altura : " + num);
            }
        } while (num % 2 == 0 || num >= 20); // repete a solicitação caso a entrada não seja aceita
        
        // Imprime a parte superior da borboleta
        for (int i = 0; i < num / 2 + 1; i++) { // controla as linhas da asa ( metade do num + 1 linhas a serem desenhadas)
            for (int j = 0; j < num; j++) { // controla as colunas da asa
                if (j <= i || j >= num - i - 1) { // verifica as posições a serem preechidas com X ou espaço 
                    System.out.print("X");
                } else { // depende da posição da coluna (j) em relação à linha (i)
                    System.out.print(" ");
                }
            }
            System.out.println(); // pula linha após imprimir uma linha completa
        }

        // Imprime a parte inferior da borboleta
        for (int i = num / 2 - 1; i >= 0; i--) { // controla as linhas da asa de cima para baixo( metade do num - 1 linhas a serem desenhadas)
            for (int j = 0; j < num; j++) { // controla as colunas da asa
                if (j <= i || j >= num - i - 1) { // verifica as posições a serem preechidas com X ou espaço
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // pula linha após imprimir uma linha completa
        }
    }
} 

/* Forma Orientada a Objetos de resolver a questão 
 * import java.util.Scanner;

// Classe principal que gerencia a interação com o usuário
public class borboleta01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        // Solicita ao usuário que insira um número ímpar menor do que 20
        do {
            System.out.print("Informe um número ímpar, menor do que 20, referente à altura das asas de uma borboleta: ");
            num = entrada.nextInt();
            if (num % 2 == 0 || num >= 20) { // Informa ao usuário sobre a entrada inserida
                System.out.println("Valor não aceito, tente novamente!");
            } else {
                System.out.println("A borboleta possui asas de altura : " + num);
            }
        } while (num % 2 == 0 || num >= 20); // Verifica se o número é válido

        // Cria um objeto Butterfly com a altura especificada
        Butterfly butterfly = new Butterfly(num);

        // Desenha a borboleta
        butterfly.draw();

        entrada.close();
    }
}

// Classe que representa o padrão de uma borboleta
class Butterfly {
    private int height;

    // Construtor da classe Butterfly
    public Butterfly(int height) {
        this.height = height;
    }

    // Método para desenhar a borboleta
    public void draw() {
        // Desenha a parte superior da borboleta
        for (int i = 0; i < height / 2 + 1; i++) {
            for (int j = 0; j < height; j++) {
                if (j <= i || j >= height - i - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Desenha a parte inferior da borboleta
        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < height; j++) {
                if (j <= i || j >= height - i - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/