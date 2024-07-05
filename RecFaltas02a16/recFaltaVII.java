package RecFaltas02a16;

import java.util.Random;
import java.util.Scanner;

// Recuperação de falta 16.05.24 - Algoritmos ES - Depuração

/* O código em questão apresenta um problema na estrutura de exibição da matriz.
A estrutura de for aninhados está incorreta para percorrer e imprimir a matriz,
tendo em vista que a matriz possui 3 linhas e duas colunas, mas o laço executa
como se a matriz tivesse 2 linhas e 2 colunas.
Além disso, a matriz é impressa de maneira errada, já que não informa
os índices a serem impressos a cada repetição dos laços, que seriam utilizados
para percorrer cada posição da matriz construida ao longo do código.
*/
public class recFaltaVII {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int matriz[][] = new int[3][2];
        
        // inserção de valores aleatórios na matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }
        
        // impressão do conteúdo da matriz
        System.out.println("Valores da matriz:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(matriz + "\t");  // "\t" = tabulação 
            }
            System.out.print("\n");             // "\n" = quebra de linha
        }    
    }
}
