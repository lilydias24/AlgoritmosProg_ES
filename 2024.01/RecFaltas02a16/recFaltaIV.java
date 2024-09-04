package RecFaltas02a16;

import java.io.*;
import java.util.*;
import java.util.Random;

// Recuperação de falta 09.05.24 - Algoritmos ES 

/* 1) Luiz e Fernando decidem jogar par ou ímpar. Luiz escolheu par e Fernando escolheu ímpar. 
Ao término de 11 jogadas aquele que ganhar mais será o vencedor do jogo. 
Vamos simular o jogo de Luiz e Fernando gerando, em cada jogada, dois números inteiros aleatórios (n1 e n2) 
pertencentes ao intervalo [0 a 10]. Assim, se a soma (n1+n2) dos valores obtido por cada jogador, 
em uma jogada, for par, Luiz ganha a jogada, se for ímpar, Fernando ganha a jogada. 
Faça um programa que simule o jogo, exibindo, em cada uma das 11 jogadas, 
o número gerado para cada jogador e quem ganhou a jogada. Ao final das 11 jogadas 
o programa deve exibir quem ganhou o jogo. */
/* 
public class recFaltaIV { // Exercício 1 -> Descomente o trecho de código para testar.
    public static void main(String[] args) {
        Random random = new Random();
        int par = 0;
        int impar = 0;
        int soma;
        System.out.println("JOGO DE PAR OU ÍMPAR! \r\n " + //
                                "Luiz => PAR \r\n " + //
                                "Fernando => ÍMPAR \r\n");
        for(int i = 0; i <= 11; i++){
            int n1 = random.nextInt(10);
            System.out.println("jogada de Luiz : " + n1);
            int n2 = random.nextInt(10);
            System.out.println("jogada de Fernando : " + n2);
            soma = n1 + n2;
            if (soma % 2 == 0) {
                par++;
                System.out.println("\tLuiz vence a rodada " + i);
            } else {
                impar++;
                System.out.println("\tFernando vence a rodada " + i);
            }
        }
        if (par > impar) {
            System.out.println("Ao final das jogadas, o vencedor é : LUIZ -> PAR");
        } else {
            System.out.println("Ao final das jogadas, o vencedor é : FERNANDO -> ÍMPAR");
        }
    }
} 
*/

/* 2) Escreva um programa que gera um número inteiro aleatório entre 0 e 50 
e informe ao usuário que ele tem 10 tentativas para acertar o número gerado. 
Informe depois de cada tentativa do usuário, quantas tentativas ainda restam a ele. 
Se ele acertou o número em alguma das tentativas, mostre a mensagem “Muito bem! Você acertou!”, 
caso contrário (ele errou todas as tentativas), mostre a mensagem “Lamentável! Você errou todas as tentativas”. */
/* 
public class recFaltaIV { // Exercício 2 -> Descomente o trecho de código para testar.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int nAleatorio = random.nextInt(50);
        int palpite[] = new int[10];
        boolean acerto = false;
        System.out.println("Você tem 10 tentativas para acertar o número gerado!");
        for(int i = 0; i < 10; i++){
            System.out.print("Informe seu palpite : ");
            palpite[i] = entrada.nextInt();
            if (palpite[i] == nAleatorio) {
                acerto = true;
            } 
            System.out.println("\tVocê tem " + (9 - i) + " tentativas.");
        }
        if (acerto == true) {
            System.out.print("Muito bem! Você acertou! - O número gerado era : " + nAleatorio);
        } else {
            System.out.print("Lamentável! Você errou todas as tentativas! - O número gerado era : " + nAleatorio);
        }
    }
}
*/