
package Interface;

import Controlo.Calculadora;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import javax.swing.JButton;

/**
 *
 * @author Ricardo/PedroSantos
 */
public class JFrameCalc extends javax.swing.JFrame 
{
    private String ANS = null;
    private String op, optemp="";
    private String auxEstado="";
    private String auxANS="", str="";
    private boolean fezTotal = false;
    Calculadora calc = new Calculadora();
    
    public JFrameCalc() {
        
        initComponents();
        jBapagar.setForeground(Color.white);
        jBapagar.setOpaque(true); 
        jBapagar.setBackground(new Color(115,1,1));   
        
        jBtotal.setForeground(Color.white);
        jBtotal.setOpaque(true);
        jBtotal.setBackground(new Color(0,102,255));
        
        jBdesc.setOpaque(true);
        jBdesc.setBackground(new Color(255,204,51));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTescudos = new javax.swing.JTextField();
        jTeuros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jB0 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jBtotal = new javax.swing.JButton();
        jBponto = new javax.swing.JButton();
        jB23porcento = new javax.swing.JButton();
        jB13porcento = new javax.swing.JButton();
        jB6porcento = new javax.swing.JButton();
        jBapagar = new javax.swing.JButton();
        jBdivisao = new javax.swing.JButton();
        jBmultiplicacao = new javax.swing.JButton();
        jBmenos = new javax.swing.JButton();
        jBmais = new javax.swing.JButton();
        jBdesc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTescudos.setBackground(new java.awt.Color(238, 238, 238));
        jTescudos.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTescudos.setForeground(new java.awt.Color(255, 255, 255));
        jTescudos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTescudos.setBorder(null);
        jTescudos.setEnabled(false);
        jTescudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTescudosActionPerformed(evt);
            }
        });

        jTeuros.setEditable(false);
        jTeuros.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jTeuros.setForeground(new java.awt.Color(255, 255, 255));
        jTeuros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTeuros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTeuros.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Escudos");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("â‚¬");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jB0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB0.setLabel("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB7.setLabel("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB9.setLabel("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB8.setLabel("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB5.setLabel("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB4.setLabel("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB6.setLabel("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB2.setLabel("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB1.setLabel("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB3.setLabel("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBtotal.setBackground(new java.awt.Color(0, 102, 255));
        jBtotal.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jBtotal.setForeground(new java.awt.Color(255, 255, 255));
        jBtotal.setText("=");
        jBtotal.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jBtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBponto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBponto.setText(".");
        jBponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB23porcento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB23porcento.setText("IVA 23 %");
        jB23porcento.setBorder(javax.swing.BorderFactory.createBevelBorder(0, null, new java.awt.Color(204, 204, 204), null, null));
        jB23porcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB13porcento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB13porcento.setText("IVA 13 %");
        jB13porcento.setBorder(javax.swing.BorderFactory.createBevelBorder(0, null, new java.awt.Color(204, 204, 204), null, null));
        jB13porcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jB6porcento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jB6porcento.setText("IVA   6 %");
        jB6porcento.setBorder(javax.swing.BorderFactory.createBevelBorder(0, null, new java.awt.Color(204, 204, 204), null, null));
        jB6porcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBapagar.setBackground(new java.awt.Color(115, 1, 1));
        jBapagar.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jBapagar.setForeground(new java.awt.Color(255, 255, 255));
        jBapagar.setText("AC");
        jBapagar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jBapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBdivisao.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jBdivisao.setText("/");
        jBdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBmultiplicacao.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jBmultiplicacao.setLabel("*");
        jBmultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBmenos.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jBmenos.setText("-");
        jBmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBmais.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jBmais.setText("+");
        jBmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        jBdesc.setBackground(new java.awt.Color(255, 204, 51));
        jBdesc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBdesc.setText("Desconto");
        jBdesc.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jBdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jBapagar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 387, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jTeuros))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jB0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jB1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jB4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jB7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jB5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jB2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jB8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jB9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jBdivisao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jBponto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jB3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jBmenos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jBmais, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jB6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jBmultiplicacao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(440, 440, 440)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jB13porcento, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .add(jB23porcento, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jBdesc, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jB6porcento, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jBtotal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jTescudos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 258, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTeuros, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(36, 36, 36)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTescudos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBapagar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBdesc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jB7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jB8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jB9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBdivisao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jB23porcento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jB4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jB5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jB6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBmultiplicacao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jB13porcento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jB1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jB2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jB3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jBmenos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jB6porcento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jB0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBponto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBmais, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .add(jBtotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(77, 77, 77))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {jBdivisao, jBmenos, jBmultiplicacao}, org.jdesktop.layout.GroupLayout.VERTICAL);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActionPerformed
        JButton botao = (JButton) evt.getSource();
        String txtBotao = botao.getText();
        this.estadosCalculadora(txtBotao);
       
    }//GEN-LAST:event_jBActionPerformed

    private void jTescudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTescudosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTescudosActionPerformed

    private estadosCalculadora ObtemTipo(String c) 
    {
        
        if("0123456789".indexOf(c) != -1)
        {
            if(auxEstado.equals("descontos"))
            {
                auxANS += c + " %";
                str = auxANS;
                String[] a = auxANS.split(" ");
                auxANS = a[0];
                String[] b = auxANS.split("-");
                //Converte para double
                double cc;
                cc = Double.parseDouble(b[1]);
                if(cc > 100)
                {
                    Toolkit.getDefaultToolkit().beep();                   
                }else{
                    jTeuros.setText(str);
                    ANS = String.valueOf(cc); 
                }
            }else{
                jTeuros.setText(c);
            }
            return estadosCalculadora.NUMERO;
        }else if(c.equals("AC")){
            return estadosCalculadora.LIMPA;
        }else if("+-*/".indexOf(c) != -1){
            return estadosCalculadora.OPERADORES;
        }else if(c.equals("Desconto")){
            return estadosCalculadora.DESCONTOS;
        }else if(c.equals(".")){
            return estadosCalculadora.PONTO;
        }else if(c.contains("IVA")){
            return estadosCalculadora.IVAS;
        }else if(c.equals("=")){
            return estadosCalculadora.TOTAL;
        }
        return null;
    }

    private void ConverteParaEscudos() 
    {
        String val;
        Double escudos;
        val = jTeuros.getText();

        if(!OpAFazer() && !val.equals("") && !auxEstado.equals("descontos"))
        {
            val= val.replace(",", ".");
            escudos = Double.parseDouble(val);
            escudos = escudos * 200.482;
            String format = String.format("%.2f", escudos);
            val = String.valueOf(format);
            ANS= ANS.replace(",", ".");
            jTescudos.setText(val);
   
        }else{
            jTescudos.setText("");
        }      
    }   
    
    // Estados da calculadora
    public enum estadosCalculadora 
    {
        NUMERO,
        PONTO,
        OPERADORES,
        IVAS,
        DESCONTOS,
        TOTAL,
        LIMPA
    }

    // OperaÃ§Ãµes da calculadora
    public enum operacoesCalculadora 
    {
        SOMA,
        SUBTRAI,
        MULTIPLICA,
        DIVIDE,
        IVA23,
        IVA13,
        IVA6,
        DESC
    }


   // Propriedades para controle interno
    private estadosCalculadora estado = estadosCalculadora.NUMERO;
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB13porcento;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB23porcento;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB6porcento;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBapagar;
    private javax.swing.JButton jBdesc;
    private javax.swing.JButton jBdivisao;
    private javax.swing.JButton jBmais;
    private javax.swing.JButton jBmenos;
    private javax.swing.JButton jBmultiplicacao;
    private javax.swing.JButton jBponto;
    private javax.swing.JButton jBtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTescudos;
    private javax.swing.JTextField jTeuros;
    // End of variables declaration//GEN-END:variables

    
    private double total;
    
    public void estadosCalculadora(String caracterDigitado)
    {
        double valor, aux;
        if(!auxEstado.equals("descontos"))
        {
            BloqOperaDesconto(true);
        }
        
        //Verifica o que esta acontecer
        estado = ObtemTipo(caracterDigitado);
        
        if(this.estado == estadosCalculadora.NUMERO)
        { 
            if(fezTotal==true)
            {
                ANS=null;
                fezTotal=false;
            }
            
            if(auxEstado.equals("descontos"))
            {
               
                String n =  jTeuros.getText();
                System.out.println("TEXTE: "+n);
                if(n.contains("%"))
                {
                    //Separa os % e o numeroString[] a = auxANS.split(" ");
                    String[] a = n.split(" ");
                    auxANS = a[0];
                    String[] b = auxANS.split("-");
                    //Converte para double
                    double cc;
                    cc = Double.parseDouble(b[1]);
                    if(cc > 100)
                    {
                        Toolkit.getDefaultToolkit().beep();                   
                    }else{
                        jTeuros.setText(str);
                        ANS = String.valueOf(cc); 
                    }
                    
                }else{
                    ANS = n;
                    n = n + " %";
                    auxANS += n;
                    str = auxANS;
                }
            }else{
                op = jTeuros.getText();
                if(VerificaLimiteNumero(ANS))
                {
                    if(ANS==null) {
                        ANS = op;
                    }
                    else {
                        ANS = ANS + op;
                    }
                }else{
                    //Emite som de erro
                    Toolkit.getDefaultToolkit().beep();
                }
                jTeuros.setText(ANS);
            }
        }else if(this.estado == estadosCalculadora.DESCONTOS){
            
            if(ANS != null)
            {
                BloqOperaDesconto(false);
                jBtotal.setEnabled(true);

                ANS = jTeuros.getText();
                
                if(OpAFazer())
                {
                    CalcOpAnterior();
                    ANS = String.valueOf(total);
                    jTeuros.setText(ANS);
                }

                total=Double.parseDouble(ANS);
                auxANS=total + "-";
                ANS="";
                jTeuros.setText(auxANS);
                auxEstado="descontos";
                BloqParaDescontos(false);
            }
                      
        }else if(this.estado == estadosCalculadora.IVAS){
 
            if(ANS != null)
            {

                if(OpAFazer())
                {
                    CalcOpAnterior();
                    ANS = String.valueOf(total); 
                    jTeuros.setText(ANS);
                }

               // ANS= ANS.replace(",", ".");
                valor=Double.parseDouble(ANS);

                switch(caracterDigitado)
                {
                    case "IVA 23 %":
                        calc.iva(valor, 23);
                        valor = calc.total;
                        FormataString(valor);
                        break;
                    case "IVA 13 %":
                        calc.iva(valor, 13);
                        valor = calc.total;
                        FormataString(valor);
                        break;
                    case "IVA   6 %":
                        calc.iva(valor, 6);
                        valor = calc.total;
                        FormataString(valor);
                        break;
                }
            }
            
        }else if(this.estado == estadosCalculadora.OPERADORES){
            
            if(VerificaLimiteNumero(ANS))
            {
                if(ANS != null)
                {
                    BloqOperaDesconto(false);

                    ANS = jTeuros.getText();
                    ANS=VerificaAns();

                    fezTotal=false;
                    optemp=caracterDigitado;
                    if(OpAFazer())
                    {
                        CalcOpAnterior();
                        ANS = String.valueOf(total);
                        String format = String.format("%.2f", total);
                        ANS = String.valueOf(format);
                        ANS= ANS.replace(",", ".");
                        ANS = ANS + caracterDigitado;    
                        jTeuros.setText(ANS);
                    }else{
                        ANS = ANS + caracterDigitado;
                        jTeuros.setText(ANS);
                    }
                    jBponto.setEnabled(true);
                }
            }else{
                //Emite som de erro
                Toolkit.getDefaultToolkit().beep();
            }

        }else if(this.estado == estadosCalculadora.PONTO){
            
            if(VerificaLimiteNumero(ANS))
            {
            
               ANS=VerificaAns();
               if(ANS == null)
               {
                   ANS = "0.";
               }else{
                   
                   String a = jTeuros.getText();
                   String v = a.substring(a.length()-1,a.length());
                   
                   if((v.equals("+") || v.equals("*") || v.equals("-") || v.equals("/") && ANS.contains(".")))
                   {
                        ANS = ANS + v + "0.";
                   }else{
                       ANS = ANS + ".";
                   }

               }
               jTeuros.setText(ANS);
               jBponto.setEnabled(false);
            }else{
                //Emite som de erro
                Toolkit.getDefaultToolkit().beep();
            } 
        }else if(this.estado == estadosCalculadora.TOTAL){
            
            System.out.println("AUX = "+ ANS);
            if(ANS != null)
            {
                optemp="";
                jBponto.setEnabled(false);
                fezTotal=true;
                
                if(auxEstado.equals("descontos"))
                {
                       // ANS = jTeuros.getText();
                        aux = Double.parseDouble(ANS);
                        if(aux>100)
                        {
                            //Emite som de erro
                            Toolkit.getDefaultToolkit().beep();

                            jTeuros.setText("");
                            
                        }else{
                            calc.desconto(total, aux);
                            total = calc.total;

                            String format = String.format("%.2f", total);
                            ANS = String.valueOf(format);
                            ANS= ANS.replace(",", ".");
                            jTeuros.setText(ANS);
                            auxEstado="";
                            auxANS="";
                            str="";
                            BloqParaDescontos(true);
                            jBdesc.setEnabled(true);
                        }
                        
                        
                }

                if(OpAFazer())
                {
                    CalcOpAnterior();
                    String format = String.format("%.2f", total);
                    ANS = String.valueOf(format);
                    ANS= ANS.replace(",", ".");
                    ANS = ANS + optemp;
                    jTeuros.setText(ANS);
                }
            }
 
        }else if(this.estado == estadosCalculadora.LIMPA){
            jTeuros.setText("");
            jTescudos.setText("");
            jBponto.setEnabled(true);
            ANS = null;
            auxANS="";
            str="";
            total=0.0;
        }
        
        if(estado != estadosCalculadora.PONTO && ANS != null)
        {
            ConverteParaEscudos();
        }
   }
    
    private boolean VerificaLimiteNumero(String op)
    {
        
        if(op == null) {    //Primeira fase
            return true;
        }

        if(op.toString().length() < 15) {
            return true;
        }
        
        return false;
    }
    

    private String VerificaAns()
    {
        if(ANS != null)
        {
        
            String v = ANS.substring(ANS.length()-1,ANS.length());
            
            
            //if(ANS.contains("+") || ANS.contains("-") || ANS.contains("/") || ANS.contains("*") && !v.equals("."))    
            if(v.equals("+") || v.equals("-") || v.equals("/") || v.equals("*") && !v.equals("."))    
            {
                //Verifica se o ANS ja tem o ponto
                if((ANS.contains("+") || ANS.contains("*") || ANS.contains("/") || ANS.contains("-")) && !v.equals(optemp))
                {
                    ANS = ANS + "0";
                }else{
                    ANS = ANS.substring(0,ANS.length()-1);
                }
                
                
            }else if(v.equals("."))
            {
                jBponto.setEnabled(true);
                ANS = ANS.substring(0,ANS.length()-1);
            }else if(v.equals("+") || v.equals("-") ||  v.equals("*") || v.equals("/"))
            {
                jBponto.setEnabled(true);
                ANS = ANS.substring(0,ANS.length()-1);
            }
        }
        
        return ANS;
    }
    
    private void BloqOperaDesconto(boolean bloq)
    {
            jBdesc.setEnabled(bloq);
            jB23porcento.setEnabled(bloq);
            jB13porcento.setEnabled(bloq);
            jB6porcento.setEnabled(bloq);
            jBtotal.setEnabled(bloq);
    }
    
    private void CalcOpAnterior()
    {
        String valorCaixa;
        String[] t; 
        double n1, n2;
        
        //Obtem o que estÃ¡ na caixa
        valorCaixa = jTeuros.getText();
        
        if(valorCaixa.contains("+"))
        {
            t = valorCaixa.split(Pattern.quote ("+"));
            
            n1 = Double.parseDouble(t[0]);
            n2 = Double.parseDouble(t[1]);
            
            if(!t[0].equals("ANS"))
            {
                calc.soma(n1, n2);
            }else{
                calc.soma(total, n2);
            }
            
            total = calc.total;
            
        }else if(valorCaixa.contains("-")){
            t = valorCaixa.split(Pattern.quote ("-"));
            
            n1 = Double.parseDouble(t[0]);
            n2 = Double.parseDouble(t[1]);
            
            if(!t[0].equals("ANS"))
            {
                calc.subtrai(n1, n2);
            }else{
                calc.subtrai(total, n2);
            }

            total = calc.total;
            
        }else if(valorCaixa.contains("/")){
            t = valorCaixa.split(Pattern.quote ("/"));
            
            n1 = Double.parseDouble(t[0]);
            n2 = Double.parseDouble(t[1]);
            
            if(!t[0].equals("ANS"))
            {
                calc.divide(n1, n2);
            }else{
                calc.divide(total, n2);
            }

            total = calc.total;
        }else if(valorCaixa.contains("*")){
            t = valorCaixa.split(Pattern.quote ("*"));
            
            n1 = Double.parseDouble(t[0]);
            n2 = Double.parseDouble(t[1]);
            
            if(!t[0].equals("ANS"))
            {
                calc.multiplica(n1, n2);
            }else{
                calc.multiplica(total, n2);
            }

            total = calc.total;
        }
    
    }
    
    private boolean OpAFazer()
    {
        
        if(ANS.contains("+") || ANS.contains("-") || ANS.contains("*") || ANS.contains("/") && !ANS.contains("ANS"))
        {
            return true;
        }
        return false;
    }
    
    private void BloqParaDescontos(boolean bloq)
    {
        jBmais.setEnabled(bloq);
        jBmenos.setEnabled(bloq);
        jBmultiplicacao.setEnabled(bloq);
        jBdivisao.setEnabled(bloq);
        jB6porcento.setEnabled(bloq);
        jB23porcento.setEnabled(bloq);
        jB13porcento.setEnabled(bloq);
    }
    
    private void FormataString(double v)
    {
        ANS = String.valueOf(v);
        String format = String.format("%.2f", v);
        ANS = String.valueOf(format);
        ANS= ANS.replace(",", ".");
        jTeuros.setText(ANS);
    }

}


    
