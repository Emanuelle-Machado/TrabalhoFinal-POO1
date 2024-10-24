/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import dao.FuncionarioDao;
import java.util.List;
import modelo.Funcionario;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class FuncionarioForm extends javax.swing.JFrame {

    private FuncionarioDao funcionarioDao = new FuncionarioDao();
    private List<Funcionario> funcionarios;
    private Funcionario funcionarioSelecionado;
    
    private final Usuario user;
    
    /**
     * Creates new form FuncionarioForm
     */
    public FuncionarioForm(Usuario user) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_funcao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txf_telefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btn_cadastrar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txf_pesquisa = new javax.swing.JTextField();
        btn_pesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 153)));

        jPanel2.setBackground(new java.awt.Color(255, 210, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 49, 119));
        jLabel2.setText("Cpf");

        jLabel3.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(189, 49, 119));
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(189, 49, 119));
        jLabel4.setText("Função");

        txf_funcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_funcaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(189, 49, 119));
        jLabel6.setText("Salário");

        jLabel7.setFont(new java.awt.Font("French Script MT", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(189, 49, 119));
        jLabel7.setText("Nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txf_salario)
                            .addComponent(txf_cpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txf_funcao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txf_telefone))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txf_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txf_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "telefone", "funcao", "salario"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanel6.setBackground(new java.awt.Color(255, 210, 244));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_cadastrar.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(189, 49, 119));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(189, 49, 119));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Funcionário");

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
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pesquisa)
                .addGap(8, 8, 8))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_pesquisaActionPerformed

    private void txf_funcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_funcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_funcaoActionPerformed

    private void btn_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_btn_pesquisaActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        atualizaBotao(false);
        habilitarFormulario(true);
        limparTexto();
        txf_nome.requestFocus();
        funcionarioSelecionado = null;
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        int linha = tabela.getSelectedRow();
         if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizaBotao(false);
        habilitarFormulario(true);
        
        funcionarioSelecionado = funcionarios.get(linha);
        txf_nome.setText(funcionarioSelecionado.getNome());
        txf_cpf.setText(funcionarioSelecionado.getCpf());
        txf_telefone.setText(funcionarioSelecionado.getTelefone());
        txf_funcao.setText(funcionarioSelecionado.getFuncao());
        txf_salario.setText(Double.toString(funcionarioSelecionado.getSalario()));
        
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int linha = tabela.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        funcionarioSelecionado = funcionarios.get(linha);
        try {
            funcionarioDao.remover(funcionarioSelecionado.getCodigo());
            JOptionPane.showMessageDialog(null, "Funcionário excluído");
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
        String funcao = txf_funcao.getText();
        
        double salario = 0;
        
        try{
            salario = Double.parseDouble(txf_salario.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "formato incorreto para salário"," Atenção " ,JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(salario == 0){
            JOptionPane.showMessageDialog(null, "digite o salário"," Atenção " ,JOptionPane.WARNING_MESSAGE);
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
        if (funcao.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe uma funcao.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (funcionarioSelecionado == null) {

            Funcionario funcionario = new Funcionario(nome, cpf, telefone, funcao, salario);

            try {
                funcionarioDao.adicionar(funcionario);
                JOptionPane.showMessageDialog(null, "funcionario cadastrado com sucesso");
                 
                limparTexto();
                 
                txf_nome.requestFocus();

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bd", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            funcionarioSelecionado.setNome(nome);
            funcionarioSelecionado.setCpf(cpf);
            funcionarioSelecionado.setTelefone(telefone);
            funcionarioSelecionado.setFuncao(funcao);
            funcionarioSelecionado.setSalario(salario);

            try {

                funcionarioDao.alterar(funcionarioSelecionado);
                JOptionPane.showMessageDialog(null, "funcionario alterado");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        
        funcionarioSelecionado = null;
        
        atualizarTabela();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
       Principal principal = new Principal(user);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        atualizaBotao(true);
        habilitarFormulario(false);
        funcionarioSelecionado = null;
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /* MÉTODO UTILIZADO PARA RETIRAR TEXTO DO FORMLÁRIO, LIMPANDO INFORMAÇÕES 
    JÁ CADASTRADAS OU ALTERADAS, OU CASO TENHA UM CANCELAMENTO DE AÇÃO. */
    private void limparTexto(){
        txf_nome.setText("");
        txf_cpf.setText("");
        txf_telefone.setText("");
        txf_funcao.setText("");
        txf_salario.setText("");
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
        txf_funcao.setEnabled(status);
        txf_salario.setEnabled(status);
    }
    
    private void atualizarTabela() {
        try {
            funcionarios = funcionarioDao.buscarPeloNome(txf_pesquisa.getText());

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            for (int i = 0; i < funcionarios.size(); i++) {
                Funcionario funcionario = funcionarios.get(i);
                model.addRow(new Object[]{funcionario.getNome(), funcionario.getCpf(), funcionario.getTelefone(), funcionario.getFuncao(), funcionario.getSalario(),});
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txf_cpf;
    private javax.swing.JTextField txf_funcao;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_pesquisa;
    private javax.swing.JTextField txf_salario;
    private javax.swing.JTextField txf_telefone;
    // End of variables declaration//GEN-END:variables
}
