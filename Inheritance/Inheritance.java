package Inheritance;

import Commons.Weights;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class Inheritance extends javax.swing.JFrame {

    ArrayList<String> classNames = new ArrayList<>();
    
    Inheritance_Weight in;
    
   
    public int noInheritance = 0;
    public int oneUserDefinedInheritance = 0;
    public int twoUserDefinedInheritance = 0;
    public int threeUserDefinedInheritance = 0;
    public int moreThanThreeUserDefinedInheritance = 0;
    

   
    public Inheritance() {
        initComponents();
    }

    public Inheritance(String para) {
        initComponents();

        jTextArea1.setText(para);
    }

    Inheritance(String total, int totalIndirect, int totalDirect, int totalCi) {
        throw new UnsupportedOperationException("Not support");
    }

    
    @SuppressWarnings("unchecked")

    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 107, 179));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel3.setText("Measuring the complexity of a program statement due to inheritance  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jLabel4.setText("Inheritance");

        jButton11.setBackground(new java.awt.Color(0, 107, 179));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton11.setText("Load Data in Table View");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Count", "Class Name", "No Of Direct Inheritance", "No of Indirect Inheritance", "Total Inheritance", "Ci"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Calculate Weight");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(536, 536, 536))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    public int directInheritance(String classname) {

        int di = 0;
        try {

            
            Reader inputString = new StringReader(jTextArea1.getText().toString());

            BufferedReader breader11 = new BufferedReader(inputString);
            String line1;

            while ((line1 = breader11.readLine()) != null) {
                String[] word = line1.split("\\s+");
                for (int x = 0; x < word.length; x++) {
                    if ("class".equals(word[x])) {
                        if (word.length > 4) {
                            if (classname.equals(word[x + 1])) {
                                di++;
                            }
                        }
                    }
                }
            }
            breader11.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return di;
    }

    public int indeirectInheritance(String extendclass, String classname) {
        String line = null;
        int indi = 0;

        try {

            Reader inputString = new StringReader(jTextArea1.getText().toString());
            BufferedReader br = new BufferedReader(inputString);
            while ((line = br.readLine()) != null) {

                String[] words1 = line.split("\\s+");

                if (directInheritance(classname) == 0) {
                    indi = 0;
                }
                if (directInheritance(classname) == 1) {
                    if (directInheritance(extendclass) == 0) {
                        indi = 0;
                    } else {
                        indi = 1;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return indi;
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.showOpenDialog(null);
        int aa = chooser.showOpenDialog(null);
        System.out.println(aa);
        File[] files = chooser.getSelectedFiles();

        int filearr = files.length;
        System.out.println(filearr);

        String fileNames = files[0].getAbsolutePath();
        System.out.println("length of files[] is:" + files.length);

        jTextField1.setText(fileNames);

        for (File f : files) {
            FileReader reader = null;
            try {
                reader = new FileReader(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Inheritance.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(reader);
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    jTextArea1.append(line + "\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(Inheritance.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Inheritance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultTableModel modelReset = (DefaultTableModel) jTable1.getModel();
        modelReset.setRowCount(0);
        String[] lines = jTextArea1.getText().split("\n");
        int lineCount = lines.length;
        classNames = new ArrayList<>();
        int parentIindex = 0;

            for (String line : lines) {
                int ndi = 0, nIndi = 0, ci = 0, tot = 0, total = 0, count = 0;
                String[] words = line.split("\\s+");

                String superclass;
                
                    for (int i = 0; i < words.length; i++) {

                        if ("class".equals(words[i])) {

                            ndi = directInheritance(words[i + 1].toString());
                            superclass = words[i + 1].toString();

                            if (words.length > 4) {
                                if ("extends".equals(words[i + 2])) {

                                    System.out.println(words[i + 1] + " Indirect Inheritance = " + indeirectInheritance(words[i + 3], words[i + 1]));
                                    nIndi = indeirectInheritance(words[i + 3], words[i + 1]);
                                }
                            } else {
                                nIndi = 0;
                                System.out.println(words[i + 1] + " Indirect Inheritance = " + nIndi);
                            }

                            String k;
                            k = words[i + 1];
                            
                            classNames.add(k);
                            int weigthDueToInherit = this.calculateWeightDueToNumOfInheritance(k);
                            count++;
                            ArrayList<String> out = new ArrayList<>();
                            ndi *= weigthDueToInherit;
                            nIndi *= weigthDueToInherit;
                            total = ndi + nIndi;
                            System.out.println(words[i + 1] + " total = " + total);
                            ci = ndi + nIndi;
                            System.out.println(words[i + 1] + " Ci = " + ci);

                            tot = ci + tot;
                            out.add(k);
                            out.add(Integer.toString(ndi));
                            out.add(Integer.toString(nIndi));
                            out.add(Integer.toString(ci));
                            out.add(Integer.toString(total));
                            System.out.println("\n" + out + "\n");
                            
                            Object[] row = new Object[]{++parentIindex, k, ndi, nIndi, total, ci};
                            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                            model.addRow(row);
                        }
                    }
            }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        
        String data = "<html><h3>Weight related to inheritance factor: </h3><br><br>"
        + "<b>tot = ndi + nIndi </b><br><br>"
        + "A class with no inheritance (direct or indirect) = 0 <br>"
        + "A class inheriting (directly or indirectly) from one user-defined class = 1 <br>"
        + "A class inheriting (directly or indirectly) from two user-defined classes = 2 <br>"
        + "A class inheriting (directly or indirectly) from three user-defined classes = 3 <br>"
        + "A class inheriting  (directly or indirectly) from more than three user-defined classes = 4 </html>";
        
        
        int x = JOptionPane.showConfirmDialog(null, data, "Code Complexity due to Inheritance", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (x ==0){
                
                in = new Inheritance_Weight();
                in.setVisible(true);
        }
    }

    public void updateWeights(){
       noInheritance = in.noInheritance;
       oneUserDefinedInheritance = in.oneUserDefinedInheritance ;
       twoUserDefinedInheritance = in.twoUserDefinedInheritance;
       threeUserDefinedInheritance = in.threeUserDefinedInheritance;
       moreThanThreeUserDefinedInheritance = in.moreThanThreeUserDefinedInheritance;
     }
    
    public int calculateWeightDueToNumOfInheritance(String className) {
        int weight = 0;
        int numOfFounds = 0;
        for (int i = 0; i < classNames.size(); i++) {
            if (className.equals(classNames.get(i))) {
                numOfFounds += 1;
            }
        }
        
        switch (numOfFounds) {
            case 0:
                return Weights.oneUserDefinedInheritance;
            case 1:
                return Weights.twoUserDefinedInheritance;
            case 2:
                return Weights.threeUserDefinedInheritance;
            default: {
                if (numOfFounds > 3) {
                    return Weights.moreThanThreeUserDefinedInheritance;
                }
            }
        }
        return this.noInheritance;
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
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    
}
