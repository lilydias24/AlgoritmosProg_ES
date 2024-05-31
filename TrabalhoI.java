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
    public static void main(String[] args) {
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
        // Habitantes Reanimados
        int Dias = 0;
        // Dias necessários

        while (HB > 0) { // enquanto houverem habitantes vivos
            if (MV > 0) { // se houverem mortos-vivos para matar habitantes

                while (MMV > 0) { // enquanto houverem recargas para morto-vivo matar
                    HM += 1; // mais um habitante morto
                    MMV -= 1; // menos uma recarga de morte
                }

                HB = HB - HM; // habitantes sobreviventes após acabarem as recargas de mortes
                // esses q sobreviveram vão pra matar mortos vivos ou ficam p outro dia ?

                if (MMV == 0 && HB > 0) { // se acabaram as recargas para matar e ainda há sobreviventes
                    for (int i = 3; i <= HB; i += 3) { // laço para contagem de habitantes que matam mortos-vivos
                        MV -= 1; // Menos 1 morto-vivo
                    }
                    Dias += 1;
                    MMV = MV * 7;
                }

                while (HM > 0) { // enquanto houverem habitantes mortos a serem reanimados
                    if (RCB > 0) { // se houverem recargas de reanimação de caminhantes brancos
                        RCB -= 1; // menos uma recarga de reanimação do caminhante branco
                        HM -= 1; // menos um habitante morto a ser reanimado 
                        MV += 1; // mais um morto vivo
                        // MMV = MV * 7; // talvez seja necessário declarar novamente essa tbm
                        RH += 1; // mais uma reanimação realizada
                    } else if (RRN > 0) { // se houverem recargas de reanimação do rei da noite
                        RRN -= 1; // menos uma recarga de reanimação do rei da noite
                        HM -= 1; // menos um habitante morto a ser reanimado
                        MV += 1; // mais um morto vivo
                        // MMV = MV * 7; // talvez seja necessário declarar novamente essa tbm
                        RH += 1; // mais uma reanimação realizada \\ extra
                    } else { // faltam possibilidades de reanimação
                        Dias += 1; // novo dia quando acabam as reanimações ou só para as recargas de morte ?
                        RCB = CB * 13;
                        RRN = 131;
                    }
                }
            } else { // não há mortos vivos para matar habitantes
                System.out.print("Derrota!");
            }
        }

        if (HB == 0) { // Vitória! não há mais habitantes vivos
            System.out.print("Foram necessários " + Dias + " dias para matar todos os habitantes de Westeros.");
            System.out.print("Após matar todos os habitantes, resultou-se em " + MV + " mortos-vivos disponíveis.");
            System.out.print("A quantidade de cadáveres não reanimados foi : " + HM);
        }
    }
}
