package JavaCourseworkUP847948;

public class newPizzaForm extends javax.swing.JFrame {
    private Order order;
    private Pizza pizza;
    public newPizzaForm(Order order) {
        initComponents();
        this.order = order;
        this.pizza = new Pizza(
                sizeComboBox.getSelectedItem().toString(), 
                crustComboBox.getSelectedItem().toString(),
                SauceComboBox.getSelectedItem().toString(),
                T1ComboBox.getSelectedItem().toString(),
                T2ComboBox.getSelectedItem().toString()
                );
        jTextArea2.setText(pizza.getInvoice());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sizeComboBox = new javax.swing.JComboBox<>();
        crustComboBox = new javax.swing.JComboBox<>();
        SauceComboBox = new javax.swing.JComboBox<>();
        T1ComboBox = new javax.swing.JComboBox<>();
        T2ComboBox = new javax.swing.JComboBox<>();
        CancelButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Size: ");

        jLabel2.setText("Crust:");

        jLabel3.setText("Sauce:");

        jLabel4.setText("Topping 1:");

        jLabel5.setText("Topping 2:");

        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        sizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboBoxActionPerformed(evt);
            }
        });
        sizeComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sizeComboBoxPropertyChange(evt);
            }
        });

        crustComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thin", "Deep", "Stuffed" }));
        crustComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crustComboBoxActionPerformed(evt);
            }
        });
        crustComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                crustComboBoxPropertyChange(evt);
            }
        });

        SauceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tomato", "Pesto" }));
        SauceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SauceComboBoxActionPerformed(evt);
            }
        });

        T1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Olives", "Extra_Cheese", "Chilli", "Pepperoni", "Mushroom", "Rocket", "Jalapenos", "Onion", "Anchovy" }));
        T1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ComboBoxActionPerformed(evt);
            }
        });

        T2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Olives", "Extra_Cheese", "Chilli", "Pepperoni", "Mushroom", "Rocket", "Jalapenos", "Onion", "Anchovy" }));
        T2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ComboBoxActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel ");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Add to Order");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addContainerGap(232, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(T2ComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 161, Short.MAX_VALUE)
                                    .addComponent(T1ComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sizeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crustComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SauceComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(crustComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SauceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(T1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(T2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(AddButton))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        order.add(
                sizeComboBox.getSelectedItem().toString(), 
                crustComboBox.getSelectedItem().toString(),
                SauceComboBox.getSelectedItem().toString(),
                T1ComboBox.getSelectedItem().toString(),
                T2ComboBox.getSelectedItem().toString()
                );
        orderForm frame = new orderForm(this.order); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(orderForm.EXIT_ON_CLOSE); 
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_AddButtonMouseClicked

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        orderForm frame = new orderForm(this.order); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(orderForm.EXIT_ON_CLOSE); 
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void sizeComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sizeComboBoxPropertyChange

    }//GEN-LAST:event_sizeComboBoxPropertyChange

    private void crustComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_crustComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_crustComboBoxPropertyChange

    private void sizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeComboBoxActionPerformed
        this.pizza.setSize(sizeComboBox.getSelectedItem().toString());
        jTextArea2.setText(pizza.getInvoice());
    }//GEN-LAST:event_sizeComboBoxActionPerformed

    private void crustComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crustComboBoxActionPerformed
        this.pizza.setCrust(crustComboBox.getSelectedItem().toString());
        jTextArea2.setText(pizza.getInvoice());
    }//GEN-LAST:event_crustComboBoxActionPerformed

    private void SauceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SauceComboBoxActionPerformed
        this.pizza.setSauce(SauceComboBox.getSelectedItem().toString());
        jTextArea2.setText(pizza.getInvoice());
    }//GEN-LAST:event_SauceComboBoxActionPerformed

    private void T1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ComboBoxActionPerformed
        this.pizza.setTopping1(T1ComboBox.getSelectedItem().toString());
        jTextArea2.setText(pizza.getInvoice());
    }//GEN-LAST:event_T1ComboBoxActionPerformed

    private void T2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ComboBoxActionPerformed
        this.pizza.setTopping2(T2ComboBox.getSelectedItem().toString());
        jTextArea2.setText(pizza.getInvoice());
    }//GEN-LAST:event_T2ComboBoxActionPerformed

    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(newPizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPizzaForm(order).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> SauceComboBox;
    private javax.swing.JComboBox<String> T1ComboBox;
    private javax.swing.JComboBox<String> T2ComboBox;
    private javax.swing.JComboBox<String> crustComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> sizeComboBox;
    // End of variables declaration//GEN-END:variables
}
