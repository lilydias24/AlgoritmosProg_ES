package TrabalhoII;
/* Jogo que ocorre em uma matriz 5 x 5 representando uma mesa de doces em uma festa de aniversário. 
Os jogadores representam dois convidados disputando quem vai comer mais doces no final da festa: 
Um jogador jogará com quindins e outro jogador com macarons. 
O objetivo de qualquer jogador é fazer uma grande sequência dos seus doces.
O estado inicial do jogo é completamente vazio. 
O jogador dos quindins joga sempre primeiro, colocando um quindim em um espaço da mesa. 
Depois disso, o jogador dos macarons escolhe um lado para puxar a toalha, deslocando todos os doces naquela direção 
e em seguida coloca um macaron em um espaço não ocupado da mesa. 
Depois, o jogador dos quindins escolhe um lado para puxar a toalha 
e em seguida coloca um quindim em um espaço não ocupado. 
O jogo segue nessa mesma sequência com alternância de turnos entre os jogadores.
Um jogador ganha quando completar uma sequência de 4 doces iguais na horizontal ou na vertical.
O movimento de puxar a toalha desloca todos os doces naquela direção, 
sendo que os doces que forem sair do tabuleiro acabam aparecendo do outro lado,
ou seja, nenhum doce desaparece da mesa depois de colocado. 
Por exemplo, quindins são representados pela letra Q, macarons pela letra M e espaços vazios pelo hífen. 
Puxar a toalha para baixo faz com que última linha vire a primeira. 
Puxar a toalha para cima faz com que a primeira linha viera a última. 
Puxa a toalha para a direita faz com que a última coluna vire a primeira. 
E, puxar a toalha para a esquerda faz com que a primeira linha vire a última. */

/* 
int matriz[][] = new int[5][5];
Scanner entrada = new Scanner( System.in );
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        matriz[i][j] = 0;
        System.out.println(matriz[i][j]);
    }
} 
*/

/* 
class Principal {
    public static void main( ){
        double saldo, rendimento;
        Scanner entrada = new Scanner( System.in );
        System.out.println("Por favor, digite seu saldo");
        saldo = entrada.nextDouble( );
        rendimento = Principal.calcularRendimento(saldo);
        System.out.println("Rendimento anual de "+rendimento);
    }
    public static double calcularRendimento( double saldo ){
        double acumulado, rendimento;
        acumulado = saldo;
        for( int i = 1; i <= 12; i++ ){
        acumulado = acumulado + acumulado * 0.001575;
    }
    rendimento = acumulado - saldo;
    return rendimento;
    }
} */
import java.io.*;
import java.util.*;

public class TrabalhoII {
    public static void main( ){
        char macarons = 'M';
        char quindins = 'Q';
        char vazio = '-';
        String direcao;
        char tabuleiro[][] = new char[5][5];
        Scanner entrada = new Scanner( System.in );
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabuleiro[i][j] = vazio; 
            }
        }
        // Imprimindo a matriz
        System.out.println("\nO tabuleiro inicial é :\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println(); 
        }
    
        if (vez == quindins) {
            System.out.print("Informe a direção que deseja puxar a toalha : ");
            direcao = entrada.nextLine();
            char quindins = 'Q';
            System.out.print("Informe a posição que deseja colocar o quindim.");
            System.out.print("Linha : ");
            int linha = entrada.nextInt();
            System.out.print("Coluna : ");
            int coluna = entrada.nextInt();
        }

        if (vez == macarons) {
            System.out.print("Informe a direção que deseja puxar a toalha : ");
            direcao = entrada.nextLine();
            char macarons = 'M';
            System.out.print("Informe a posição que deseja colocar o macaron.");
            System.out.print("Linha : ");
            int linha = entrada.nextInt();
            System.out.print("Coluna : ");
            int coluna = entrada.nextInt();
        }
    }

    

    public static char puxarToalha( char direcao, char tabuleiro[][] ){
        if (direcao == 'D') {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                   // tabuleiro[i][j] = 'M';
                }
            }
        }
    }
}
