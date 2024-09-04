package RecFaltas02a16;

import java.util.Scanner;

// Recuperação de falta 15.05.24 - Algoritmos ES - Depuração

/* O código em questão está incorreto pois gera um loop na estrutura de repetição while,
o valor int i nunca é atualizado, ou seja, sua utilidade como contador é inválida para
percorrer o vetor de Strings apresentado.
*/
public class recFaltaVI {
    public static void main(String[] args) {
        
        String vet[] = new String[3];
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        System.out.println("Digite uma string:");
        vet[i] = entrada.nextLine();
        
        while (i < 3) {
            System.out.println("Digite uma string:");
            vet[i] = entrada.nextLine();
        }
    }
}