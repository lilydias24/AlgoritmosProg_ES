package RecFaltas02a16;

import java.io.*;
import java.util.*;

// Recuperação de falta 08.05.24 - Algoritmos ES - WHILE E DO WHILE

/* Faça um programa que, para um número indeterminado de pessoas: 
leia a idade de cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser considerada. 
A seguir, calcule e apresente na tela:
a) o número de pessoas;
b) a idade média do grupo;
c) a menor idade e a maior idade.. */

public class recFaltaIII {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe sua idade : ");
        int idade = entrada.nextInt();
        int cont = 1;
        int menor = idade;
        int maior = idade;
        float media = idade;
        do{
            System.out.print("Informe sua idade : ");
            idade = entrada.nextInt();
            if(idade != 0){
                cont++;
                media += idade; 
                if(idade < menor){
                    menor = idade;
                } else if( idade > maior){
                    maior = idade;
                }
            } 
        } while ( idade > 0);
        System.out.println("O número de pessoas é : " + cont);
        media = media / cont;
        System.out.println("A idade média das pessoas é : " + media);
        System.out.println("A menor idade é : " + menor);
        System.out.println("A maior idade é : " + maior);
    }
}