
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class Usuario extends javax.swing.JFrame {

    public Usuario() {
        initComponents();
    }
    String usuario = "root";
    String senha = "";
    String url = "jdbc:mysql://127.0.0.1:3306/grafica";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSen = new javax.swing.JLabel();
        txtSen = new javax.swing.JPasswordField();
        lblSenCon = new javax.swing.JLabel();
        txtSenCon = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        radAten = new javax.swing.JRadioButton();
        radAdmin = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnConsultar1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        btnAdicionar1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        btnVoltar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuário");
        setResizable(false);
        getContentPane().setLayout(null);

        lblId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblId.setText("ID");
        getContentPane().add(lblId);
        lblId.setBounds(20, 120, 12, 15);

        txtId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtId);
        txtId.setBounds(70, 120, 310, 30);

        lblNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 170, 34, 15);

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 170, 790, 30);

        lblCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCpf.setText("CPF");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(490, 120, 24, 15);

        txtCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(540, 120, 320, 30);

        lblEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEmail.setText("Email");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(20, 220, 32, 15);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(70, 220, 790, 30);

        lblSen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSen.setText("Senha");
        getContentPane().add(lblSen);
        lblSen.setBounds(20, 270, 36, 15);

        txtSen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtSen);
        txtSen.setBounds(70, 270, 320, 30);

        lblSenCon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSenCon.setText("Confirmar Senha");
        getContentPane().add(lblSenCon);
        lblSenCon.setBounds(420, 270, 94, 15);
        getContentPane().add(txtSenCon);
        txtSenCon.setBounds(540, 270, 320, 30);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        radAten.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        radAten.setText("Atendente");
        radAten.setOpaque(false);

        radAdmin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        radAdmin.setText("Administrador");
        radAdmin.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radAdmin)
                    .addComponent(radAten)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(radAdmin)
                .addGap(18, 18, 18)
                .addComponent(radAten)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(940, 120, 190, 110);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-mail", "CPF", "Senha", "Tipo Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.setOpaque(false);
        jScrollPane2.setViewportView(tblUsuario);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 333, 1110, 330);

        btnConsultar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnConsultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Consultar_Cliente.png"))); // NOI18N
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar1);
        btnConsultar1.setBounds(20, 10, 70, 80);

        btnEditar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editar_Cliente.png"))); // NOI18N
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar1);
        btnEditar1.setBounds(100, 10, 80, 80);

        btnAdicionar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAdicionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cadastrar_Cliente.png"))); // NOI18N
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar1);
        btnAdicionar1.setBounds(190, 10, 80, 80);

        btnLimpar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limpar_Cliente.png"))); // NOI18N
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar1);
        btnLimpar1.setBounds(280, 10, 80, 80);

        btnExcluir1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Excluir_Cliente.png"))); // NOI18N
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir1);
        btnExcluir1.setBounds(370, 10, 80, 80);

        btnVoltar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Voltar_Cliente.png"))); // NOI18N
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar1);
        btnVoltar1.setBounds(460, 10, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo_Cliente.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 690);

        setSize(new java.awt.Dimension(1166, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        int cod_Usuario = Integer.parseInt(txtId.getText());
        String Email = txtEmail.getText();
        String cpf = txtCpf.getText();
        String sen = txtSen.getText();
        String senCon = txtSenCon.getText();
        String nome = txtNome.getText();
        int tipo = 0;
        boolean aten = radAten.isSelected();
        boolean admin = radAdmin.isSelected();

        if (aten == true) {
            tipo = 1;
        } else {
            if (admin == true) {
                tipo = 2;
            }
        }

        String sql = "update usuario set nome=?, email=?,cpf=?, senha=?, tipo_Usuário=?  where cod_Usuario=?";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, nome);
            comando.setString(2, Email);
            comando.setString(3, cpf);
            comando.setString(4, sen);
            comando.setInt(5, tipo);
            comando.setInt(6, cod_Usuario);

            comando.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");

            comando.close();
            conexao.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao editar dos dados de cadastro do usuário");
        }

        txtSenCon.setText(null);
        txtCpf.setText(null);
        txtSen.setText(null);
        txtEmail.setText(null);
        txtNome.setText(null);
        radAten.setText(null);
        radAdmin.setText(null);
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
        //captura os dados digitados;
        String Email = txtEmail.getText();
        String cpf = txtCpf.getText();
        String sen = txtSen.getText();
        String senCon = txtSenCon.getText();
        String nome = txtNome.getText();
        String tipo = "admin";
        boolean aten = radAten.isSelected();
        boolean admin = radAdmin.isSelected();

        if (aten == true) {
            tipo = "Atendente";
        } else {
            if (admin == true) {
                tipo = "Admin";
            }
        }

        String sql = "insert into usuario (nome, cpf, email, tipo_Usuário, senha, ativo) values ( ?, ?, ?, ?, ?, ?) ";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, nome);
            comando.setString(3, Email);
            comando.setString(2, cpf);
            comando.setString(5, sen);
            comando.setString(4, tipo);
            comando.setInt(6, 1);

            comando.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

            comando.close();
            conexao.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na inserção dos dados cadastrais de usuário");
        }

        txtSenCon.setText(null);
        txtCpf.setText(null);
        txtSen.setText(null);
        txtEmail.setText(null);
        txtNome.setText(null);
//        radAten.setText(null);
//        radAdmin.setText(null);
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        int cod_Usuario = Integer.parseInt(txtId.getText());

        String sql = "delete FROM usuario where cod_Usuario=?";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, cod_Usuario);

            comando.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário removcod_Usuarioo com sucesso!");

            comando.close();
            conexao.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na remoção dos dados do usuário");
        }

        txtSenCon.setText(null);
        txtCpf.setText(null);
        txtSen.setText(null);
        txtEmail.setText(null);
        txtNome.setText(null);
        radAten.setText(null);
        radAdmin.setText(null);
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        String sql = "select * from usuario order by nome";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            PreparedStatement comando = conexao.prepareStatement(sql);

            ResultSet resultado = comando.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) tblUsuario.getModel();

            //Limpar a tabela da tela
            //Capturar o total de linhas da tebela da tela.
            int totalDeLinhas = modelo.getRowCount();

            for (int p = 0; p < totalDeLinhas; p++) {
                //Remove a linha da tabela ba posição informada.
                modelo.removeRow(p);
            }

            while (resultado.next()) {
                Object[] linha = new Object[]{
                    resultado.getInt("cod_Usuario"),
                    resultado.getString("nome"),
                    resultado.getString("email"),
                    resultado.getString("cpf"),
                    resultado.getString("senha"),
                    resultado.getString("tipo_Usuário")
                };

                modelo.addRow(linha);
            }
            txtSenCon.setText(null);
            txtCpf.setText(null);
            txtSen.setText(null);
            txtEmail.setText(null);
            txtNome.setText(null);
            radAten.setText(null);
            radAdmin.setText(null);

            resultado.close();
            comando.close();
            conexao.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na consulta de dados");
        }
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed

        txtSenCon.setText(null);
        txtCpf.setText(null);
        txtSen.setText(null);
        txtEmail.setText(null);
        txtNome.setText(null);
        txtId.setText(null);
        radAten.setText(null);
        radAdmin.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        txtSenCon.setText(null);
        txtCpf.setText(null);
        txtSen.setText(null);
        txtEmail.setText(null);
        txtNome.setText(null);
        txtId.setText(null);
        radAten.setText(null);
        radAdmin.setText(null);
    }//GEN-LAST:event_txtCpfActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSen;
    private javax.swing.JLabel lblSenCon;
    private javax.swing.JRadioButton radAdmin;
    private javax.swing.JRadioButton radAten;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSen;
    private javax.swing.JPasswordField txtSenCon;
    // End of variables declaration//GEN-END:variables
}
