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

class trabalhoI {
    public static void main(String[] args) {
        int camBranco = 0;
        // Caminhante Branco
        int mortoVivo = 0;
        int habitantes = 0;
        int cadaveres = 0;
        int reanCaminhante = 0;
        // Reanimações Caminhante Branco
        int reanRei = 131;
        // Reanimações Rei da Noite
        int mortePorMorto = 0;
        // Mortes por Morto-Vivo
        int habitantesMortos = 0;
        // Habitantes Mortos
        int dias = 0;
        // Dias necessários
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Inicia-se a Jornada do Ataque de mortos-vivos para destruir Westeros!");

        System.out.print("Informe a quantidade de Caminhantes Brancos que acompanharão o Rei da Noite no ataque : ");
        camBranco = entrada.nextInt();
        // camBranco = Caminhantes brancos
        System.out.print("Informe a quantidade inicial de mortos-vivos a disposição dos Caminhantes Brancos : ");
        mortoVivo = entrada.nextInt();
        // mortoVivo = Mortos vivos
        System.out.print("Informe a quantidade de habitantes em Westeros : ");
        habitantes = entrada.nextInt();

        // camBranco = 5;
        // mortoVivo = 10;
        // habitantes = 1000;
        reanCaminhante = (camBranco * 13);
        
        if (mortoVivo > 0) {
            while (habitantes > 0){
                mortePorMorto = (mortoVivo * 7);
                // Mata os habitantes e carrega a quantiade de habitantes mortos
                if(habitantes < mortePorMorto){
                    habitantesMortos += habitantes;
                    habitantes = 0;
                } else {
                    habitantesMortos = mortePorMorto; // ok
                    habitantes -= habitantesMortos;
                }
                mortoVivo = (mortoVivo - (habitantes / 3));
                // Subtrai da quantidade de mortos vivos, a capacidade dos habitantes de eliminar um morto vivo
                if(mortoVivo < 0){
                    mortoVivo = 0;
                }
                        
                if (habitantesMortos >= reanRei) {
                    // Se a quantidade de habitantes mortos for MAIOR ou IGUAL a quantidade de reanimações do rei
                    mortoVivo += reanRei; // Incrementa a quantidade de mortos vivos em 131
                    habitantesMortos -= reanRei; // Subtrai da quantidade de habitantes mortos a quantidade previamente reanimada

                    if (reanCaminhante > habitantesMortos) {   // Valida se sobraram pessoas para reanimar

                        // Caso a quantidade de reanimações do caminhante for maior que a quantidade de habitantes mortos,
                        // exemplo, existem 100 habitantes mortos e 13 caminhantes, isso resultaria em 169 reanimações para 100 habitantes,
                        // portanto, deve-se reanimar todos e zerar a quantidade de habitantes mortos.
                        mortoVivo += habitantesMortos;
                        habitantesMortos = 0;
                    } else {
                        mortoVivo += reanCaminhante;
                        habitantesMortos -= reanCaminhante;
                        cadaveres += habitantesMortos;
                        habitantesMortos = 0;
                    }

                } else {
                    // Caso a quantidade de habitantes mortos seja menor que a quantidade de
                    // reanimacoes do rei isso indica que todos os habitantes mortos serão reanimaos
                    // pois o rei sozinho já consegue reanimar o restante
                    mortoVivo += habitantesMortos;
                    habitantesMortos = 0;
                }
                dias += 1;   // Incrementa a quantidade de dias decorridos

                System.out.println("FIM DO DIA!");
                System.out.println("Dias decorrentes: " + dias);
                System.out.println("Mortos vivos: " + mortoVivo);
                System.out.println("Habitantes: " + habitantes);
                System.out.println("Cadáveres não reanimados: " + cadaveres);
            } 
        } else { 
            // não há mortos vivos para matar habitantes
            System.out.print("Derrota!");
        }
    }
}
