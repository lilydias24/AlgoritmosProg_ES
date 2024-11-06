package interfaces;

import java.util.jar.JarEntry;
import javax.swing.*;
import java.awt.Color;

public class Janela extends JFrame {
    private JPanel painel;

    public Janela() {
        super();
        configurarJanela();
        configurarComponentes();
        repaint();
    }

    private void configurarComponentes(){
        this.painel = new JPanel();
        this.painel.setSize(400, 400);
        this.painel.setBackground(Color.blue);
        this.painel.setLayout(null);
        this.painel.setVisible(true);
        this.add( this.painel ); // tudo que quiser colocar no container tem q add lá
    }

    private void configurarJanela() {
        getContentPane().setBackground(new Color(100, 150, 100)); // pra definir a cor da janela
        setTitle("Programa de POO"); // pra nomear a janela
        setLocation(150, 150); // pra definir a localização da janela na tela
        setSize(500, 500); // pra definir o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // pra encerrar a execução
        setLayout(null); // pra desengessar o layout
        setVisible(true); // pra exibir na tela
    }
}
