package RecFaltas02a16;

import java.io.*;
import java.util.*;

// Recuperação de falta 14.05.24 - Algoritmos ES - Switch-Case.

/* Faça um programa que simule a urna eletrônica. A tela a ser apresentada deverá ser da seguinte forma. 
As opções são: 
1. Candidato Paulo 
2. Candidato Alan 
3. Candidato Jonas
4. Nulo 
5. Branco 
Entre com o seu voto: 
O programa deverá ler um número indeterminado de votos de eleitores e, quando for digitado o número 6, 
apresentar as seguintes informações: 
a) O número de votos de cada candidato, nulos e brancos; 
b) O candidato vencedor. */

public class recFaltaV { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int candidatoPaulo = 0;
        int candidatoAlan = 0;
        int candidatoJonas = 0;
        int nulo = 0;
        int branco = 0;
        String vencedor = "";
        int voto = 0;
        System.out.print("  PARTICIPE DA ELEIÇÃO! \r\n" + // 
                        " \t 1. Candidato Paulo \r\n" + //
                        " \t 2. Candidato Alan \r\n" + //
                        " \t 3. Candidato Jonas\r\n" + //
                        " \t 4. Nulo \r\n" + //
                        " \t 5. Branco \r\n  ");
        do {
            System.out.print("Entre com seu voto : ");
            voto = entrada.nextInt();
            switch(voto){
                case 1 : 
                    candidatoPaulo++;
                    break;
                case 2 :
                    candidatoAlan++;
                    break;
                case 3 :
                    candidatoJonas++;
                    break;
                case 4 :
                    nulo++;
                    break;
                case 5 : 
                    branco++;
                    break;
                case 6 :
                    System.out.println("CONFIRA!");
                    System.out.println("Número de votos - Candidato Paulo : " + candidatoPaulo);
                    System.out.println("Número de votos - Candidato Alan : " + candidatoAlan);
                    System.out.println("Número de votos - Candidato Jonas : " + candidatoJonas);
                    System.out.println("Número de votos Nulos : " + nulo);
                    System.out.println("Número de votos brancos : " + branco);
                    // candidatoPaulo += branco;
                    // candidatoAlan += branco;
                    // candidatoJonas += branco;
                    if (candidatoPaulo > candidatoAlan && candidatoPaulo > candidatoJonas) {
                        vencedor = "PAULO";
                    } else if (candidatoAlan > candidatoPaulo && candidatoAlan > candidatoJonas) {
                        vencedor = "ALAN";
                    } else if (candidatoJonas > candidatoPaulo && candidatoJonas > candidatoAlan) {
                        vencedor = "JONAS";
                    } else {
                        vencedor = "EMPATE!";
                    }
                    System.out.println("O CANDIDATO VENCEDOR É : " + vencedor);
                    break;
            }
        } while (voto <= 6);
    }
}