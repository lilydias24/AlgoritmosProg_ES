import java.util.Random;
import javax.swing.*;

public class Principal extends JFrame {

    private JPanel panel;
    private JLabel telefoneLabel, motivoLabel, descadLabel;
    private JComboBox<String>[] telefoneCombos;
    private JPasswordField motivoField;
    private JTextField descadField;
    private JButton descadButton, cancelButton;

    public Principal() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 300);
        setResizable(false);        

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new java.awt.Color(0, 255, 153));

        // Label e Comboboxes para o telefone
        telefoneLabel = new JLabel("Telefone para cadastrar:");
        telefoneLabel.setBounds(30, 50, 150, 20);
        panel.add(telefoneLabel);

        telefoneCombos = new JComboBox[10];
        for (int i = 0; i < telefoneCombos.length; i++) {
            telefoneCombos[i] = new JComboBox<>(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
            telefoneCombos[i].setBounds(180 + (i * 50), 50, 46, 20);
            panel.add(telefoneCombos[i]);
        }

        // Label e campo para o motivo
        motivoLabel = new JLabel("Motivo do descadastramento:");
        motivoLabel.setBounds(30, 90, 200, 20);
        panel.add(motivoLabel);

        motivoField = new JPasswordField();
        motivoField.setBounds(210, 90, 200, 20);
        panel.add(motivoField);

        // Label e campo para descadastramento
        descadLabel = new JLabel("Li as consequências do descadastramento:");
        descadLabel.setBounds(30, 130, 250, 20);
        panel.add(descadLabel);

        descadField = new JTextField();
        descadField.setBounds(285, 130, 50, 20);
        panel.add(descadField);

        JLabel instrucaoLabel = new JLabel("(escreva (SIM) se você leu)");
        instrucaoLabel.setBounds(340, 130, 180, 20);
        panel.add(instrucaoLabel);

        // Botões
        descadButton = new JButton("Descadastrar");
        descadButton.setBounds(200, 180, 120, 30);
        descadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moveButton(evt);
            }
        });
        descadButton.addActionListener(evt -> JOptionPane.showMessageDialog(null, "COM TAB É FÁCIL"));
        panel.add(descadButton);

        cancelButton = new JButton("Cancelar");
        cancelButton.setBounds(340, 180, 120, 30);
        cancelButton.addActionListener(evt -> dispose());
        panel.add(cancelButton);

        add(panel);
    }

    private void moveButton(java.awt.event.MouseEvent evt) {
        Random random = new Random();
        int x = random.nextInt(700);
        int y = random.nextInt(200);
        descadButton.setLocation(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Principal().setVisible(true));
    }
}
