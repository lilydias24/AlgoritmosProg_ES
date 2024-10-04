package Atividades;
//import java.util.Scanner;

/* Crie um programa em Java que implemente duas classes: Carro e Estacionamento.

A classe Carro contém a marca do carro, o modelo, a cor e a placa (todos os campos são Strings).

A classe Estacionamento contém o endereço (uma String), um CEP (um número inteiro bem grande) 
e pode conter até 50 carros.

Depois de criadas essas classes, crie uma classe Principal que instancie os seguintes carros 
e os guarde no estacionamento localizado na Rua Avestruz, CEP 90001007:

1) Hyundai HB20 preto, placa BEE4F00
2) Chevrolet Onix cinza, placa FUN2M33
3) Ford Ka vermelho, placa GEZ0W35  */

public class ativ02 {
    public static void main(String[] args){
        Carro carro1 = new Carro("Hyundai", "HB20", "Preto", "BEE4F00");
        Carro carro2 = new Carro("Chevrolet", "Onix", "Cinza", "FUN2M33");
        Carro carro3 = new Carro("Ford", "Ka", "Vermelho", "GEZ0W35");

        Estacionamento estac1 = new Estacionamento("Rua Avestruz", 90001007);

        estac1.adicionar(carro1);
        estac1.adicionar(carro2);
        estac1.adicionar(carro3);

        estac1.mostrarCarros();
    }
}

class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    // Construtor
    public Carro(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + cor + ", Placa: " + placa;
    }
}

class Estacionamento {
    private String endereco;
    private long cep;
    private Carro[] carros;
    private int quantCarros;

    // Construtor
    public Estacionamento(String endereco, long cep) {
        this.endereco = endereco;
        this.cep = cep;
        this.carros = new Carro[50];
        this.quantCarros = 0;
    }

    /*
     * Adiciona um carro no final do vetor de carros se não estiver cheio.
     *
     * @param   carro   o carro que precisa ser adicionado no estacionamento
     * @return   true se o carro foi colocado com sucesso no final do vetor ou
     *                  false se não houver mais espaço no vetor (estacionamento cheio)
     */
    public boolean adicionar(Carro carro) {
        if (quantCarros < carros.length) {
            carros[quantCarros] = carro;
            quantCarros++;
            return true;
        } else {
            System.out.println("O estacionamento está cheio!");
            return false;
        }
    }

    public void mostrarCarros() {
        System.out.println("Carros estacionados em " + endereco + ", CEP: " + cep + ":");
        for (int i = 0; i < quantCarros; i++) {
            System.out.println(carros[i]);
        }
    }
}
