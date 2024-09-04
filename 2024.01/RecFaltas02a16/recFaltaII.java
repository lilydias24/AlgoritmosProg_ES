package RecFaltas02a16;

import java.io.*;
import java.util.*;
import java.util.Random;

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
        
        System.out.println("Vamos Jogar Pedra(0) - Papel(1) - Tesoura(2) - Usuário VS Computador!");
        
        for(int i = 0; i < 10; i++){
            System.out.print("Usuário, informe sua escolha : ");
            int usuario = entrada.nextInt();
            
            while (usuario < 0 || usuario > 2) {
                System.out.println("Valor Inválido! Escolha novamente");
                usuario = entrada.nextInt();
            }
            
            int computador = random.nextInt(3);
            
            String escUsuario = converterEscolha(usuario);
            String escComputador = converterEscolha(computador);
            
            System.out.println("Usuário escolheu: " + escUsuario);
            System.out.println("Computador escolheu: " + escComputador);
            
            int vencedor = determinarVencedor(usuario, computador);
            
            if (vencedor == 0) {
                System.out.println("Resultado: Empate!");
            } else if (vencedor == 1) {
                System.out.println("Resultado: Usuário Venceu!");
            } else {
                System.out.println("Resultado: Computador Venceu!");
            }
            System.out.println();
        }
    }
    
    public static String converterEscolha(int escolha) {
        switch (escolha) {
            case 0: return "Pedra";
            case 1: return "Papel";
            case 2: return "Tesoura";
            default: return " ";
        }
    }
    
    public static int determinarVencedor(int usuario, int computador) {
        if (usuario == computador) {
            return 0; // Empate
        } else if ((usuario == 0 && computador == 2) || 
                   (usuario == 1 && computador == 0) || 
                   (usuario == 2 && computador == 1)) {
            return 1; // Usuário vence
        } else {
            return 2; // Computador vence
        }
    }
}