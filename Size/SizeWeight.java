/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Size;

import Commons.Weights;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class SizeWeight extends javax.swing.JFrame {

    
    public SizeWeight() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabelSizeW = new javax.swing.JLabel();
        jButtonSizeW = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSizeW = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSizeW.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabelSizeW.setText("Weights related to the Size Factor");

        jButtonSizeW.setBackground(new java.awt.Color(102, 204, 255));
        jButtonSizeW.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButtonSizeW.setText("Save");
        jButtonSizeW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSizeWActionPerformed(evt);
            }
        });

        jTableSizeW.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jTableSizeW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Keyword", "1"},
                {"Identifier", "1"},
                {"Operator", "1"},
                {"Numerical Value", "1"},
                {"String literal", "1"}
            },
            new String [] {
                "Programe Components", "Weight"
            }
        ));
        jScrollPane2.setViewportView(jTableSizeW);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jButtonSizeW, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabelSizeW, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelSizeW, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonSizeW, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }

    private void jButtonSizeWActionPerformed(java.awt.event.ActionEvent evt) {
             DefaultTableModel model = (DefaultTableModel)jTableSizeW.getModel();

            Weights.keywordSize = Integer.parseInt(model.getValueAt(0, 1).toString());
            Weights.identifierSize = Integer.parseInt(model.getValueAt(1, 1).toString());
            Weights.operatorSize = Integer.parseInt(model.getValueAt(2, 1).toString());
            Weights.numericalValueSize = Integer.parseInt(model.getValueAt(3, 1).toString());
            Weights.stringliteralSize = Integer.parseInt(model.getValueAt(4, 1).toString());

        dispose();
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SizeWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SizeWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SizeWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SizeWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SizeWeight().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButtonSizeW;
    private javax.swing.JLabel jLabelSizeW;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSizeW;
    
}
