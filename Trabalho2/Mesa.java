package Trabalho2;

public class Mesa {
    
    // public char[][] tabuleiro = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
    private int qntLinhas = 0;
    private int qntColunas = 0;
    private char textura = ' ';
    public char[][] tabuleiro;

    public  Mesa(int qntLinhasInstancia, int qntColunasInstancia, char texturaInstancia){
        this.qntLinhas = qntLinhasInstancia;
        this.qntColunas = qntColunasInstancia;
        this.textura = texturaInstancia;
        this.tabuleiro = new char[this.qntLinhas][this.qntColunas];
    }

    public void populaTabuleiro(){
        for (int i = 0; i < qntLinhas; i++) {
            for (int j = 0; j < qntColunas; j++) {
                this.tabuleiro[i][j] = this.textura;
            }
        }
    }

    public String moverEsquerda() {
        char[][] tempTabuleiro = new char[this.qntLinhas][this.qntColunas];
        for (int i = 0; i < this.qntLinhas; i++) {
            int linAux = i;
            for (int j = 0; j < this.qntColunas; j++) {
                int colAux = j + 1;
                if (colAux > this.qntColunas - 1) {
                    colAux = 0;
                }
                tempTabuleiro[i][j] = this.tabuleiro[linAux][colAux];
            }
        }
        this.tabuleiro = tempTabuleiro;
        return "Deslocado para a esquerda";
    }

    public String moverDireita() {
        char[][] tempTabuleiro = new char[this.qntLinhas][this.qntColunas];
        for (int i = 0; i < this.qntLinhas; i++) {
            int linAux = i;
            for (int j = 0; j < this.qntColunas; j++) {
                int colAux = j - 1;
                if (colAux < 0) {
                    colAux = this.qntColunas -1;
                }
                tempTabuleiro[i][j] = this.tabuleiro[linAux][colAux];
            }
        }
        this.tabuleiro = tempTabuleiro;
        return "Deslocado para a direita";
    }

    public String moverCima() {
        char[][] tempTabuleiro = new char[this.qntLinhas][this.qntColunas];
        for (int i = 0; i < this.qntLinhas; i++) {
            int linAux = i + 1;
            if (linAux > this.qntLinhas -1) {
                linAux = 0;
            }
            for (int j = 0; j < this.qntColunas; j++) {
                int colAux = j;
                tempTabuleiro[i][j] = this.tabuleiro[linAux][colAux];
            }
        }
        this.tabuleiro = tempTabuleiro;
        return "Deslocado para cima";
    }

    public String moverBaixo() {
        char[][] tempTabuleiro = new char[this.qntLinhas][this.qntColunas];
        for (int i = 0; i < this.qntLinhas; i++) {
            int linAux = i - 1;
            if (linAux < 0) {
                linAux = this.qntLinhas - 1;
            }
            for (int j = 0; j < this.qntColunas; j++) {
                int colAux = j;
                tempTabuleiro[i][j] = this.tabuleiro[linAux][colAux];
            }
        }
        this.tabuleiro = tempTabuleiro;
        return "Deslocado para baixo";
    }

    public String mover(String direcao) {
        System.out.println(direcao);
        if (direcao.compareToIgnoreCase("C") == 0){
            return this.moverCima();
        } else if (direcao.compareToIgnoreCase("D") == 0) {
            return this.moverDireita();
        }else if (direcao.compareToIgnoreCase("B") == 0) {
            return this.moverBaixo();
        } else if (direcao.compareToIgnoreCase("E") == 0) {
            return this.moverEsquerda();
        } else {
            return  "";
        }  
    }

    public String marcarTabuleiro(Jogador j, int linha, int coluna) {
        if (linha > 0 && coluna > 0 && linha <= this.qntLinhas && coluna <= this.qntColunas) {
            this.tabuleiro[linha - 1][coluna - 1] = j.getSigla();
            return "O jogador :" + j.getNome() + " marcou na casa L:" + linha + " C:" + coluna;
        } else {
            return "Posição invalida !";
        }
    }

    public void moverTabuleiro(String direcao) {
        if (direcao.toLowerCase().equals("d")) {
            this.moverDireita();
        } else if (direcao.toLowerCase().equals("b")) {
            this.moverBaixo();
        } else if (direcao.toLowerCase().equals("e")) {
            this.moverEsquerda();
        } else if (direcao.toLowerCase().equals("c")) {
            this.moverCima();
        } else {

        }
    }

    public void imprimirTabuleiroTeste() {
        for (int i = 0; i < this.qntLinhas; i++) {

            for (int j = 0; j < this.qntColunas; j++) {
                System.out.print(this.tabuleiro[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }


    public String getStringTabuleiro(){
        String res = "";
        for (int i = 0; i < this.qntLinhas; i++) {

            for (int j = 0; j < this.qntColunas; j++) {
                res += (this.tabuleiro[i][j] + "\t");
            }
            res += ("\n\n");
        }
        System.out.println(this.tabuleiro.length);
        return res;
    }


}