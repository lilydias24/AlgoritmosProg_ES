import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("Botão Fujão");
     //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(800, 300);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     //panel.setBackground(Color.decode(0,255,153));

     JButton element2 = new JButton("Enviar");
     element2.setBounds(158, 186, 58, 26);
     element2.setBackground(Color.decode("#2e2e2e"));
     element2.setForeground(Color.decode("#D9D9D9"));
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element2.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element2.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element2, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element2);

     // caixa senha
     JPasswordField element3 = new JPasswordField("");
     element3.setBounds(145, 137, 106, 21);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
     element3.setBackground(Color.decode("#B2B2B2"));
     element3.setForeground(Color.decode("#656565"));
     element3.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element3, "Informe o motivo", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element3);

     // caixa login
     JTextField element4 = new JTextField("");
     element4.setBounds(144, 95, 106, 21);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
     element4.setBackground(Color.decode("#B2B2B2"));
     element4.setForeground(Color.decode("#656565"));
     element4.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element4, "(Escreva SIM se você leu)", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element4);

     // texto login
     JLabel element5 = new JLabel("");
     element5.setBounds(81, 95, 42, 23);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 15));
     element5.setForeground(Color.decode("#D8BFD8"));
     panel.add(element5);

     // texto senha
     JLabel element6 = new JLabel("Motivo do Descadastramento");
     element6.setBounds(83, 138, 106, 17);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 15));
     element6.setForeground(Color.decode("#D8BFD8"));
     panel.add(element6);

     frame.add(panel);
     frame.setVisible(true);

  }
}