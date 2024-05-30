/* O Rei da Noite está planejando destruir Westeros em um ataque massivo de mortos-vivos. 
Um humano morto retorna como morto-vivo quando reanimado por um Caminhante Branco 
(uma criatura mágica das terras gélidas do norte que inclui o próprio Rei da Noite), 
mas há um limite de reanimações por dia: um Caminhante Branco pode reanimar 13 pessoas por dia, 
e o Rei da Noite consegue reanimar 131 pessoas por dia.
Os Caminhantes Brancos e o Rei da Noite conseguem reanimar mortos, mas não querem sujar suas mãos matando humanos, 
então eles esperarão que os mortos-vivos criados por eles matem os habitantes de Westeros para só depois reanimá-los. 
Um morto-vivo é capaz de matar 7 pessoas por dia em sua caminhada 
e é esperado que um grupo de 3 pessoas consiga matar 1 morto-vivo por dia 
(primeiro as pessoas morrem e depois os mortos-vivos são destruídos). 

Considerando que sejam informados a quantidade de Caminhantes Brancos que acompanharão o Rei da Noite no ataque, 
a quantidade inicial de mortos-vivos à disposição dos Caminhantes Brancos 
e a quantidade total de habitantes humanos em Westeros, 

você deve fazer um programa que mostre a quantidade de dias necessários para matar todos os habitantes de Westeros, 
a quantidade de mortos-vivos disponíveis depois de matar todos os habitantes, e a quantidade de cadáveres não reanimados. 
Se, por qualquer motivo, os Caminhantes Brancos não conseguirem exterminar todos os habitantes, 
deverá ser mostrada uma mensagem de "derrota". */

import java.io.*;
import java.util.*;

class TrabalhoI {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inicia-se a Jornada do Ataque de mortos-vivos para destruir Westeros!");
        System.out.print("Informe a quantidade de Caminhantes Brancos que acompanharão o Rei da Noite no ataque : ");
        int CB = entrada.nextInt();
        // CB = Caminhantes brancos
        System.out.print("Informe a quantidade inicial de mortos-vivos a disposição dos Caminhantes Brancos : ");
        int MV = entrada.nextInt();
        // MV = Mortos vivos
        System.out.print("Informe a quantidade de habitantes em Westeros : ");
        int HB = entrada.nextInt();
        // HB = Habitantes
        int RCB = CB * 13;
        // Reanimações Caminhante Branco
        int RRN = 131;
        // Reanimações Rei da Noite
        int MMV = MV * 7;
        // Mortes por Morto-Vivo
        int HM = 0;
        // Habitantes Mortos 
        int RH = 0;

        while (HB > 0) {
            for(int i = 0; i < MV; i++ ){

            }
        }


        // for (int i = 0 ; i <= HB ; i+= 3) { // laço para contagem de habitantes que matam mortos-vivos 

//             if( MMV >= 3){ // Mortos-vivos ainda podem matar 3 habitantes para serem mortos 
//                 MMV -= 3;
//                 HM += 3;
//                 if (MV > 0) {
//                     MV -= 1;
//                 } else {
//                     // faltam mortos vivos para matar 
//                 }
//             } else {
//                 // faltam possibilidades de matar para os mortos vivos | NOVO DIA ? 
//             }
//         }

//         for (int i = 0 ; i <= HB ; i++) { // laço para contagem de habitantes a serem reanimados

//            if ( RCB > 0 && HM > 0 ) {
//                 RCB -= 1;
//                 HM -= 1 ;
//                 MV += 1;
//            } else if ( RRN > 0 && HM > 0 ) {
//                 RRN -= 1;
//                 HM -= 1 ;
//                 MV += 1;
//            } else {
//                 // faltam possibilidades de reanimação ou faltam habitantes mortos | NOVO DIA ?
//            }
//         }
    
//         if ( HM > 0) {
//             HB = HB - HM;
//             // Habitantes sobreviventes
//             // Novo dia ou Derrota ?
//             // System.out.println("Derrota!"); 
//         }
    }
} 
