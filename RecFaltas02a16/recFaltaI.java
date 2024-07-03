package RecFaltas02a16;

import java.io.*;
import java.util.*;

// Recuperação de falta 02.05.24 - Algoritmos ES

// 1. Faça um programa que solicite ao usuário 10 números inteiros e, ao final, 
// informe a quantidade de números ímpares e pares lidos. 
// Calcule também a soma dos números pares e a média dos números ímpares.
/*
public class recFaltaI {  // Exercício 1 -> Descomente trecho de código para testar.
    public static void main(String[] args){
        int numeros[] = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;
        float media = 0.0f;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a seguir 10 números inteiros!");

        for(int i = 0; i < 10; i++){
            System.out.print("Informe o número " + (i + 1) + " : ");
            numeros[i] = entrada.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(numeros[i] % 2 == 0){
                pares++;
                soma += numeros[i];
            } else {
                impares++;
                media += numeros[i];
            }
        }
        media = media / 10;
        System.out.println("Dos valores informados : ");
        System.out.println( pares + " são pares.");
        System.out.println( impares + " são impares.");
        System.out.println("A soma dos números pares resulta em : " + soma );
        System.out.println("A média dos números impares resulta em : " + media );
    }
} 
*/

// 2. Uma determinada empresa armazena para cada funcionário (10 no total) uma ficha contendo o código, 
// o número de horas trabalhadas e o seu nº de dependentes. Considerando que:
// a. A empresa paga 12 reais por hora e 40 reais por dependentes. 
// b. Sobre o salário são feitos descontos de 8,5% para o INSS e 5% para IR.
// Faça um programa para ler o código, número de horas trabalhadas 
// e número de dependentes de cada funcionário. Após a leitura, escreva qual o código, 
// os valores descontados para cada tipo de imposto e finalmente o salário líquido de cada um dos funcionários. */

/* 
public class recFaltaI { // Exercício 2 -> Descomente trecho de código para testar.
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int funcionario[][] =  new int[10][3];
        int vhr = 12;
        int vdependentes = 40;
        float INSS = 8.5f;  
        float IR = 5.0f;
        float salario;
        float salarioLiq;
        float desc1 = 0;
        float desc2 = 0;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j += 3){
                System.out.println("A seguir, preencha a ficha do funcionário " + ( i + 1 ) + " ----------");
                System.out.print("Informe seu Código : ");
                funcionario[i][j] = entrada.nextInt(); 
                System.out.print("Informe seu número de horas trabalhadas : ");
                funcionario[i][j + 1] = entrada.nextInt(); 
                System.out.print("Informe seu número de dependentes : ");
                funcionario[i][j + 2] = entrada.nextInt();
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Código do funcionário : " + funcionario[i][0] );
            salario = (funcionario[i][1] * vhr) + (funcionario[i][2] * vdependentes);
            desc1 = (salario * INSS)/100;
            desc2 = (salario * IR)/100;
            salarioLiq = salario - (desc1 + desc2);
            System.out.println("Desconto por INSS : " + desc1);
            System.out.println("Desconto por IR : " + desc2 );
            System.out.println("O Salário Líquido do funcionário é de R$ " + salarioLiq );
        }
    }
}
*/
