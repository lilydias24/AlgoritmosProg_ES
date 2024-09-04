package Trabalho2;

public class Jogador {
    private char sigla;
    private String nome;


    public void setSigla(String nome,char sigla){
        this.nome = nome;
        this.sigla = sigla;

    }

    public char getSigla() {
        return this.sigla;
    }

    public String getNome() {
        return this.nome;
    }
}
