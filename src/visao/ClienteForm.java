/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;


import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class ClienteForm extends javax.swing.JFrame {

    private ClienteDao clienteDao = new ClienteDao();
    private List<Cliente> clientes;
    private Cliente clienteSelecionado;
    
    private final Usuario user;
    
    /**
     * Creates new form ClienteForm
     */
    public ClienteForm(Usuario user) {
        initComponents();
        
        this.user=user;
        
        atualizarTabela();
        atualizaBotao(true);
        habilitarFormulario(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txf_nome = new javax.swing.JTextField();
        txf_cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txf_rua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txf_numero = new javax.swing.JTextField();
        txf_bairro = new javax.swing.JTextField();
        txf_cep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_telefone = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txf_pesquisa = new javax.swing.JTextField();
        btn_pesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 153)));

        jPanel2.setBackground(new java.awt.Color(255, 210, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(189, 49, 119));
        jLabel4.setText("Rua");

        txf_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ruaActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(189, 49, 119));
        jLabel7.setText("Número");

        txf_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_numeroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(189, 49, 119));
        jLabel8.setText("Bairro");

        jLabel9.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(189, 49, 119));
        jLabel9.setText("Cep");

        jLabel10.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(189, 49, 119));
        jLabel10.setText("Nome");

        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 49, 119));
        jLabel2.setText("Cpf");

        jLabel3.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(189, 49, 119));
        jLabel3.setText("Telefone");

        txf_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_telefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 210, 244));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_alterar.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(189, 49, 119));
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(189, 49, 119));
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_salvar.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(189, 49, 119));
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(189, 49, 119));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_voltar.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(189, 49, 119));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_cadastrar.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(189, 49, 119));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(189, 49, 119));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Cliente");

        jPanel3.setBackground(new java.awt.Color(255, 210, 244));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(189, 49, 119));
        jLabel5.setText("Texto");

        txf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_pesquisaActionPerformed(evt);
            }
        });

        btn_pesquisa.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_pesquisa.setForeground(new java.awt.Color(189, 49, 119));
        btn_pesquisa.setText("Pesquisar");
        btn_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_pesquisa)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "telefone", "rua", "numero", "bairro", "cep"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_numeroActionPerformed

    private void txf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_pesquisaActionPerformed

    private void txf_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_ruaActionPerformed

    private void txf_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_telefoneActionPerformed

    private void btn_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_btn_pesquisaActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        atualizaBotao(false);
        habilitarFormulario(true);
        limparTexto();
        txf_nome.requestFocus();
        clienteSelecionado = null;
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        int linha = tabela.getSelectedRow();
         if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizaBotao(false);
        habilitarFormulario(true);
        
        clienteSelecionado = clientes.get(linha);
        txf_nome.setText(clienteSelecionado.getNome());
        txf_cpf.setText(clienteSelecionado.getCpf());
        txf_telefone.setText(clienteSelecionado.getTelefone());
        txf_rua.setText(clienteSelecionado.getRua());
        txf_numero.setText(Integer.toString(clienteSelecionado.getNumero()));
        txf_bairro.setText(clienteSelecionado.getBairro());
        txf_cep.setText(clienteSelecionado.getCep());
        
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
       int linha = tabela.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        clienteSelecionado = clientes.get(linha);
        try {
            clienteDao.remover(clienteSelecionado.getCodigo());
            JOptionPane.showMessageDialog(null, "cliente excluído");
            atualizarTabela();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        limparTexto();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        atualizaBotao(true);
        habilitarFormulario(false);
        
        String nome = txf_nome.getText();
        String cpf = txf_cpf.getText();
        String telefone = txf_telefone.getText();
        String rua = txf_rua.getText();
        int numero = 0;
        String bairro = txf_bairro.getText();
        String cep = txf_cep.getText();

        try {
            numero = Integer.parseInt(txf_numero.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número não informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "informe um numero.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;

        }

        if (nome.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe um nome.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cpf.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe um cpf.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (telefone.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe um telefone.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rua.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe uma rua.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (bairro.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe um bairro", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cep.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe um cep", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (clienteSelecionado == null) {

            Cliente cliente = new Cliente(nome, cpf, telefone, rua, numero, bairro, cep);

            try {
                clienteDao.adicionar(cliente);
                JOptionPane.showMessageDialog(null, "cliente cadastrada com sucesso");
                
                limparTexto();
                
                txf_nome.requestFocus();

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bd", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            clienteSelecionado.setNome(nome);
            clienteSelecionado.setCpf(cpf);
            clienteSelecionado.setTelefone(telefone);
            clienteSelecionado.setRua(rua);
            clienteSelecionado.setNumero(numero);
            clienteSelecionado.setBairro(bairro);
            clienteSelecionado.setCep(cep);

            try {

                clienteDao.alterar(clienteSelecionado);
                JOptionPane.showMessageDialog(null, "cliente alterado");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
   
        clienteSelecionado = null;
        
        atualizarTabela();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        atualizaBotao(true);
        habilitarFormulario(false);
        clienteSelecionado = null;
        limparTexto();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        Principal principal = new Principal(user);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    /* MÉTODO UTILIZADO PARA RETIRAR TEXTO DO FORMLÁRIO, LIMPANDO INFORMAÇÕES 
    JÁ CADASTRADAS OU ALTERADAS, OU CASO TENHA UM CANCELAMENTO DE AÇÃO. */
    private void limparTexto(){
        txf_nome.setText("");
        txf_cpf.setText("");
        txf_telefone.setText("");
        txf_rua.setText("");
        txf_numero.setText("");
        txf_bairro.setText("");
        txf_cep.setText("");
    }
    
    private void atualizaBotao(boolean status) {
        btn_alterar.setEnabled(status);
        btn_excluir.setEnabled(status);
        btn_pesquisa.setEnabled(status);
        btn_cadastrar.setEnabled(status);
        btn_cancelar.setEnabled(!status);
        btn_salvar.setEnabled(!status);
    }
    
    private void habilitarFormulario(boolean status) {
        txf_nome.setEnabled(status);
        txf_cpf.setEnabled(status);
        txf_telefone.setEnabled(status);
        txf_rua.setEnabled(status);
        txf_numero.setEnabled(status);
        txf_bairro.setEnabled(status);
        txf_cep.setEnabled(status);
    }
    
    private void atualizarTabela() {
        try {
            clientes = clienteDao.buscarPeloNome(txf_pesquisa.getText());

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            for (int i = 0; i < clientes.size(); i++) {
                Cliente cliente = clientes.get(i);
                model.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getRua(), cliente.getNumero(), cliente.getBairro(), cliente.getCep(),});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pesquisa;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txf_bairro;
    private javax.swing.JTextField txf_cep;
    private javax.swing.JTextField txf_cpf;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_numero;
    private javax.swing.JTextField txf_pesquisa;
    private javax.swing.JTextField txf_rua;
    private javax.swing.JTextField txf_telefone;
    // End of variables declaration//GEN-END:variables
}
