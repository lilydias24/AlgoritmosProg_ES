package Trabalho2;

public class Main {
  

    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();

        j1.setSigla('M');
        j2.setSigla('B');

        Mesa m = new Mesa();

        m.marcarTabuleiro(j1, 1, 2);
        m.marcarTabuleiro(j2, 3, 3);


        m.imprimirTabuleiro();
    }
}
