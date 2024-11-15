import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class BotaoFujao extends JFrame {

    private JPanel painelPrincipal;
    private JLabel telefoneDescadastro, motivoDescadastramento, consequenciaDescadastramento;
    private JComboBox<String>[] comboTelefoneDigitos;
    private JPasswordField campoMotivoDescadastramento;
    private JTextField campoConsequenciaDescadastramento;
    private JButton btnDescadastrar, btnCancelar;

    public BotaoFujao() {
        configurarJanela();
        inicializarComponentes();
    }

    private void configurarJanela() {
        setTitle("Botão Fujão - Interface");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 300);
        setResizable(false);
    }

    private void inicializarComponentes() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBackground(new Color(0, 255, 153));

        adicionarCampoTelefone();
        adicionarCampoMotivo();
        adicionarDescricao();
        adicionarBotoes();

        add(painelPrincipal);
    }

    private void adicionarCampoTelefone() {
        telefoneDescadastro = new JLabel("Telefone para descadastrar:");
        telefoneDescadastro.setBounds(30, 50, 400, 20);
        painelPrincipal.add(telefoneDescadastro);

        comboTelefoneDigitos = new JComboBox[10];
        for (int i = 0; i < comboTelefoneDigitos.length; i++) {
            comboTelefoneDigitos[i] = new JComboBox<>(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
            comboTelefoneDigitos[i].setBounds(200 + (i * 50), 50, 46, 20);
            painelPrincipal.add(comboTelefoneDigitos[i]);
        }
    }

    private void adicionarCampoMotivo() {
        motivoDescadastramento = new JLabel("Motivo do descadastramento:  ");
        motivoDescadastramento.setBounds(30, 90, 200, 20);
        painelPrincipal.add(motivoDescadastramento);

        campoMotivoDescadastramento = new JPasswordField();
        campoMotivoDescadastramento.setBounds(220, 90, 200, 20);
        campoMotivoDescadastramento.setFont(new Font("Lato", Font.PLAIN, 16));
        painelPrincipal.add(campoMotivoDescadastramento);
    }

    private void adicionarDescricao() {
        consequenciaDescadastramento = new JLabel("Li as consequências do descadastramento:  ");
        consequenciaDescadastramento.setBounds(30, 130, 280, 20);
        painelPrincipal.add(consequenciaDescadastramento);

        campoConsequenciaDescadastramento = new JTextField();
        campoConsequenciaDescadastramento.setBounds(300, 130, 75, 20);
        campoConsequenciaDescadastramento.setFont(new Font("Lato", Font.PLAIN, 14));
        painelPrincipal.add(campoConsequenciaDescadastramento);
    }

    private void adicionarBotoes() {
        btnDescadastrar = new JButton("Descadastrar");
        btnDescadastrar.setBounds(210, 170, 150, 30);
        btnDescadastrar.setBackground(Color.decode("#FFFFFF"));
        btnDescadastrar.setFocusPainted(false);
        btnDescadastrar.setFont(new Font("Lato", Font.BOLD, 14));
        painelPrincipal.add(btnDescadastrar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(370, 170, 150, 30);
        btnCancelar.setBackground(Color.decode("#FFFFFF"));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setFont(new Font("Lato", Font.BOLD, 14));
        painelPrincipal.add(btnCancelar);
    }

    private void moveButton(java.awt.event.MouseEvent evt) {
        Random random = new Random();
        int x = random.nextInt(700);
        int y = random.nextInt(200);
        descadButton.setLocation(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BotaoFujao().setVisible(true);
        });
    }
}
