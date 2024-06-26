package Trabalho2;

public class Mesa {
    public char[][] tabuleiro= {{'-','-','-'},{'-','-','-'},{'-','-','-'}};

    public void moverEsquerda(){
        
    }

    public void moverDireita(){
        
    }

    public void moverCima(){
        
    }

    public void moverBaixo(){
        
    }

    public void marcarTabuleiro(Jogador j, int linha, int coluna){
       if (linha > 0 && coluna > 0 && linha <= 3 && coluna <= 3) {
        this.tabuleiro[linha -1][coluna -1] = j.getSigla();
       }
    }
 
    public void moverTabuleiro(String direcao){
        if (direcao.toLowerCase().equals("d")) {
            this.moverDireita();
        } else if (direcao.toLowerCase().equals("b")) {
            this.moverBaixo();
        }else if (direcao.toLowerCase().equals("e")){
            this.moverEsquerda();
        } else if (direcao.toLowerCase().equals("c")){
            this.moverCima();
        }else {

        }
    }

    public void imprimirTabuleiro(){
    for (int i = 0; i < 3; i++) {
       
        for (int j = 0; j < 3; j++) {
            System.out.print(this.tabuleiro[i][j]+"\t");
        }
        System.out.println();
        System.out.println();
    }
    }


}
