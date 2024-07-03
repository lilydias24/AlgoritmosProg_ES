package RecFaltas02a16;

import java.util.Scanner;

// Recuperação de falta 16.05.24 - Algoritmos ES - Depuração

public class recFaltaVIII {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][4];
        
        
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 4; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
    }
}
