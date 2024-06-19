package View;

import Control.CPF;
import Control.DAO.CRUD.PegarCliente;
import Model.Gerente;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TelaPesquisaPessoa extends javax.swing.JFrame {

    public TelaPesquisaPessoa() {
        setTitle("Menu de Pesquisa");
        //setIconImage();
        setResizable(false);
        setLocationRelativeTo(null);

        initComponents();

        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTelaPesquisa = new javax.swing.JPanel();
        botPesquisar = new javax.swing.JButton();
        botExcluirItem = new javax.swing.JButton();
        botCadastrarNovoItem = new javax.swing.JButton();
        caixaPesquisaUsuario = new javax.swing.JTextField();
        botEditarItem1 = new javax.swing.JButton();
        botAtualizarTabela = new javax.swing.JButton();
        botLimparTabela = new javax.swing.JButton();
        numeroLinha = new javax.swing.JLabel();
        tabelaPessoa = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelTelaPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        painelTelaPesquisa.setPreferredSize(new java.awt.Dimension(500, 300));

        botPesquisar.setText("Pesquisar");
        botPesquisar.setPreferredSize(new java.awt.Dimension(88, 25));
        botPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botPesquisarMouseClicked(evt);
            }
        });
        botPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisarActionPerformed(evt);
            }
        });
        botPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botPesquisarKeyPressed(evt);
            }
        });

        botExcluirItem.setText("Excluir");
        botExcluirItem.setPreferredSize(new java.awt.Dimension(88, 25));
        botExcluirItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botExcluirItemMouseClicked(evt);
            }
        });
        botExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirItemActionPerformed(evt);
            }
        });
        botExcluirItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botExcluirItemKeyPressed(evt);
            }
        });

        botCadastrarNovoItem.setText("Cadastrar");
        botCadastrarNovoItem.setPreferredSize(new java.awt.Dimension(88, 25));
        botCadastrarNovoItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botCadastrarNovoItemNovoItemMouseClicked(evt);
            }
        });
        botCadastrarNovoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCadastrarNovoItemActionPerformed(evt);
            }
        });
        botCadastrarNovoItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botCadastrarNovoItemKeyPressed(evt);
            }
        });

        caixaPesquisaUsuario.setFont(new java.awt.Font("Liberation Sans", 2, 13)); // NOI18N
        caixaPesquisaUsuario.setText("Digite o CPF...");
        caixaPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaPesquisaUsuarioActionPerformed(evt);
            }
        });
        caixaPesquisaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaPesquisaUsuarioKeyPressed(evt);
            }
        });

        botEditarItem1.setText("Editar");
        botEditarItem1.setPreferredSize(new java.awt.Dimension(88, 25));
        botEditarItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botEditarItem1MouseClicked(evt);
            }
        });
        botEditarItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEditarItem1ActionPerformed(evt);
            }
        });
        botEditarItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botEditarItem1KeyPressed(evt);
            }
        });

        botAtualizarTabela.setText("Atualizar tabela");
        botAtualizarTabela.setPreferredSize(new java.awt.Dimension(88, 25));
        botAtualizarTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botAtualizarTabelaNovoItemMouseClicked(evt);
            }
        });
        botAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAtualizarTabelaActionPerformed(evt);
            }
        });
        botAtualizarTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botAtualizarTabelaKeyPressed(evt);
            }
        });

        botLimparTabela.setText("Limpar tabela");
        botLimparTabela.setPreferredSize(new java.awt.Dimension(88, 25));
        botLimparTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botLimparTabelaNovoItemMouseClicked(evt);
            }
        });
        botLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimparTabelaActionPerformed(evt);
            }
        });
        botLimparTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botLimparTabelaKeyPressed(evt);
            }
        });

        numeroLinha.setBackground(new java.awt.Color(255, 255, 255));
        numeroLinha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Idade", "ID Cliente", "ID Conta", "Status da Conta", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        tabelaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaClienteKeyPressed(evt);
            }
        });
        tabelaPessoa.setViewportView(tabelaCliente);

        javax.swing.GroupLayout painelTelaPesquisaLayout = new javax.swing.GroupLayout(painelTelaPesquisa);
        painelTelaPesquisa.setLayout(painelTelaPesquisaLayout);
        painelTelaPesquisaLayout.setHorizontalGroup(
            painelTelaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTelaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaPessoa)
                    .addGroup(painelTelaPesquisaLayout.createSequentialGroup()
                        .addComponent(botAtualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botLimparTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(numeroLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(botCadastrarNovoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botEditarItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTelaPesquisaLayout.createSequentialGroup()
                        .addComponent(caixaPesquisaUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelTelaPesquisaLayout.setVerticalGroup(
            painelTelaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaPesquisaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(painelTelaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelaPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTelaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLinha)
                    .addGroup(painelTelaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botCadastrarNovoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botEditarItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botAtualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botLimparTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        painelTelaPesquisaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botCadastrarNovoItem, numeroLinha});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTelaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTelaPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisarActionPerformed
        pesquisarUnicaPessoa();
    }//GEN-LAST:event_botPesquisarActionPerformed

    private void botCadastrarNovoItemNovoItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botCadastrarNovoItemNovoItemMouseClicked
        chamarTelaCadastro();
    }//GEN-LAST:event_botCadastrarNovoItemNovoItemMouseClicked

    private void botCadastrarNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCadastrarNovoItemActionPerformed
        chamarTelaCadastro();
    }//GEN-LAST:event_botCadastrarNovoItemActionPerformed

    private void caixaPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaPesquisaUsuarioActionPerformed
        pesquisarUnicaPessoa();
    }//GEN-LAST:event_caixaPesquisaUsuarioActionPerformed

    private void botExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirItemActionPerformed
        excluir();
    }//GEN-LAST:event_botExcluirItemActionPerformed

    private void botExcluirItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botExcluirItemMouseClicked
        excluir();
    }//GEN-LAST:event_botExcluirItemMouseClicked

    private void botPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botPesquisarMouseClicked
        pesquisarUnicaPessoa();
    }//GEN-LAST:event_botPesquisarMouseClicked

    private void botCadastrarNovoItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botCadastrarNovoItemKeyPressed
        chamarTelaCadastro();
    }//GEN-LAST:event_botCadastrarNovoItemKeyPressed

    private void botEditarItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botEditarItem1MouseClicked
        chamarTelaEditarDados();
    }//GEN-LAST:event_botEditarItem1MouseClicked

    private void botEditarItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEditarItem1ActionPerformed
        chamarTelaEditarDados();
    }//GEN-LAST:event_botEditarItem1ActionPerformed

    private void botPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botPesquisarKeyPressed
        pesquisarUnicaPessoa();
    }//GEN-LAST:event_botPesquisarKeyPressed

    private void botEditarItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botEditarItem1KeyPressed
        chamarTelaEditarDados();
    }//GEN-LAST:event_botEditarItem1KeyPressed

    private void botAtualizarTabelaNovoItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botAtualizarTabelaNovoItemMouseClicked
        atualizarTabela();
    }//GEN-LAST:event_botAtualizarTabelaNovoItemMouseClicked

    private void botAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAtualizarTabelaActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_botAtualizarTabelaActionPerformed

    private void botAtualizarTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botAtualizarTabelaKeyPressed
        atualizarTabela();
    }//GEN-LAST:event_botAtualizarTabelaKeyPressed

    private void botLimparTabelaNovoItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botLimparTabelaNovoItemMouseClicked
        limparTabela();
    }//GEN-LAST:event_botLimparTabelaNovoItemMouseClicked

    private void botLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimparTabelaActionPerformed
        limparTabela();
    }//GEN-LAST:event_botLimparTabelaActionPerformed

    private void botLimparTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botLimparTabelaKeyPressed
        limparTabela();
    }//GEN-LAST:event_botLimparTabelaKeyPressed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        seleçaoLinhaTabela();
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void tabelaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaClienteKeyPressed

    }//GEN-LAST:event_tabelaClienteKeyPressed

    private void botExcluirItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botExcluirItemKeyPressed
        excluir();
    }//GEN-LAST:event_botExcluirItemKeyPressed

    private void caixaPesquisaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaPesquisaUsuarioKeyPressed

    }//GEN-LAST:event_caixaPesquisaUsuarioKeyPressed

    private void pesquisarUnicaPessoa() {
        //Armazena cpf
        String cpf = caixaPesquisaUsuario.getText();

        //Verifica se o cpf digitado é válido
        if (validarCPFPesquisado(cpf)) {
            limparTabela();
            DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();

            PegarCliente pegarClientes = new PegarCliente();
            ArrayList<Object> tbl_Cliente = pegarClientes.getPegarClienteUnico(cpf);
            pegarClientes.getPegarClienteUnico(cpf);

            for (Object cliente : tbl_Cliente) {
                modelo.addRow((Object[]) cliente);
            }
        }
    }

    private void chamarTelaCadastro() {
        String cpf = null;

        //Pergunta quem quer cadastrar
        int opçao = JOptionPane.showConfirmDialog(null,
                "Deseja cadastrar um cliente ou gerente?",
                "Selecionar tipo de cadastro",
                JOptionPane.YES_NO_OPTION);

        /*Pergunta se deseja cadastrar esse cpf digitado
            int usarCpf = JOptionPane.showConfirmDialog(null,
                    "Deseja usar o cpf digitado para inicializar cadastro?",
                    "Usar cpf digitado",
                    JOptionPane.YES_NO_OPTION);

            if (usarCpf == JOptionPane.YES_OPTION) {
                cpf = caixaPesquisaUsuario.getText();
            }*/
        switch (opçao) {
            case JOptionPane.YES_OPTION -> {
                // Cadastrar cliente
                this.dispose();
                new TelaCadastroCliente().setVisible(true);
            }

            case JOptionPane.NO_OPTION -> {
                // Cadastrar gerente
                this.dispose();
                new TelaCadastroGerente().setVisible(true);
            }
        }
    }

    private void chamarTelaEditarDados() {
        String cpf = pegarCPFLinha();

        int opçao = JOptionPane.showConfirmDialog(null,
                "Deseja editar esse cliente?",
                "Confirmar edição",
                JOptionPane.YES_NO_OPTION);
        switch (opçao) {
            case JOptionPane.YES_OPTION -> {
                this.dispose();
                new TelaEditar(cpf).setVisible(true);
            }

            case JOptionPane.NO_OPTION -> {
            }
        }
    }

    private void excluir() {
        int opçao = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir esse usuário?", "Excluir usuário", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        switch (opçao) {
            case JOptionPane.YES_OPTION -> {
                Gerente ger = new Gerente(null, null, null, null, null, null, null, null);
                ger.getExcluirCliente(pegarCPFLinha());
                atualizarTabela();
            }

            case JOptionPane.NO_OPTION -> {
                //Não exclui
            }

            default -> {
                //Não exclui
            }
        }
    }

    private void atualizarTabela() {
        limparTabela();
        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();

        PegarCliente pegarClientes = new PegarCliente();
        ArrayList<Object> tbl_Clientes = pegarClientes.getPegarClientes();
        pegarClientes.getPegarClientes();

        for (Object cliente : tbl_Clientes) {
            modelo.addRow((Object[]) cliente);
        }
    }

    private void limparTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();

        modelo.setNumRows(0);
        numeroLinha.setText("");
    }

    private void seleçaoLinhaTabela() {
        int linha = tabelaCliente.getSelectedRow();
        numeroLinha.setText("" + (linha + 1));
    }

    private String pegarCPFLinha() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();
        int linha = Integer.parseInt(numeroLinha.getText()) - 1;
        return ((String) modelo.getValueAt(linha, 1));
    }

    /*    private void pesquisarTblCliente(String cpf) {
    Gerente pesquisa = new Gerente(null, null, null, null, null, null, null, null);
    ResultSet resultado = pesquisa.getPesquisarCliente(cpf);

    try {
        if (!resultado.next()) {
            mensagemPessoaInexixtenteBD("Cliente");
        } else {
            String nome = resultado.getString("nomtabelaPessoae");
            String cpfBD = resultado.getString("cpf");
            int idade = resultado.getInt("idade");
            int idCliente = resultado.getInt("idCliente");
            String idConta = resultado.getString("idConta");
            double saldoAtual = resultado.getDouble("saldoAtual");
            boolean statusConta = resultado.getBoolean("statusCliente");

            String statusContaStr;

            if (statusConta) {
                statusContaStr = "Ativo";
            } else {
                statusContaStr = "Inativo";
            }

            String mensagem = "Nome: " + nome + "\n"
                    + "CPF: " + cpfBD + "\n"
                    + "Idade: " + idade + "\n"
                    + "ID Cliente: " + idCliente + "\n"
                    + "ID Conta: " + idConta + "\n"
                    + "Saldo Atual: " + saldoAtual + "\n"
                    + "Status da Conta: " + statusContaStr.toUpperCase();

            JOptionPane.showMessageDialog(null, mensagem, "Dados do Cliente", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException u) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados do cliente!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}*/
 /*
private void pesquisarTblGetente(String cpf) {
    Gerente pesquisa = new Gerente(null, null, null, null, null, null, null, null);
    ResultSet resultado = pesquisa.getPesquisarGerente(cpf);

    try {
        if (!resultado.next()) {
            mensagemPessoaInexixtenteBD("Gerente");
        } else {
            String nome = resultado.getString("nome");
            String cpfBD = resultado.getString("cpf");
            int idade = resultado.getInt("idade");
            String idGerente = resultado.getString("idGerente");

            String mensagem = "Nome: " + nome + "\n"
                    + "CPF: " + cpfBD + "\n"
                    + "Idade: " + idade + "\n"
                    + "ID Gerente: " + idGerente + "\n";

            JOptionPane.showMessageDialog(null, mensagem, "Dados do Gerente", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException u) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados do gerente!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}*/
    private boolean validarCPFPesquisado(String cpf) {
        CPF validador = new CPF();
        boolean validarCPF = validador.getValidarCPF(cpf);
        boolean isValido = false;

        if (!validarCPF) {
            JOptionPane.showMessageDialog(null, "CPF inválido! Por favor, digite novamente.", "Validador de CPF", JOptionPane.ERROR_MESSAGE);
        } else {
            isValido = true;
        }

        return isValido;
    }

    private void mensagemPessoaInexixtenteBD(String tipoPessoa) {
        JOptionPane.showMessageDialog(null, "Esse " + tipoPessoa.toLowerCase() + " não existe!", tipoPessoa + " inexistente", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAtualizarTabela;
    private javax.swing.JButton botCadastrarNovoItem;
    private javax.swing.JButton botEditarItem1;
    private javax.swing.JButton botExcluirItem;
    private javax.swing.JButton botLimparTabela;
    private javax.swing.JButton botPesquisar;
    private javax.swing.JTextField caixaPesquisaUsuario;
    private javax.swing.JLabel numeroLinha;
    private javax.swing.JPanel painelTelaPesquisa;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JScrollPane tabelaPessoa;
    // End of variables declaration//GEN-END:variables
}
