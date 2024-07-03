package RecFaltas02a16;

import java.io.*;
import java.util.*;

// Recuperação de falta 07.05.24 - Algoritmos ES - Sorteador Aleatorio

/* Escreva um programa que implemente o jogo conhecido como Pedra, Papel e Tesoura. 
Neste jogo, o usuário e o computador escolhem entre pedra, papel ou tesoura por 10 rodadas. 
Sabendo que pedra ganha de tesoura, papel ganha de pedra e tesoura ganha de papel, 
exiba na tela o ganhador de cada rodada: usuário ou computador. Para esta implementação, 
assuma que o número 0 representa pedra, 1 representa papel e 2 representa tesoura. 
Em cada rodada, o programa deve pedir para o usuário entrar com sua escolha, 
gerar aleatoriamente a escolha do computador, exibir a escolha e indicar o vencedor. */

public class recFaltaII {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        final int pedra = 0;
        final int papel = 1;
        final int tesoura = 2;
        int jogadas[][] = new int[10][2];
        String jog1 = " ";
        String jog2 = " ";
        int vencedor = 0;
        System.out.println("Vamos Jogar Pedra(0) - Papel(1) - Tesoura(2) - Usuário VS Computador!");
        for(int i = 0; i < 10; i++){
            System.out.print("Usuário, informe sua escolha : ");
            int usuario = entrada.nextInt();
            if (usuario == pedra || usuario == papel || usuario == tesoura ) {
                jogadas[i][0] = usuario;
            } else {
                System.out.println("Valor Inválido Informado!");
            }
            int computador = random.nextInt(3);
            jogadas[i][1] = computador;

            for(int j = 0; j < 2; j++){
                if(jogadas[i][j] == pedra){
                    
                } else if (jogadas[i][j] == papel) {
                    
                } else if (jogadas[i][j] == tesoura) { 

                }
            }
        }
    }
}
