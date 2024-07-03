//import java.io.*;
//import java.util.*;

/* Modelo JAVA
class Principal {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.newInt;
        System.out.print(...);
    }
} 
*/

// { Lista - Algoritmos Sequenciais Java - Algoritmos e Programação - 11.04.24 } CONCLUIDA ------------------------------------------

/* Exercício 1. Faça um programa em Java para imprimir “Bem vindo ao mundo digital”.  
class Principal {
    public static void main(){
        System.out.println("Bem vindo ao mundo digital");
    }
}
*/
/* Exercício 2. Ler dois números inteiros e imprimir a soma dos mesmos.   
class Principal { 
    public static void main(){
        int v1, v2;
        int result;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o Primeiro Número");
        v1 = entrada.nextInt();
        System.out.println("Insira o Segundo Número");
        v2 = entrada.nextInt();
        result = v1 + v2;
        System.out.print("A soma dos valores informados é : ");
        System.out.print( result );
    }
}
*/
/* Exercício 3. Ler três notas e imprima a média entre elas.
class Principal { 
    public static void main(){
        float n1, n2, n3;
        float result;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a Primeira Nota");
        n1 = entrada.nextFloat();
        System.out.println("Insira a Segunda Nota");
        n2 = entrada.nextFloat();
        System.out.println("Insira a Terceira Nota");
        n3 = entrada.nextFloat();
        result = (n1 + n2 + n3)/3;
        System.out.println("A média das notas informadas é : ");
        System.out.println( result );
    }
}
*/
/* Exercício 4. Ler um número de segundos e imprimir o correspondente número de horas, minutos e segundos que ele representa.
class Principal {
    public static void main(){
        int seg, min, hrs;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número de segundos :");
        seg = entrada.nextInt();
        System.out.println("O número informado corresponde à " + seg + " segundos.");
        hrs = seg/3600; 
        seg %= 3600;    
        min = seg/60;  
        seg %= 60;      
        System.out.println("Os segundos correspondem ao tempo de " + hrs + " horas, " + min + " minutos e " + seg + " segundos."); 
    }
}
*/
/* Exercício 5. Ler a base e a altura de um retângulo e imprimir o valor correspondente ao perímetro e a área deste.
class Principal {
    public static void main(){
        int base, altura, perimetro, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da base do retângulo :");
        base = entrada.nextInt();
        System.out.println("Informe o valor da altura do retângulo :");
        altura = entrada.nextInt();
        area = base * altura;
        perimetro = 2 * (base + altura);
        System.out.println("O retângulo informado possui área = " + area + " e perímetro = " + perimetro);
    }
}
*/
/* Exercício 6. Ler o comprimento do lado de um cubo e imprimir o valor correspondente ao volume do mesmo. 
class Principal {
    public static void main(){
        int lado, volume;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da lateral do cubo : ");
        lado = entrada.nextInt();
        volume = lado * lado * lado;
        System.out.println("O cubo informado possui volume = " + volume);
    }
}
*/
/* Exercício 7. Ler um valor em Reais e converter para Euros, imprimindo o resultado na tela. Considere o valor de 1 Real = 0,44 Euros.
class Principal {
    public static void main(){
        float real, euro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor em Reais :");
        real = entrada.nextFloat();
        euro = real/0.44;
        System.out.println
        ("O valor do Real informado corresponde em Euro à : " + euro);
    }
}
*/
/* Exercício 8. Faça um programa em Java para ler um número que representa a temperatura em Celsius e converta para Fahrenheit, imprimindo o resultado na tela. Lembrando que 0ºC = 32ºF e que cada 1ºC equivale a 1,8ºF. Por exemplo, 30ºC equivale à 86ºF.
class Principal {
    public static void main(){
        float celsius, fahrenheit;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius :");
        celsius = entrada.nextFloat();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println
        ("A temperatura informada corresponde em Fahrenheit à : " + fahrenheit);
    }
}
*/

// { Lista - Estruturas Condicionais - IF - Algoritmos e Programação - 17.04.24 }
// Parte 1 - Exercícios de estruturas condicionais e operadores relacionais e lógicos - CONCLUIDO ----------------------------------

/* 1. Faça um algoritmo que receba um número real e mostre a frase “VIVA OS ORNITORRINCOS” se ele for maior que 10.0 . 
(resolver usando fluxograma, pseudocódigo e Java) 

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número real : ");
        float num = entrada.nextFloat();
        if( num > 10.0 ){
            System.out.println("VIVA OS ORNITORRINCOS");
        } 
    }
}
*/
/* 2. Faça um algoritmo que receba um número inteiro e calcule e mostre sua raiz quadrada se for positivo (ou não negativo) 
ou calcule e mostre ele elevado ao quadrado se for negativo. (resolver usando fluxograma, pseudocódigo e Java)

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro : ");
        int num = entrada.nextInt();
        int quadrado;
        float raiz;
        if( num > 0 ){
            raiz = num ^ (1/2);
            System.out.println("A raiz quadrada do número informado é " + raiz);
        } else {
            quadrado = num * num;
            System.out.println("O quadrado do número informado é " + quadrado);
        }
    }
}
*/
/* 3. Faça um algoritmo que receba um número inteiro e informe se ele é par ou ímpar. (resolver usando fluxograma, pseudocódigo e Java)

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro : ");
        int num = entrada.nextInt();
        if( num % 2 == 0){
            System.out.println(num + "É um número par");
        } else {
            System.out.println(num + "É um número impar");
        }
    }
}
*/
/* 4. Faça um algoritmo que receba um número inteiro e informe se ele é ou não múltiplo de 2, 3 e 5 simultaneamente. (resolver usando pseudocódigo e Java)

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro : ");
        int num = entrada.nextInt();
        if( num % 2 == 0 && num % 3 == 0 && num % 5 == 0){
            System.out.println(num + "É um número divisível por 2, 3 e 5 respectivamente.");
        } else {
            System.out.println(num + "Não é um número divisível por 2, 3 e 5 respectivamente.");
        }
    }
}
*/
/* 5. Faça um algoritmo que receba três números reais e mostre apenas o maior deles. (resolver usando pseudocódigo e Java) 

class Principal{
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número real : ");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        if( n1 > n2 && n1 > n3 ){
            System.out.println("O maior dos números informados é " + n1);
        } else {
            if( n2 > n1 && n2 > n3){
                System.out.println("O maior dos números informados é " + n1);
            } else {
                System.out.println("O maior dos números informados é " + n3);
            }
        }
    }
}
*/
/* 6. Faça um algoritmo que receba dois números inteiros e um caractere. 
Se o caractere recebido for ‘ + ’, os números devem ser somados e o resultado mostrado. 
Se o caractere recebido for ‘ – ’, os segundo número deve ser subtraído do primeiro e o resultado mostrado. 
Se o caractere recebido for ‘ * ’, os números devem ser multiplicados e o resultado mostrado. 
Se o caractere recebido for ‘ / ’, o primeiro número deve ser dividido pelo primeiro e o resultado mostrado. 
Se qualquer outro caractere for recebido, deve ser mostrado “Operação inválida”. (resolver usando pseudocódigo e Java)

class Principal{
    public static void main(String[] args) {
        int soma, subt, mult, div;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro : ");
        int n1 = entrada.nextInt();
        System.out.print("Informe outro número inteiro : ");
        int n2 = entrada.nextInt();
        System.out.print("Informe um caracter : ");
        char caractere = entrada.next().charAt(0);
        if(caractere == '+'){
            soma = n1 + n2;
            System.out.println("A soma dos valores informados é " + soma);
        } else {
            if (caractere == '-') {
                subt = n2 - n1;
                System.out.println("A subtração dos valores informados é " + subt);   
            } else {
                if (caractere == '*') {
                    mult = n1 * n2;
                    System.out.println("A multiplicação dos valores informados é " + mult);   
                } else {
                    if (caractere == '/') {
                        div = n1 / n2;
                        System.out.println("A divisão dos valores informados é " + div);   
                    } else {
                        System.out.println("Operação Inválida");   
                    }
                }
            }
        }
    }
}
*/
/* 7. Faça um algoritmo que receba 3 números inteiros referentes a um horário no formato Horas:Minutos:Segundos 
e diga se o horário recebido é ou não válido.(resolver usando pseudocódigo e Java)
DICA: use o sistema de horas indo de 00 a 23.

class Principal{
    public static void main(String[] args){
        int hrs, min, seg;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Indique o número de horas: ");
        hrs = entrada.nextInt();
        System.out.print("Indique o número de minutos: ");
        min = entrada.nextInt();
        System.out.print("Indique o número de segundos: ");
        seg = entrada.nextInt();
        if ( hrs >= 00 && hrs <= 23 && min >= 00 && min <= 59 && seg >= 00 && seg <= 59 ) {
            System.out.println( hrs + ":" + min + ":" + seg + " Corresponde a um horário válido");
        } else {
            System.out.println("O número informado não corresponde a um horário válido");
        }
    }
}
*/
/* 8. Faça um algoritmo que receba três números reais referentes às notas das provas de um aluno, 
calcule a média aritmética simples e mostre o conceito desse aluno
(uma letra) conforme a tabela abaixo: (resolver usando pseudocódigo e Java)
9.0 >= nota final <= 10 (conceito A)
7.5 >= nota final < 9.0 (conceito B)
6.0 >= nota final < 7.5 (conceito C)
nota final < 6.0 (conceito D) 

class Principal{
    public static void main(String[] args) {
        float p1, p2, p3, media, conceito;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a primeira nota : ");
        p1 = entrada.nextFloat();
        System.out.print("Informe a segunda nota : ");
        p2 = entrada.nextFloat();
        System.out.print("Informe a terceira nota : ");
        p3 = entrada.nextFloat();
        media = (p1 + p2 + p3) / 3;
        if ( media >= 9.0 && media <= 10 ) {
            System.out.print("A");
        }else{
            if ( media >= 7.5 && media < 9.0 ) {
                System.out.print("B");
            } else {
                if ( media >= 6.0 && media < 7.5 ) {
                    System.out.print("C");
                } else {
                    if ( media < 6.0) {
                        System.out.print("D");
                    }
                }
            }
        }
    }
}
*/
/* 9. Faça um algoritmo que receba uma letra referente ao cargo de um funcionário(confira abaixo), 
uma letra referente ao horário do dia trabalho (confira abaixo) 
e um número inteiro referente à quantidade de horas trabalhadas, 
e calcule e mostre o salário desse funcionário. (resolver usando pseudocódigo e Java)
O – cargo de operário – ganha R$ 15.95 por hora trabalhada
G – cargo de gerência – ganha R$ 22.14 por hora trabalhada
M – horário matutino – ganha apenas o salário calculado pela quantidade de horas
V – vespertino – ganha o salário calculado + 12.5%
N – noturno – ganha o salário calculado + 27.5% 

class Principal{
    public static void main(String[] args) {
        double salario, extra;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe uma letra referente ao cargo do funcionário : ");
        char cargo = entrada.next().charAt(0);
        System.out.print("Informe uma letra referente ao turno de trabalho : ");
        char turno = entrada.next().charAt(0);
        System.out.print("Informe um número inteiro referente a quantidade de horas trabalhadas : ");
        int qhoras = entrada.nextInt();
        if((cargo == 'O' || cargo == 'o') && (turno == 'M' || turno == 'm')){
            salario = 15.95 * qhoras;
            System.out.print(" O valor do salário do funcionário é : " + salario);
        } elseif((cargo == 'O' || cargo == 'o') && (turno == 'V' || turno == 'v')){
                salario = 15.95 * qhoras;
                extra = salario * 12.5;
                salario = salario + extra;
                System.out.print(" O valor do salário do funcionário é : " + salario);
            } elseif((cargo == 'O' || cargo == 'o') && (turno == 'N' || turno == 'n')){
                    salario = 15.95 * qhoras;
                    extra = salario * 27.5;
                    salario = salario + extra;
                    System.out.print(" O valor do salário do funcionário é : " + salario);
                }
            }
        }
        if((cargo == 'G' || cargo == 'g') && (turno == 'M' || turno == 'm')){
            salario = 22.14 * qhoras;
            System.out.print(" O valor do salário do funcionário é : " + salario);
        } else if((cargo == 'G' || cargo == 'g') && (turno == 'V' || turno == 'v')){
                salario = 22.14 * qhoras;
                extra = salario * 12.5;
                salario = salario + extra;
                System.out.print(" O valor do salário do funcionário é : " + salario);
            } else {
                if((cargo == 'G' || cargo == 'g') && (turno == 'N' || turno == 'n')){
                    salario = 22.14 * qhoras;
                    extra = salario * 27.5;
                    salario = salario + extra;
                    System.out.print(" O valor do salário do funcionário é : " + salario);
                }
            }
        }
    }
}
*/

// Parte 2 - Exercícios de Interpretação - 80% ------------------------------------------------------------------------------

/* 10. Um professor precisa verificar quais estudantes foram aprovados em sua
disciplina de Algoritmos e Programação. Considere que (1) o professor fornecerá a
nota do estudante e sua frequência (referente à porcentagem de aulas assistidas), e (2)
um estudante precisa de nota mínima 6.0 e de frequência mínima 75% para
aprovação. Faça um algoritmo que mostre se um estudante foi ou não aprovado.

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a nota do aluno : ");
        float nota = entrada.nextFloat();
        System.out.print("Informe a frequência do aluno : ");
        float frequencia = entrada.nextFloat();
        if( nota >= 6.0 && frequencia >= 75 ){
            System.out.println("O estudante foi Aprovado!");
        } else {
            System.out.println("O estudante foi Reprovado!");
        }
    }
}
*/
/* 11. Um porteiro de um prédio comercial precisa saber quantos minutos cada
visitante ficou nas dependências do prédio, mas ele apenas possui o registro de
entrada e saída como referência. Considere que (1) o porteiro fornecerá quatro
valores inteiros distintos (as horas na entrada, os minutos na entrada, as horas na
saída, e os minutos na saída), e (2) o prédio fica aberto apenas das 08:00 às 20:00 e
ninguém pode entrar ou sair fora desse horário. Faça um algoritmo que ajude o
porteiro. 

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a hora de entrada : ");
        int hr_entrada = entrada.nextInt();
        System.out.print("Informe os minutos de entrada : ");
        int min_entrada = entrada.nextInt();
        System.out.print("Informe a hora de saída : ");
        int hr_saida = entrada.nextInt();
        System.out.print("Informe os minutos de saída : ");
        int min_saida = entrada.nextInt();
        if( hr_entrada >= 8 && hr_saida <= 20 ){
            int tempo_hrs = hr_saida - hr_entrada ;
            System.out.println(tempo_hrs);
            min_entrada = 60 - min_entrada;
            System.out.println(min_entrada);
            int tempo_min = min_entrada + min_saida;
            System.out.println(tempo_min);
            if (tempo_hrs >= 1) {
                tempo_hrs *= 60;
            }
            tempo_min = tempo_min + tempo_hrs;
            System.out.println("O tempo de visita foi de " + tempo_min + " minutos.");
        } else {
            System.out.println("O horário informado não permite visitantes.");
        }
    }
}
*/
/* * 12. Um contador da comunidade local precisa conferir o valor básico de Imposto
de Renda (IR) anual que famílias devem pagar. Considere que (1) o contador vai
informar apenas o salário bruto mensal da família, (2) a porcentagem de pagamento
de imposto (alíquota) por mês é calculada com base no salário bruto mensal conforme
a tabela a seguir (se alguém ganha R$ 3000, pagará 15% como IR mensal, ou seja, R$
450), e (3) existe um valor que deve ser reduzido (dedução) do imposto de renda
calculado mensalmente conforme a tabela a seguir (se alguém ganha R$ 3000 e
pagaria R$450 de imposto pela alíquota, devem ser deduzidos R$ 372.54, fazendo
com que a pessoa pague R$ 77.46 de imposto por mês). Faça um algoritmo que ajude
o contador a calcular o Imposto de Renda anual pago.
Faixa de salário Alíquota Dedução
Até 1999.18 isento de imposto de renda
De 1999.18 até 2967.98 7.5% 149.94
De 2967.98 até 3938.60 15% 372.54
De 3938.60 até 4897.91 22.5% 667.93
Acima de 4897.92 27.5% 912.83

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o salário bruto mensal familiar : ");
        Float IR = entrada.nextFloat();
        if( hr_entrada >= 8 && hr_saida <= 20 ){
            int tempo_hrs = hr_saida - hr_entrada ;
            System.out.println(tempo_hrs);
            min_entrada = 60 - min_entrada;
            System.out.println(min_entrada);
            int tempo_min = min_entrada + min_saida;
            System.out.println(tempo_min);
            if (tempo_hrs >= 1) {
                tempo_hrs *= 60;
            }
            tempo_min = tempo_min + tempo_hrs;
            System.out.println("O tempo de visita foi de " + tempo_min + " minutos.");
        } else {
            System.out.println("O horário informado não permite visitantes.");
        }
    }
}
*/
/* 13. Um professor de geometria do ensino fundamental precisa ensinar os diferentes
tipos de triângulos para seus alunos do quarto ano. Considere que (1) o professor
entrará com três números reais referentes aos tamanhos dos lados de um triângulo, (2)
um triângulo cujos lados são iguais é equilátero, (3) um triângulo cujos lados são
todos diferentes é escaleno, (4) um triângulo que possui dois lados quaisquer de
tamanho igual e um lado de tamanho diferente é isósceles, e (5) devem ser cuidados
os casos em que é impossível formar um triângulo com os valores informados (por
exemplo, não existe triângulo com qualquer um dos lados com valor negativo). Faça
um algoritmo que ajude o professor com o processo de ensino-aprendizagem na
escola.

class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor do cateto adjacente : ");
        float adjacente = entrada.nextFloat();
        System.out.print("Informe o valor do cateto oposto : ");
        float oposto = entrada.nextFloat();
        System.out.print("Informe o valor da hipotenusa : ");
        float hipotenusa = entrada.nextFloat();
        if (oposto > 0 && hipotenusa > 0 && adjacente > 0) {
            if( oposto == adjacente && adjacente == hipotenusa ){
                System.out.println("De acordo com os valores informados o triangulo é EQUILÁTERO.");
            } else if(oposto == adjacente || oposto == hipotenusa || adjacente == hipotenusa) {
                System.out.println("De acordo com os valores informados o triangulo é ISÓSCELES.");
            } else if (oposto != adjacente && oposto != hipotenusa && adjacente != hipotenusa) {
                System.out.println("De acordo com os valores informados o triangulo é ESCALENO.");
            }
        } else {
            System.out.println("Impossível formar um triângulo com os valores informados");
        }
    }
}
*/

// Algoritmos e Programação - Estruturas de Controle - Exercícios Aula - Switch Case - 18.04.24 - OK

/* 1. Faça um algoritmo que recebe do usuário um número entre 1 e 7 e informe o dia da semana conforme a 
tabela abaixo:   1 - Dom | 2 - Seg | 3 - Ter | 4 - Qua | 5 - Qui | 6 - Sex | 7 - Sab 

class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        switch (num) {
            case '1':
                System.out.println("Domingo");
                break;
            case '2':
                System.out.println("Segunda");
                break;
            case '3':
                System.out.println("Terça");
                break;
            case '4':
                System.out.println("Quarta");
                break;
            case '5':
                System.out.println("Quinta");
                break;
            case '6':
                System.out.println("Sexta");
                break;
            case '7':
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
*/
/* 2. Faça um algoritmo que recebe do usuário a hora do dia (apenas um número entre 0 e 23) e mostre a
mensagem “Bom dia!” se for entre 6 e 12, “Boa tarde!” se for entre 13 e 18, ou “Boa noite!” se for entre 19 e 5. 
(use a estrutura ESCOLHA-CASO para resolver)

class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hr = entrada.nextInt();
        switch (hr) {
            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Bom Dia!");
                break;
            case 13, 14, 15, 16, 17, 18:
                System.out.println("Boa Tarde!");
                break;
            case 19, 20, 21, 22, 23, 00, 1, 2, 3, 4, 5:
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Hora inválida");
        }
    }
}
*/

// { Lista - Estruturas Condicionais - Switch Case - Algoritmos e Programação - 18.04.24 } CONCLUIDA -----------------------------------

/*   Exercício 1. Desenvolva um programa que solicite um número de 1 a 7 ao usuário 
e informe o dia da semana correspondente, sendo domingo o número 1. 
Caso o número não corresponda a um dia da semana, deve ser exibida uma mensagem de erro.
    
    class Principal {
        public static void main( ) {
        int dia;
        Scanner entrada = new Scanner( System.in );
        System.out.println("Informe um numero de 1 a 7");
        dia = entrada.nextInt();
        switch( dia ) {
            case '1' :
            System.out.println( "Domingo" );
            break;
            case '2' :    
            System.out.println( "Segunda" );
            break;
            case '3' :
            System.out.println( "Terça" );
            break;
            case '4' :
            System.out.println( "Quarta" );
            break;
            case '5' :
            System.out.println( "Quinta" );
            break;
            case '6' :
            System.out.println( "Sexta" );
            break;
            case '7' :
            System.out.println( "Sábado" );
            break;
        default:
        System.out.println( "Número inválido" );
        }           
    }
}
*/
/*   Exercício 2. Desenvolva um programa que solicite ao usuário um algarismo de 0 a 9 
e escreva-o por extenso. Caso o número não corresponda a um dos algarismos, deve ser exibida uma mensagem de erro.
    
    class Principal {
        public static void main( ) {
        int num;
        Scanner entrada = new Scanner( System.in );
        System.out.println("Informe um numero de 0 a 9");
        dia = entrada.nextInt();
        switch( num ) {
            case '0' :
            System.out.println( "Zero" );
            break;
            case '1' :
            System.out.println( "Um" );
            break;
            case '2' :    
            System.out.println( "Dois" );
            break;
            case '3' :
            System.out.println( "Três" );
            break;
            case '4' :
            System.out.println( "Quatro" );
            break;
            case '5' :
            System.out.println( "Cinco" );
            break;
            case '6' :
            System.out.println( "Seis" );
            break;
            case '7' :
            System.out.println( "Sete" );
            break;
            case '8' :
            System.out.println( "Oito" );
            break;
            case '9' :
            System.out.println( "Nove" );
            break;
        default:
        System.out.println( "Número inválido" );
        }           
    }
}
*/
/*   Exercício 3. Desenvolva um programa que solicite um número de 1 a 4 ao usuário e informe a estação do ano 
correspondente, sendo verão o número 1, outono o número 2, inverno o número 3, e primavera o número 4. 
Caso o número não corresponda a uma estação, deve ser exibida uma mensagem de erro.

    class Principal {
        public static void main( ) {
        int estacao;
        Scanner entrada = new Scanner( System.in );
        System.out.println("Informe um numero de 1 a 4");
        dia = entrada.nextInt();
        switch( estacao ) {
            case '1' :
            System.out.println( "Verão" );
            break;
            case '2' :    
            System.out.println( "Outono" );
            break;
            case '3' :
            System.out.println( "Inverno" );
            break;
            case '4' :
            System.out.println( "Primavera" );
            break;
        default:
        System.out.println( "Número inválido" );
        }           
    }
} 
*/
/*   Exercício 4. Desenvolva um programa que solicite ao usuário o preço de um produto e o código relativo 
à forma de pagamento. De acordo com a tabela dada abaixo, deve ser aplicado o desconto especificado e 
o programa deve exibir o número de prestações e o valor de cada prestação a ser paga: 
    
    class Principal {
        public static void main( ) {
        int codigo;
        float preco, desconto;
        Scanner entrada = new Scanner( System.in );
        System.out.println("Informe o preço do produto: ");
        preco = entrada.nextFloat();
       System.out.print("Informe o código corresponente a forma de pagamento: ");
        codigo = entrada.nextInt();
        switch( codigo ) {
            case '1' :
            desconto = (preco * 30)/100;
            preco = preco + desconto; 
            System.out.println( "1 Prestaçao de R$" + preco );
            break;
            case '2' :    
            desconto = (preco * 20)/100;
            preco = (preco/codigo) + desconto; 
            System.out.println( "2 Prestações de R$" + preco );
            break;
            case '3' :
            desconto = (preco * 10)/100;
            preco = (preco/codigo) + desconto; 
            System.out.println( "3 Prestações de R$" + preco );
            break;
            case '4' :
            desconto = 0;
            preco = (preco/codigo) + desconto; 
            System.out.println( Codigo + " Prestações de R$" + preco );
            break;
        default:
        System.out.println( "Código inválido" );
        }           
    }
}
*/
/*   Exercício 5. Desenvolva um programa que apresente um menu ao usuário com as opções apresentadas 
na tabela abaixo e solicite ao usuário qual a opção desejada. Para cada opção, 
o programa deverá exibir a ação que foi escolhida.

       class Principal {
        public static void main( ) {
        char acao;
        Scanner entrada = new Scanner( System.in );
        System.out.println("Informe a ação desejada : ");<
        acao = entrada.nextLine().charAt(0);
        switch( acao ) {
            case 'a' :
            System.out.println( "Cadastrar" );
            break;
            case 'b' :    
            System.out.println( "Editar" );
            break;
            case 'c' :
            System.out.println( "Consultar" );
            break;
            case 'd' :
            System.out.println( "Remover" );
            break;
            case 'e' :
            System.out.println( "Sair" );
            break;
        default:
        System.out.println( "Ação inválida" );
        }           
    }
}
*/

// { Lista - Estruturas de Repetição - For - Algoritmos e Programação - 30.04.24 } CONCLUIDA -----------------------------------

/* Exercício 1. Faça um programa para mostrar todos os números entre 70 e 1. 
class Principal {
    public static void main() {
        for (int i = 70; i >= 1; i--) {
            System.out.println(i);
        }
    }
} 
*/
/* Exercício 2. Faça um programa para mostrar todos os múltiplos de 3 entre 1 e 70. 
class Principal {
    public static void main() {
        for (int i = 1; i <= 70; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
} 
*/
/* Exercício 3. Faça um programa para mostrar a soma e o produto dos números entre 1 e 10. 
class Principal {
    public static void main() {
        int soma = 0;
        int produto = 1;
        for (int i = 1; i <= 10; i++) {
            // ( soma = soma + n; ) == ( soma += n; )
            soma += i;
            produto *= i;
            
        }
        System.out.println("Soma : " + soma);
        System.out.println("Produto : " + produto);
    }
}
*/
/* Exercício 4. Faça um programa que apresente a tabuada de multiplicar de um número qualquer.
class Principal {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print( "Informe um número : " );
        int n = entrada.nextInt();
        int mult;
        for (int i = 1; i <= 10; i++) {
            mult = n * i;
            System.out.println( n + " x " + i + " = " + mult );
        }
    }
}
*/
/* Exercício 5. Faça um programa que apresente a tabuada de soma de um número qualquer.
class Principal {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print( "Informe um número : " );
        int n = entrada.nextInt();
        int soma;
        for (int i = 1; i <= 10; i++) {
            soma = n + i;
            System.out.println( n + " + " + i + " = " + soma );
        }
    }
}
*/
/* Exercício 6. Faça um algoritmo para ler 10 números e mostrar quantos são pares e quantos são ímpares.
class Principal {
    public static void main() {
        int pares = 0;
        int impares = 0;
        Scanner entrada = new Scanner( System.in );
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int num = entrada.nextInt();
            if (num % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        }
        System.out.println( pares + " números Pares");
        System.out.println( impares + " números Impares");
    }
}
*/
/* Exercício 7. Faça um algoritmo para ler 20 números e escrever a média dos
números que são ímpares e dos números que são pares.
class Principal {
    public static void main() {
        int pares = 0;
        int impares = 0;
        Scanner entrada = new Scanner( System.in );
        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int num = entrada.nextInt();
            if (num % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }                
        float mediaP = (float) pares / 10;
        float mediaI = (float) impares / 10;
        System.out.println( mediaP + " é média dos números Pares");
        System.out.println( mediaI + " é média dos números Impares");
    }
}
*/
/* Exercício 8. Faça um algoritmo que leia 20 números e imprimir a soma dos
números cujos valores do quadrado dos números são menores que 200.
class Principal {
    public static void main() {
        int soma = 0;
        Scanner entrada = new Scanner( System.in );
        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int numero = entrada.nextInt();
            int quadrado = numero * numero;            
            if (quadrado < 200) {
                soma += numero;  
            }
        }
        System.out.println("A soma dos números cujos quadrados são menores que 200 é : " + soma);
    }
}
*/
/* Exercício 9. Faça um algoritmo para ler a nota de três provas (p1, p2, p3) de 10 alunos 
e escrever a média aritmética de cada aluno, se a média for maior que 6 escrever “Parabéns Aprovado!”, 
senão “Você foi Reprovado!”
class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe as notas do " + i + "º aluno ");
            // entrada float só funciona escrita com vírgula.
            System.out.print("Nota da prova 1: ");
            float p1 = entrada.nextFloat();
            System.out.print("Nota da prova 2: ");
            float p2 = entrada.nextFloat();
            System.out.print("Nota da prova 3: ");
            float p3 = entrada.nextFloat();
            float media = (p1 + p2 + p3) / 3;
            System.out.println("Média do aluno " + i + ": " + media);
            if (media >= 6) {
                System.out.println("Parabéns Aprovado!");
            } else {
                System.out.println("Você foi Reprovado!");
            }
        }
    }
}
*/

// Exercícios extras - Estruturas de Repetição - For - Algoritmos e Programação - 30.04.24 - OK

/* 1. Faça um programa que receba do usuário um número inteiro positivo N  e mostre o triângulo numérico 
 desse número segundo o padrão abaixo : 
 n = 4
 1
 12
 123
 1234
class Principal {
    public static void main() {
        Scanner entrada = new Scanner( System.in );
        System.out.print("Informe um número inteiro positivo : ");
        int N = entrada.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/
/* 2. Faça um programa que receba do usuário um número inteiro positivo N  e mostre o padrão de triângulo 
espelhado segundo o exemplo abaixo : 
 n = 3
  3
 23
123
  321
  32
  3
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int N = entrada.nextInt();
        for (int i = 1; i <= N; i++) {// Parte superior do triângulo (ascendente)
            for (int j = 1; j <= N - i; j++) {// Espaços à esquerda
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {// Números crescentes à direita
                System.out.print(k);
            }
            System.out.println();
        }
        
        for (int i = N ; i >= 1; i--) {// Parte inferior do triângulo (descendente)
            for (int j = 1; j <= N - 1 ; j++) { // Espaços à esquerda
                System.out.print(" ");
            }
            for (int k = 1; k <= N ; k++) {// Números decrescentes à direita
                System.out.print(k);
            }
            System.out.println();
        }
    }
} 
*/
/* 
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int N = entrada.nextInt();
        // Parte superior do triângulo (ascendente)
        for (int i = 1; i <= N; i++) {
            // Espaços à esquerda
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // Números crescentes à direita
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

        // Parte inferior do triângulo (descendente)
        for (int i = N - 1; i >= 1; i--) {
            // Espaços à esquerda
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // Números decrescentes à direita
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

        entrada.close(); // Fechar o Scanner
    }
}
*/

// { Lista - Estruturas de Repetição - While - Algoritmos e Programação - 22.05.24 } CONCLUIDA -----------------------------------

/* Exercício 1. Faça um programa para mostrar todos os números entre 100 e 1 usando o comando while. 

class Principal {
    public static void main( ){
        int num;
        num = 100;
        while( num >= 1 && num <= 100 ){
            System.out.println(num);
            num --;
        }
    }
} */
/* Exercício 2. Faça um programa para mostrar a soma e o produto dos números
entre 1 e 10 (incluindo 1 e 10) usando o comando while. 

class Principal {
    public static void main( ){
        int num = 1;
        int soma = 0;
        int produto = 1;
        while( num >= 1 && num <= 10 ){
            soma += num;
            produto *= num;
            num ++;
        }
    }
}*/
/* Exercício 3. Faça um programa que leia números inteiros e escreva o quadrado do número até que o usuário informe zero. 
Por exemplo:
Informe um número inteiro ou zero para sair: 3
O quadrado de 3 é 9
Informe um número inteiro ou zero para sair: 4
O quadrado de 4 é 16
Informe um número inteiro ou zero para sair: 0

class Principal {
    public static void main( ){
        Scanner entrada = new Scanner( System.in );
        int num;
        int quad = 0;
        do{ 
            System.out.print("Informe um número inteiro : ");
            num = entrada.nextInt();
            quad = num * num;
            System.out.println("O quadrado do número informado é " + quad);
        } while( num != 0 );
    }
} */
/* Exercício 4. Escreva um programa que solicita o valor de uma compra à vista,
calcule e mostre o valor da compra, sabendo-se que o desconto do dia é de 10%. 
O algoritmo deve repetir esses passos enquanto forem informados valores positivos para compras. 

class Principal {
    public static void main( ){
        Scanner entrada = new Scanner( System.in );
        float avista, desc, total;
        do { 
            System.out.print("Informe o valor de compra à vista : ");
            avista = entrada.nextFloat();
            desc = (avista * 10)/100;
            total = avista - desc;
            System.out.println("O valor de compra com desconto é : " + total);
        } while ( avista > 0 );    
    }
} */
/* Exercício 5. Faça um programa que leia notas entre 0.0 e 10.0 até que seja
informada uma nota menor que 0.0. Se uma nota maior que 10.0 for informada, o
programa deve ignorar essa nota. Finalmente, o programa deve calcular a média
aritmética simples das notas válidas recebidas (ignorando as notas inválidas e a
nota menor que zero informada por último) depois de receber um nota negativa. 

class Principal {
    public static void main( ){
        Scanner entrada = new Scanner( System.in );
        float nota, media, notas;
        int valid = 0;
        notas = 0;
        media = 0;
        do { 
            System.out.print("Informe o valor de uma nota : ");
            nota = entrada.nextFloat();
            if (nota > 0.0 && nota <= 10.0) {
                valid++;
                notas += nota;
            } else {
                System.out.println("O valor da última nota informada é inválido.");
            }
        } while ( nota > 0.0 );  
        media = notas/valid;
        System.out.println("O valor da média entre as notas válidas é : " + media);  
    }
} */

// Exercícios aula - Estruturas de Repetição - while - Algoritmos e Programação - 22.05.24 - OK

/* 1. Faça um programa para mostrar todos os números entre 1 e 100 usando o comando while.     

class Principal {
    public static void main( ){
        int num;
        num = 1;
        Scanner entrada = new Scanner( System.in );
        while( num >= 1 && num <= 100 ){
            System.out.println(num);
            num ++;
        }
    }
}
*/
/* 2. Faça um programa que recebe do usuário um número entre 0 e 10. Caso o número 
informado não estiver contido neste intervalo, repita a operação até que a condição seja respeitada

class Principal {
    public static void main( ){
        int num;
        Scanner entrada = new Scanner( System.in );
        do {
        System.out.println("Informe um número :");
        num = entrada.nextInt( );
        }
        while(num < 0 || num > 10 );
        System.out.println( num );
    }
}*/
/* 3. Faça um programa que recebe do usuário um número inteiro N, enquanto N é maior que 
zero faça N = N/2 e imprima o valor de N a cada iteração. 

class Principal {
    public static void main( ){
        int N;
        Scanner entrada = new Scanner( System.in );
        System.out.print("Informe um número :");
        N = entrada.nextInt( );
        while( N > 0 ){
            N = N / 2;
            System.out.println(N);
        }
    }
}
*/

// { Lista - Vetores - Algoritmos e Programação - 28.05.24 } CONCLUÍDA -------------------------------------------------------------

/* class Principal {
    public static void main() {
        int vetor[] = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + "é par!");
            }
        }
    }
} */

/* Exercício 1. Escreva um programa Java que declare um vetor de inteiros de 5
posições e o preencha com os 5 primeiros números ímpares e imprima-o. 

class Principal {
    public static void main() {
        int vetor[] = new int[5];
        // Opção 1
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < 10; j += 2) {
                vetor[i] = j;
                System.out.println(vetor[i]);
            }
        }
        // Opção 2
        int num = 1;
        for (int i = 0; i < 5; i++) {
            vetor[i] = num;
            num += 2;
            System.out.println(vetor[i]);
        }
    }
} */
/* Exercício 2. Escreva um programa Java que declare um vetor de inteiros de 10 posições 
e preencha ele com valores recebidos do usuário. Em seguida, o programa recebe um número inteiro 
referente a uma posição do vetor e exibe o número inteiro armazenado na posição do vetor criado anteriormente.

class Principal {
    public static void main() {
        int vetor[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor para a posição " + i + " => ");
            vetor[i] = entrada.nextInt();
        }
        System.out.print("Informe o valor referente a uma posição do vetor : ");
        int pos = entrada.nextInt();
        System.out.print("O valor da posição solicitada é : " + vetor[pos]);
    }
} */
/* Exercício 3. Escreva um programa Java que leia um vetor de inteiros de 10 posições 
(ou seja, declara um vetor de inteiros de tamanho 10 e armazena 10 valores informados pelo usuário em suas posições) 
e em seguida escreve a soma dos valores armazenados no vetor. 

class Principal {
    public static void main() {
        int vetor[] = new int[10];
        int soma = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor para a posição " + i + " => ");
            vetor[i] = entrada.nextInt();
            soma += vetor[i];
        }
        System.out.print("A soma dos valores informados é : " + soma);
    }
} */
/* Exercício 4. Escreva um programa Java que leia um vetor de inteiros de 10 posições 
e informe quantos valores pares ele possui. 

class Principal {
    public static void main() {
        int vetor[] = new int[10];
        int pares = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor para a posição " + i + " => ");
            vetor[i] = entrada.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.print("Dentre os valores informados, " + pares + " são pares.");
    }
} */
/* Exercício 5. Faça um programa que leia um vetor de números reais com 10 posições e, 
depois, mostre o maior e o menor elemento desse vetor. 

class Principal {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        float vetor[] = new float[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor para a posição " + i + " => ");
            vetor[i] = entrada.nextFloat();
        }    
        float maior = vetor[0];
        float menor = vetor[0];
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Dentre os valores informados, o maior é " + maior );
        System.out.println("Dentre os valores informados, o menor é " + menor );

    }
} */
/* Exercício 6. Escreva um programa Java que leia um vetor de inteiros de 10 posições e 
em seguida um valor X qualquer. Seu programa deverá fazer uma busca do valor X no vetor lido 
e informar a posição em que foi encontrado ou uma mensagem de “não encontrado”. 

class Principal {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor para a posição " + i + " => ");
            vetor[i] = entrada.nextInt();
        } 
        System.out.print("Agora informe o valor que deseja encontrar : ");
        int valor = entrada.nextInt();
        int pos = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == valor) {
                pos = i;
                i = 10;
            } else {
                System.out.println("Valor não encontrado."); // mensagem dentro do loop ?
            }
        }
        System.out.println("A posição do valor buscado é " + pos );
    }
} */
/* Exercício 7. Faça um programa que leia um vetor de números reais de 10 valores e 
depois outro vetor de números reais com outros 10 valores. 
Em seguida, o programa deve mostrar o resultado da multiplicação entre os valores de mesmo índice, 
ou seja, o primeiro valor do primeiro vetor deve ser multiplicado pelo primeiro valor do segundo vetor e, 
assim, sucessivamente, até que o último valor do primeiro vetor seja multiplicado pelo último valor do segundo vetor. 

class Principal {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        float vetor1[] = new float[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor 1 : Informe o valor para a posição " + i + " => ");
            vetor1[i] = entrada.nextFloat();
        }   
        float vetor2[] = new float[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor 2 : Informe o valor para a posição " + i + " => ");
            vetor2[i] = entrada.nextFloat();
        } 
        float mult = 0;
        for (int i = 0; i < 10; i++) {
            mult = vetor1[i] * vetor2[i];
            System.out.println("O resultado da multipliação de vetores no índice " + i + " é => " + mult);
        }
    }
}*/
/* Exercício 8. Escreva um programa Java que leia um conjunto de 10 números reais, armazena-os em um vetor e informe:
1. Quantos são maiores que a média
2. Quantos são iguais à média 

class Principal {
    public static void main() {
        float vetor[] = new float[10];
        float soma = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor para a posição " + i + " => ");
            vetor[i] = entrada.nextFloat();
            soma += vetor[i];
        }
        float media = soma/10;
        int maiores = 0;
        int iguais = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > media) {
                maiores++;
            } else if (vetor[i] == media) {
                iguais++;
            }
        }
        System.out.print("A média dos valores informados é : " + media);
        System.out.print( maiores + " Valores são maiores que a média");
        System.out.print( iguais + " Valores são iguais a média");
    }
} */
/* Exercício 9. Faça um programa que leia um vetor de 10 posições. 
Verifique se existem valores iguais e escreva-os na tela. 

class Principal {
    public static void main() {
        int vetor[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor para a posição " + i + " => ");
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i] + " na posição [" + i + "] e na posição [" + j + "] São valores iguais");
                }
            }
        }
    }
} */
/* Exercício 10. Durante uma corrida de automóveis com N voltas de duração foram anotadas para um piloto, 
na ordem sequencial, os tempos registrados em cada volta. Faça um programa para ler os tempos registrados em 15 voltas, 
calcular e imprimir:
A. Melhor tempo registrado;
B. A volta em que o pior tempo ocorreu;
C. Tempo médio das N voltas. 

class Principal {
    public static void main() {
        float vetor[] = new float[15];
        float maisRapido = 0;
        float maisLento = 0;
        float media = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.print("Informe o tempo para a volta " + i + " => ");
            vetor[i] = entrada.nextFloat();
        }
        maisRapido = vetor[0];
        maisLento = vetor[0];
        for (int i = 0; i < 15; i++){
            if (maisRapido > vetor[i]) {
                maisRapido = vetor[i];
           }
        }
        System.out.println("O melhor tempo do piloto é: " + maisRapido);
         for (int i = 0; i < 15; i++){
            if (maisLento < vetor[i]) {
                maisLento = vetor[i];
           }
        }
        System.out.println("O tempo mais devagar do piloto é: " + maisLento);
        for (int i = 0; i < 15; i++){
            media = media + vetor[i];
        }
        media = media/15;
        System.out.println("O tempo médio do piloto é: " + media);
    }
}*/
/* Exercício 11. Faça um programa que receba o número sorteado por um dado (de seis lados) em vinte jogadas 
e armazene-os em um vetor. Se algum valor de entrada informado não estiver no intervalo de 1 a 6, 
esse número deve ser pedido novamente. Mostre a frequência de cada número sorteado. 

class Principal {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        int frequencia[] = new int[6];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Informe o valor para a posição " + i + " (entre 1 e 6) => ");
            vetor[i] = entrada.nextInt();
            while (vetor[i] < 1 || vetor[i] > 6) {
                System.out.print("Valor inválido! Informe um novo valor para a posição " + i + " (entre 1 e 6) => ");
                vetor[i] = entrada.nextInt();
            }
            frequencia[vetor[i] - 1]++; // Atualiza a frequência do valor lido
        }
        for (int i = 0; i < 6; i++) { // Exibição da frequência de cada valor
            System.out.println("Frequência do número " + (i + 1) + ": " + frequencia[i]);
        }
    }
} */
/* Exercício 12. Elaborar um programa que leia 20 elementos do tipo real em um vetor A 
e construir um vetor B de mesma dimensão com os mesmos elementos armazenados no vetor A, 
porém de forma invertida. Ou seja, o primeiro elemento do vetor A passa a ser o último do vetor B, 
o segundo elemento do vetor A passa ser o penúltimo do vetor B e assim por diante. 
Apresentar os elementos dos vetores A e B. 

class Principal {
    public static void main() {
        float A[] = new float[20];
        float B[] = new float[20];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Informe um valor real para a posição " + i + " do vetor A => ");
            A[i] = entrada.nextFloat();
        }
        for (int i = 0; i < 20; i++) {
            B[i] = A[19 - i];
        }   
        System.out.println("\nVetor A:");
        for (int i = 0; i < 20; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
        System.out.println("\nVetor B:");
        for (int i = 0; i < 20; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}*/

// { Lista - Matrizes - Algoritmos e Programação - 04.06.24 }  -------------------------------------------------------------

/* Exercício 1. Escreva um programa Java que declare uma matriz 5 x 5, preencha
com 1 a diagonal principal e com 0 os demais elementos e, ao final, mostre a matriz obtida. 

class Principal {
    public static void main() {
        int matriz[][] = new int[5][5];
        Scanner entrada = new Scanner( System.in );
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Preenche a diagonal principal com 1
                } else {
                    matriz[i][j] = 0; // Preenche os demais elementos com 0
                }
            }
        }
        // Imprimindo a matriz
        System.out.println("\nA matriz é :");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
} 
/* Exercício 2. Escreva um programa Java que leia uma matriz 5 x 3, conte e escreva
quantos valores maiores que 10 ela possui. 

class Principal {
    public static void main() {
        int matriz[][] = new int[5][3];
        int maiores = 0;
        Scanner entrada = new Scanner( System.in );
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe um valor para compor a matriz na coluna " + (j + 1) + " da linha " + (i + 1) + " => " );
                matriz[i][j] = entrada.nextInt();
                
                if (matriz[i][j] > 10) {
                    maiores += 1;
                }
            }
        }
        // Imprimindo a matriz
        //for (int i = 0; i < 5; i++) {
        //    for (int j = 0; j < 3; j++) {
        //        System.out.print(matriz[i][j] + " ");
        //    }
        //    System.out.println(); // Nova linha após cada linha da matriz
        //}
        System.out.println("A matriz informada possui : " + maiores + " valores maiores do que 10, sendo eles : ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > 10) {
                    System.out.print(matriz[i][j] + " | ");
                }
            }
        }
    }
} */
/* Exercício 3. Escreva um programa Java que leia uma matriz 6 x 6 e escreva a soma
dos elementos da diagonal principal. 

class Principal {
    public static void main() {
        int matriz[][] = new int[6][6];
        int soma = 0;
        Scanner entrada = new Scanner( System.in );
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Informe um valor para compor a matriz na coluna " + (j + 1) + " da linha " + (i + 1) + " => " );
                matriz[i][j] = entrada.nextInt();
    
                if (i == j) { // diagonal
                    soma += matriz[i][j];
                }
            }
        }
        // Imprimindo a matriz
        System.out.println("\nA matriz é :");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
        System.out.print("\nA soma dos valores da diagonal principal da matriz é = " + soma );
    }
} */
/* Exercício 4. Escreva um programa Java que leia uma matriz 5 x 5 e a transforme
numa matriz triangular inferior, atribuindo zero a todos os elementos acima da
diagonal principal. O programa deve apresentar a matriz. 

class Principal {
    public static void main() {
        int matriz[][] = new int[5][5];
        Scanner entrada = new Scanner( System.in );
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || j > i) {
                    matriz[i][j] = 1; // Preenche com 1
                } else {
                    matriz[i][j] = 0; // Preenche os demais elementos com 0
                }
            }
        }
        // Imprimindo a matriz
        System.out.println("\nA matriz é :\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
} */
/* Exercício 5. Escreva um programa Java que leia uma matriz 4 x 3 e escreva a
posição (linha e coluna) do menor valor. 

class Principal {
    public static void main() {
        int matriz[][] = new int[4][3];
        Scanner entrada = new Scanner( System.in );
        int menor = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe um valor para compor a matriz na coluna " + (j + 1) + " da linha " + (i + 1) + " => " );
                matriz[i][j] = entrada.nextInt();
                if (menor > matriz[i][j]) {
                    menor = matriz[i][j]; 
                }
            }
        }    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (menor == matriz[i][j]) {
                    System.out.print("O menor valor é : [" + menor +"] está na posição de coluna " + (j + 1) + " da linha " + (i + 1));
                }
            }
        }
    }
} */
/* * Exercício 6. Escreva um programa Java que leia uma matriz 2 x 4 e um valor X. O
programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a
localização (linha e coluna) ou uma mensagem de “não encontrado”. 

class Principal {
    public static void main() {
        int matriz[][] = new int[2][4];
        int buscar = 0;
        Scanner entrada = new Scanner( System.in );
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe um valor para compor a matriz na coluna " + (j + 1) + " da linha " + (i + 1) + " => " );
                matriz[i][j] = entrada.nextInt();
            }
        }
       
        System.out.print("Informe um valor que deseja buscar na matriz : ");
        buscar = entrada.nextInt();
        
        // Imprimindo a matriz
        System.out.println("\nA matriz é :\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (buscar == matriz[i][j]) {
                    System.out.print("O valor buscado é : " + buscar + " e está na posição de coluna [" + (j + 1) + "] da linha [" + (i + 1) + "]");
                } else {
                    System.out.println("Não Encontrado!");
                }
            }
        }
    }
} */

/* Exercício 7. Escreva um programa Java que leia uma matriz 5 x 2, onde cada
coluna corresponde a um lado de um triângulo retângulo. Declare um vetor de
tamanho 5 no qual cada posição contém a área do respectivo triângulo da matriz. */

/* Exercício 8. Escreva um programa Java que leia duas matrizes 4 x 4 e escreva os
valores da primeira que ocorrem em qualquer posição da segunda. */

/* Exercício 9. Escreva um programa Java que leia uma matriz 2 x 3, gere e escreva a
matriz transposta. A matriz transposta é gerada trocando linha por coluna. Veja o exemplo a seguir:
C = 1 2 3   Ct = 1 4
    4 5 6        2 5
                 3 6 
*/

/* Exercício 11. Escreva um programa Java que possa armazenar as alturas de dez
atletas de cinco delegações que participarão dos jogos de verão. Imprimir a maior
altura de cada delegação. */

/* Exercício 12. Escreva um programa Java que leia uma matriz 12 x 4 com os valores
das vendas de uma loja, em que cada linha represente um mês do ano, e cada
coluna, uma semana do mês. Calcule e imprima:
● Total vendido em cada mês do ano;
● Total vendido em cada semana durante todo o ano;
● Total vendido no ano.
*/

/* Exercício 13. A empresa Evite Desperdício tem registrados numa tabela os
consumos de energia elétrica dos anos 2000-2009. Cada linha representa um ano e
cada coluna representa um mês. Considerando esses dados, fazer um programa
Java que imprima:
● O consumo médio em cada um dos meses destes dez anos;
● O mês/ano em que a empresa gastou mais energia nestes dez anos.
*/

/* Exercício 14. Uma certa fábrica produziu dois tipos de motores M1 e M2 nos
meses de janeiro a dezembro. O número de motores foi registrado na Tabela 1.
O setor de controle de vendas tem uma tabela de custo e do lucro obtidos com cada
motor conforme Tabela 2. 
Faça um programa Java que leia a produção mensal, custo e lucro dos motores M1 e
M2, calcule e mostre o custo e o lucro em cada um dos meses e o lucro anual */

// { Lista - Classes e Objetos - Algoritmos e Programação - 19.06.24 } 90% -------------------------------------------------------------

/*  Exemplo de Orientação a Objeto 1 

class Principal{
    public static void main(){
        Cachorro meuDogao = new Cachorro( );
        meuDogao.nome = "Teobaldo";
        meuDogao.cor = "cinza";
        meuDogao.idade = 4;
        meuDogao.sexo = 'M';
    }
    public static class Cachorro{
        public String nome;
        public String cor;
        public int idade;
        public char sexo;
    }
}
*/   

/* 1. Faça um algoritmo que crie uma classe interna referente a um cliente contendo os atributos 
nome (string), cpf (string), idade (número inteiro), endereço (string) e estado civil (caractere). 
Em seguida, crie um objeto dessa classe com os seguintes atributos:
- nome “Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco
Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga”
- cpf “000.000.000-00”
- idade 5
- endereço “Paço de São Cristóvão número 1 - Rio de Janeiro - RJ”
- estado civil ‘S’ 

class Principal{
    public static void main(){
        Cliente cliente1 = new Cliente( );
        cliente1.nome = "Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco\r\n" + //
                        "Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga";
        cliente1.cpf = "000.000.000-00";
        cliente1.idade = 5;
        cliente1.endereco = "Paço de São Cristóvão número 1 - Rio de Janeiro - RJ";
        cliente1.estado_civil = 'S';
    }
    public static class Cliente{
        public String nome;
        public String cpf;
        public int idade;
        public String endereco;
        public char estado_civil;
    }
} */
/* 2. Faça um algoritmo que crie uma classe interna referente a um animal contendo
os atributos espécie, nome científico e peso médio. Em seguida, crie quatro objetos
dessa classe com os seguintes atributos:
- objeto 1: peixe-bolha, psychrolutes marcidus, 0.6 kg
- objeto 2: ornitorrinco, ornithorhynchus anatinus, 1.25 kg
- objeto 3: toupeira-nariz-de-estrela, condylura cristata, 0.3 kg
- objeto 4: uacari-branco, cacajao calvus, 3.1 kg

class Principal{
    public static void main(){
        Animal a1 = new Animal( );
        a1.especie = "peixe-bolha";
        a1.nome_cientifico = "psychrolutes marcidus";
        a1.peso_medio = 0.6;

        Animal a2 = new Animal( );
        a2.especie = "ornitorrinco";
        a2.nome_cientifico = "ornithorhynchus anatinus";
        a2.peso_medio = 1.25;

        Animal a3 = new Animal( );
        a3.especie = "toupeira-nariz-de-estrela";
        a3.nome_cientifico = "condylura cristata";
        a3.peso_medio = 0.3;

        Animal a4 = new Animal( );
        a4.especie = "uacari-branco";
        a4.nome_cientifico = "cacajao calvus";
        a4.peso_medio = 3.1;
    }

    public static class Animal{
        public String especie;
        public String nome_cientifico;
        public double peso_medio;
    }
} */
/* 3. Faça um algoritmo que crie uma classe interna referente a vilões de histórias
em quadrinhos contendo os atributos nome (string), inimigo (string) e superpoderes
(vetor de strings). Em seguida, crie três objetos dessa classe com os seguintes
atributos:
- inimigo 1: “Professor Gavião”, “Professor Pardal”, {“inventar coisas medíocres”}
- inimigo 2: “João Bafo de Onça”, “Pato Donald”, {}
- inimigo 3: “Maga Patalójika”, “Tio Patinhas”, {“teleportar-se”, “voar na vassoura
mágica”, “criar e transmutar matéria”, “gerar correntes elétricas”, “transformar-se em
qualquer criatura”}

class Principal{
    public static void main(){
        Viloes inimigo1 = new Viloes( );
        inimigo1.nome = "Professor Gavião";
        inimigo1.inimigo = "Professor Pardal";
        inimigo1.superpoderes[0] = "inventar coisas medíocres" ;
        
        Viloes inimigo2 = new Viloes( );
        inimigo2.nome = "João Bafo de Onça";
        inimigo2.inimigo = "Pato Donald";
        inimigo2.superpoderes[1] = "" ;

        Viloes inimigo3 = new Viloes( );
        inimigo3.nome = "Maga Patalójika";
        inimigo3.inimigo = "Tio Patinhas";
        inimigo3.superpoderes[2] = "teleportar-se”, “voar na vassoura mágica”, “criar e transmutar matéria\\r\\n" + //
        "gerar correntes elétricas”, “transformar-se em qualquer criatura" ;
    }
    public static class Viloes{
        public String nome;
        public String inimigo;
        public String superpoderes[] = new String[3];
    }
} */
/* 4. Faça um algoritmo crie uma classe interna referente a livros contendo 
título (string), quantidade de páginas (número inteiro) e autor (string). 
Em seguida, crie quatro objetos cujos atributos serão individualmente informados pelo usuário 
(ou mostre os dados informados pelo usuário para cada objeto). 

class Principal{
    public static void main(){
        Scanner entrada = new Scanner(System.in);

        Livro l1 = new Livro( );
        System.out.print("Informe o Título do Livro 1 : ");
        l1.titulo = entrada.nextLine();
        System.out.print("Informe a quantidade de páginas do Livro 1 : ");
        l1.qpag = entrada.nextInt();
        System.out.print("Informe o autor do Livro 1 : ");
        l1.autor = entrada.nextLine();

        Livro l2 = new Livro( );
        System.out.print("Informe o Título do Livro 2 : ");
        l2.titulo = entrada.nextLine();
        System.out.print("Informe a quantidade de páginas do Livro 2 : ");
        l2.qpag = entrada.nextInt();
        System.out.print("Informe o autor do Livro 2 : ");
        l2.autor = entrada.nextLine();

        Livro l3 = new Livro( );
        System.out.print("Informe o Título do Livro 3 : ");
        l3.titulo = entrada.nextLine();
        System.out.print("Informe a quantidade de páginas do Livro 3 : ");
        l3.qpag = entrada.nextInt();
        System.out.print("Informe o autor do Livro 3 : ");
        l3.autor = entrada.nextLine();
    }

    public static class Livro{
        public String titulo;
        public int qpag;
        public String autor;
    }
} */
/* * 5. Faça um algoritmo que crie uma classe interna referente a monstros famosos contendo 
nome (string) e origem (string). Em seguida, o usuário deve indicar a quantidade de monstros que deseja cadastrar. 
Você deve criar aquela quantidade de objetos e seus atributos serão individualmente informados pelo usuário 
(ou seja, o usuário vai informar o nome e a origem para cada monstro). 
Finalmente, mostre os dados informados pelo usuário para cada monstro.  

class Principal{
    public static void main(){
        Scanner entrada = new Scanner( System.in );
        System.out.print("Informe a quantidade de monstros que deseja cadastrar : ");
        int quant = entrada.nextInt();
 
        // int Monstro[] = new int[2];

        //for (int i = 1; i <= quant; i++) {
        int i = 1;
        do {
            Monstro famoso = new Monstro( ); // REVISAR
            System.out.print("Informe o nome do monstro " + i + " : ");
            famoso.nome = entrada.nextLine();
            System.out.println(" ");
            System.out.print("Informe a origem do monstro " + i + " : ");
            famoso.origem = entrada.nextLine();
            i++;
        } while( i <= quant);
        //}
    }
    public static class Monstro{
        public String nome;
        public String origem;
    }
} */

// { Lista - Sub-rotinas - Algoritmos e Programação - 20.06.24 }  -------------------------------------------------------------

// Exemplo 1
// class Principal {
//     public static void main( ){
//         double saldo, rendimento;
//         Scanner entrada = new Scanner( System.in );
//         System.out.println("Por favor, digite seu saldo");
//         saldo = entrada.nextDouble( );
//         rendimento = Principal.calcularRendimento(saldo);
//         System.out.println("Rendimento anual de "+rendimento);
//     }
//     public static double calcularRendimento( double saldo ){
//         double acumulado, rendimento;
//         acumulado = saldo;
//         for( int i = 1; i <= 12; i++ ){
//         acumulado = acumulado + acumulado * 0.001575;
//     }
//     rendimento = acumulado - saldo;
//     return rendimento;
//     }
// }

/* 1. Faça um programa em Java que invoque uma sub-rotina (método) de saudação
chamada “darBoasVindas”. Em seguida, crie a sub-rotina indicada que não tem
parâmetros e não tem retorno. Essa sub-rotina deve apenas mostrar uma mensagem
de saudação (da sua escolha) para o usuário. */

/* 2. Faça um programa em Java que recebe do usuário um número inteiro relativo a
uma quantidade de tempo em segundos e que invoque uma sub-rotina chamada
“paraMinutos”. Em seguida, crie a sub-rotina indicada que tem como parâmetro o
número inteiro fornecido pelo usuário e que não tem retorno. Essa sub-rotina deve
converter aquela quantidade de segundos em minutos e mostrar esse resultado ao
usuário, ignorando valores quebrados. Por exemplo, se o usuário entrar com o valor
de “123” segundos, o programa deve mostrar apenas “2 minutos”. */

/* 3. Adapte o programa anterior para que o método “paraMinutos” retorne o valor
resultante da conversão para o método “main” e mostre esse resultado ao usuário
(dentro do método main). */

/* 4. Faça um programa em Java que recebe do usuário quatro números inteiros
relativos a uma quantidade de tempo em dias, horas, minutos e segundos, e que
invoque uma sub-rotina chamada “paraSegundos”. Em seguida, crie a sub-rotina
indicada que tem como parâmetros os quatro números inteiros fornecidos pelo
usuário e que não tem retorno. Essa sub-rotina deve converter aquela quantidade de
dias, horas, minutos e segundos em segundos e mostrar esse resultado ao usuário,
ignorando valores quebrados. Por exemplo: se o usuário entrar com os valores de 0
dias, 12 horas, 15 minutos e 2 segundos, o programa deve mostrar apenas “44102
segundos”. */

/* 5. Faça um programa em Java que receba do usuário uma palavra e invoque uma
sub-rotina chamada “informarTerceiraLetra”. Em seguida, crie a sub-rotina indicada
que tem como parâmetro a String fornecida pelo usuário e que não tem retorno. Essa
sub-rotina deve mostrar qual é a terceira letra da palavra digitada pelo usuário ou
mostrar uma mensagem de erro se a palavra informada tiver menos que três letras.
OBS.: lembre-se dos métodos length( ) e charAt( X ) dos objetos String do Java para
ajudar a resolver esse problema. */

/* 6. Faça um programa em Java que receba do usuário um número inteiro e invoque
uma sub-rotina chamada “ehNegativo”. Em seguida, crie a sub-rotina indicada que
tem como parâmetro o número inteiro fornecido pelo usuário e que retorne um valor
lógico. Essa sub-rotina deve retornar true se o número recebido como parâmetro for
negativo, ou false se o número recebido for positivo ou zero. */

/* 7. Faça um programa em Java que receba do usuário três números inteiros e
invoque uma sub-rotina chamada “maior”. Em seguida, crie a sub-rotina indicada que
tem como parâmetros os três números inteiros fornecidos pelo usuário e que retorne
um número inteiro. Essa sub-rotina deve retornar o maior dos números passados
como parâmetros. Por exemplo: se os parâmetros forem −1, 7 e 3, o programa deve
retornar 3. */

/* 8. Faça um programa em Java que receba do usuário dois números inteiros e
invoque uma sub-rotina chamada “calcularSomatorio”. Em seguida, crie a sub-rotina
indicada que possui dois parâmetros (os números inteiros) e que retorne um número
inteiro. Essa sub-rotina deve calcular a soma de todos os números inteiros existentes
entre os números passados como parâmetro e retornar o resultado dessa soma.
Por exemplo: se os parâmetros forem 2 e 6, a sub-rotina deve calcular 2+3+4+5+6 e
retornar 20 */

