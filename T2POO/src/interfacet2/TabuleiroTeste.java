package interfacet2;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author emilly
 */
public class TabuleiroTeste extends javax.swing.JFrame {

    private boolean turnoPrea; // true: turno da Preá, false: turno dos Estudantes
    private int[] pecaSelecionada = null; // {linha, coluna} da peça selecionada
    private JButton[][] botoesTabuleiro;
    private String[][] tabuleiro;
    private int linhaAtualPrea; // Linha atual da Preá
    private int colunaAtualPrea; // Coluna atual da Preá

    private void inicializarTabuleiroLogico() {
        tabuleiro = new String[3][5];

        // Configuração inicial
        tabuleiro[0][1] = "Estudante"; // Estudante 1
        tabuleiro[1][0] = "Estudante"; // Estudante 2
        tabuleiro[2][1] = "Estudante"; // Estudante 3
        tabuleiro[1][4] = "Preá"; // Preá

        linhaAtualPrea = 1; // Linha inicial da Preá
        colunaAtualPrea = 4; // Coluna inicial da Preá
    }

    public TabuleiroTeste() {
        initComponents();
        turnoPrea = false; // Começa com os Estudantes
        inicializarTabuleiro(); // Inicializa os botões no tabuleiro
        configurarAcoesDosBotoes(); // Adiciona ações para cliques
        inicializarTabuleiroLogico();
    }

    private void inicializarTabuleiro() {
        botoesTabuleiro = new JButton[3][5];

        botoesTabuleiro[0][0] = C1; // Associando o botão C1 à posição [0][0]
        botoesTabuleiro[0][1] = C2;
        botoesTabuleiro[0][2] = C3;
        botoesTabuleiro[0][3] = C4;
        botoesTabuleiro[0][4] = C5;

        botoesTabuleiro[1][0] = C6;
        botoesTabuleiro[1][1] = C7;
        botoesTabuleiro[1][2] = C8;
        botoesTabuleiro[1][3] = C9;
        botoesTabuleiro[1][4] = C10;

        botoesTabuleiro[2][0] = C11;
        botoesTabuleiro[2][1] = C12;
        botoesTabuleiro[2][2] = C13;
        botoesTabuleiro[2][3] = C14;
        botoesTabuleiro[2][4] = C15;
    }

    private void alternarTurno() {
        turnoPrea = !turnoPrea; // Alterna o turno
        atualizarIndicadorDeTurno(); // Atualiza a interface gráfica (opcional)

        if (turnoPrea) {
            System.out.println("Turno: Preá");
        } else {
            System.out.println("Turno: Estudantes");
        }
    }

    private void configurarAcoesDosBotoes() {
        for (int i = 0; i < botoesTabuleiro.length; i++) {
            for (int j = 0; j < botoesTabuleiro[i].length; j++) {
                int linha = i; // Necessário para uso dentro da lambda
                int coluna = j;
    
                botoesTabuleiro[i][j].addActionListener(evt -> {
                    if (turnoPrea) {
                        moverPeca(linha, coluna);
                    } else {
                        selecionarPeca(linha, coluna);
                    }
                });
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Tabuleiro = new javax.swing.JPanel();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        C11 = new javax.swing.JButton();
        C12 = new javax.swing.JButton();
        C13 = new javax.swing.JButton();
        C14 = new javax.swing.JButton();
        C15 = new javax.swing.JButton();
        RU = new javax.swing.JPanel();
        Porta = new javax.swing.JPanel();
        textRestaurante = new java.awt.Label();
        textUniversitario = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        labelTurno = new javax.swing.JLabel("Turno: Estudantes");
        // jPanel1.add(labelTurno);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrabalhoII POO");
        setBackground(new java.awt.Color(151, 197, 182));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        Tabuleiro.setBackground(new java.awt.Color(151, 197, 182));
        Tabuleiro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204),
                new java.awt.Color(0, 153, 153)));
        Tabuleiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        C1.setBackground(new java.awt.Color(153, 153, 153));
        C1.setBorderPainted(false);
        C1.setFocusPainted(false);
        C1.setFocusable(false);
        C1.setRequestFocusEnabled(false);
        C1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                C1StateChanged(evt);
            }
        });

        C2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacet2/studentIcon.png"))); // NOI18N
        C2.setToolTipText("");
        C2.setBorderPainted(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(204, 255, 255));
        C3.setBorderPainted(false);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setBorderPainted(false);
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(153, 153, 153));
        C5.setBorderPainted(false);
        C5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C5.setFocusPainted(false);
        C5.setFocusable(false);
        C5.setRequestFocusEnabled(false);
        C5.setVerifyInputWhenFocusTarget(false);
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacet2/studentIcon.png"))); // NOI18N
        C6.setBorderPainted(false);
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setBackground(new java.awt.Color(204, 255, 255));
        C7.setBorderPainted(false);
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setBorderPainted(false);
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(204, 255, 255));
        C9.setBorderPainted(false);
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacet2/preaIcon.png"))); // NOI18N
        C10.setBorderPainted(false);
        C10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        C11.setBackground(new java.awt.Color(153, 153, 153));
        C11.setBorderPainted(false);
        C11.setFocusPainted(false);
        C11.setFocusable(false);
        C11.setRequestFocusEnabled(false);
        C11.setVerifyInputWhenFocusTarget(false);

        C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacet2/studentIcon.png"))); // NOI18N
        C12.setBorderPainted(false);
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        C13.setBackground(new java.awt.Color(204, 255, 255));
        C13.setBorderPainted(false);
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });

        C14.setBorderPainted(false);
        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });

        C15.setBackground(new java.awt.Color(153, 153, 153));
        C15.setBorderPainted(false);
        C15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C15.setFocusPainted(false);
        C15.setFocusable(false);
        C15.setRequestFocusEnabled(false);
        C15.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout TabuleiroLayout = new javax.swing.GroupLayout(Tabuleiro);
        Tabuleiro.setLayout(TabuleiroLayout);
        TabuleiroLayout.setHorizontalGroup(
                TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TabuleiroLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C11, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(C6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C12, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C7, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C13, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(C8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C14, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(C4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabuleiroLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(C10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(C15, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(80, 80, 80)));
        TabuleiroLayout.setVerticalGroup(
                TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabuleiroLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(
                                        TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(C2, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(C5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(C4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(C1, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C8, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                TabuleiroLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(C6, javax.swing.GroupLayout.DEFAULT_SIZE, 125,
                                                                Short.MAX_VALUE)
                                                        .addComponent(C7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(C9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabuleiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C15, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C11, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C12, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(C13, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C14, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)));

        RU.setBackground(new java.awt.Color(181, 230, 184));
        RU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        Porta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PortaLayout = new javax.swing.GroupLayout(Porta);
        Porta.setLayout(PortaLayout);
        PortaLayout.setHorizontalGroup(
                PortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 18, Short.MAX_VALUE));
        PortaLayout.setVerticalGroup(
                PortaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 226, Short.MAX_VALUE));

        textRestaurante.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        textRestaurante.setText("Universitário");

        textUniversitario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        textUniversitario.setText("Restaurante");

        javax.swing.GroupLayout RULayout = new javax.swing.GroupLayout(RU);
        RU.setLayout(RULayout);
        RULayout.setHorizontalGroup(
                RULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RULayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textUniversitario, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Porta, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        RULayout.setVerticalGroup(
                RULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RULayout.createSequentialGroup()
                                .addGroup(RULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RULayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(textUniversitario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(RULayout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(Porta, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jMenuBar1.setBackground(new java.awt.Color(151, 197, 182));

        jMenu1.setText("Jogo");

        jMenuItem1.setText("Reiniciar");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Autoria");

        jMenu3.setText("Ver Nomes");
        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(RU, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Tabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RU, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        setSize(new java.awt.Dimension(966, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void atualizarIndicadorDeTurno() {
        if (turnoPrea) {
            labelTurno.setText("Turno: Preá");
        } else {
            labelTurno.setText("Turno: Estudantes");
        }
    }

    private boolean validarMovimentoPrea(int novaLinha, int novaColuna) {
        // Verifica se o espaço é adjacente
        if (Math.abs(novaLinha - linhaAtualPrea) <= 1 && Math.abs(novaColuna - colunaAtualPrea) <= 1) {
            // Verifica se o espaço está vazio
            return tabuleiro[novaLinha][novaColuna] == null;
        }
        return false;
    }

    private boolean validarMovimentoEstudante(int linhaAtual, int colunaAtual, int novaLinha, int novaColuna) {
        // Movimento permitido: direita ou na mesma coluna
        if ((novaColuna == colunaAtual + 1 || novaColuna == colunaAtual) && novaLinha == linhaAtual) {
            // Verifica se o espaço está vazio
            return tabuleiro[novaLinha][novaColuna] == null;
        }
        return false;
    }

    private void moverPeca(int novaLinha, int novaColuna) {
        if (turnoPrea) {
            // Movimento da Preá
            if (validarMovimentoPrea(novaLinha, novaColuna)) {
                tabuleiro[linhaAtualPrea][colunaAtualPrea] = null; // Remove Preá da posição antiga
                tabuleiro[novaLinha][novaColuna] = "Preá"; // Coloca Preá na nova posição
                linhaAtualPrea = novaLinha;
                colunaAtualPrea = novaColuna;

                atualizarTabuleiroUI(); // Atualiza o visual do tabuleiro
                alternarTurno(); // Alterna para o turno dos Estudantes
            } else {
                System.out.println("Movimento inválido para a Preá.");
            }
        } else {
            // Movimento dos Estudantes
            if (pecaSelecionada != null
                    && validarMovimentoEstudante(pecaSelecionada[0], pecaSelecionada[1], novaLinha, novaColuna)) {
                tabuleiro[pecaSelecionada[0]][pecaSelecionada[1]] = null; // Remove Estudante da posição antiga
                tabuleiro[novaLinha][novaColuna] = "Estudante"; // Coloca Estudante na nova posição
                pecaSelecionada = null; // Reseta seleção

                atualizarTabuleiroUI(); // Atualiza o visual do tabuleiro
                alternarTurno(); // Alterna para o turno da Preá
            } else {
                System.out.println("Movimento inválido ou nenhuma peça selecionada.");
            }
        }
    }

    private void selecionarPeca(int linha, int coluna) {
        if (!turnoPrea && tabuleiro[linha][coluna] != null && tabuleiro[linha][coluna].equals("Estudante")) {
            pecaSelecionada = new int[] { linha, coluna };
            System.out.println("Estudante selecionado na posição: " + linha + ", " + coluna);
        } else if (turnoPrea && tabuleiro[linha][coluna] != null && tabuleiro[linha][coluna].equals("Preá")) {
            System.out.println("Preá já está selecionada. Escolha um espaço adjacente para mover.");
        } else {
            System.out.println("Clique inválido para o turno atual.");
        }
    }

    private void atualizarTabuleiroUI() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                JButton botao = botoesTabuleiro[i][j];
                if (tabuleiro[i][j] == null) {
                    botao.setIcon(null); // Espaço vazio
                } else if (tabuleiro[i][j].equals("Preá")) {
                    botao.setIcon(new ImageIcon(getClass().getResource("/interfacet2/preaIcon.png"))); // Ícone da Preá
                } else if (tabuleiro[i][j].equals("Estudante")) {
                    botao.setIcon(new ImageIcon(getClass().getResource("/interfacet2/studentIcon.png"))); // Ícone do
                                                                                                          // Estudante
                }
            }
        }
    }

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(2, 4); 
    }

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(2, 3); 
    }

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(2, 2); 
    }

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(2, 1); 
    }

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(2, 0); 
    }

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(1, 4); 
    }

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(1, 3); 
    }

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(1, 2); 
    }

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(1, 1); 
    }

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(1, 0); 
    }

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(0, 4); 
    }

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(0, 3); 
    }

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(0, 2); 
    }

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {
        moverPeca(0, 1); 
    }

    private void C1StateChanged(javax.swing.event.ChangeEvent evt) {
        moverPeca(0, 0); 
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabuleiroTeste.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabuleiroTeste.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabuleiroTeste.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabuleiroTeste.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabuleiroTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel labelTurno;
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C13;
    private javax.swing.JButton C14;
    private javax.swing.JButton C15;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JPanel Porta;
    private javax.swing.JPanel RU;
    private javax.swing.JPanel Tabuleiro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private java.awt.Label textRestaurante;
    private java.awt.Label textUniversitario;
    // End of variables declaration
}
