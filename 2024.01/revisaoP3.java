/* Construa um programa para gerar cartelas de bingo. As cartelas possuem 5 x 5 = 25 células, 
com números de 1 até 99. Utilize a classe Random para gerar os números aleatórios. 
Você notará que, em alguns casos, é possível que números se repitam, o que não é aceitável para cartelas reais. 
Código para gerar números aleatórios:
Random random = new Random();
// Gera um número inteiro aleatório entre 0 (inclusive) e 99 (inclusive)
int numAleatorio = random.nextInt(100);

System.out.println("Número inteiro aleatório entre 0 e 99: " + numAleatorio); */

import java.io.*;
import java.util.*;
import java.util.Random;

public class revisaoP3 {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        int linha = 5;
        int coluna = 5;
        int cartela[][] = new int[linha][coluna];
        int vetor[] = new int[25];
        Random random = new Random();
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                
                int numAleatorio = random.nextInt(25);
                for(int k = 0; k < 25; k++){
                    vetor[k] = numAleatorio;
                }

                for(int k = 0; k < 25; k++){
                    if(numAleatorio == vetor[k]){
                        numAleatorio = random.nextInt(100);
                    } else {
                        cartela[i][j] = numAleatorio;
                    }
                }
            }
        }

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.print("\t" + cartela[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }
}
