import java.io.*;
import java.util.*;

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
            if (num % 2 == 0 || num >= 20) { // Informa ao usuário sobre a entrada inserida
                System.out.println("Valor não aceito, tente novamente!");
            } else {
                System.out.println("A borboleta possui asas de altura : " + num);
            }
        } while (num % 2 == 0 || num >= 20); // repete a solicitação caso a entrada não seja aceita
        
        // Imprime a parte superior da borboleta
        for (int i = 0; i < num / 2 + 1; i++) {
            for (int j = 0; j < num; j++) {
                if (j <= i || j >= num - i - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Imprime a parte inferior da borboleta
        for (int i = num / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < num; j++) {
                if (j <= i || j >= num - i - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 