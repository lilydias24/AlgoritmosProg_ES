package Trabalho2;

public class Main {
  

    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();

        j1.setSigla("Douglas",'D');
        j2.setSigla("Gervasio",'G');

        Mesa mesa = new Mesa(4,4, '■');
        mesa.populaTabuleiro();
        System.out.println(mesa.marcarTabuleiro(j1, 2, 2));
        System.out.println(mesa.marcarTabuleiro(j2, 3, 3));

        System.out.println(mesa.mover("B"));
        // System.out.println(m.mover("B"));
        // System.out.println(m.mover("B"));
        System.out.println(mesa.getStringTabuleiro());
    }
}
