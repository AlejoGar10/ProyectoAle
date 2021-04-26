package proyectof;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Accion extends javax.swing.JFrame {

    
    public Accion() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("ACCIONES DE DISPOSITIVO");
        jComboBox1.addItem("");
        jComboBox1.addItem("Computadora Portatil");
        jComboBox1.addItem("Tablet");
        jComboBox1.addItem("SmartWatch");
        jComboBox1.addItem("SmartPhone");
        jTextField1.setEnabled(false);
        jTextField2.setText("");
        jButton1.setEnabled(false);
    }

    public static String Dispo="";
    public static String Tipo="";
    public static String visi="";
    public static String corr="";
    public static String Numero="";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Acciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccionar Tipo de Dispositivos:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dispositivo", "Correo", "Visible", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(33);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Elegir Dispositivo:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Cancelar");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de Dispositivo:");

        jTextField2.setEditable(false);
        jTextField2.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addGap(103, 103, 103)
                            .addComponent(jButton2)
                            .addGap(125, 125, 125))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jSeparator1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String Select= (String) jComboBox1.getSelectedItem();
        
        if(Select.equals("Computadora Portatil")){
            jTextField1.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField2.setText(Select);
            try {
          if( jTextField2.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[100];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField2.getText(); 
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < Tipo.length(); j++)
                        target+= item[k].charAt(j);
                    
                        if( Tipo.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                            
                  for (int i = 0; i < 4; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
          
      }catch (IOException e) {
          
      }
        }
        if(Select.equals("Tablet")){
            jTextField1.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField2.setText(Select);
            try {
          if( jTextField2.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[100];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField2.getText(); 
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < Tipo.length(); j++)
                        target+= item[k].charAt(j);
                    
                        if( Tipo.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                  for (int i = 0; i < 4; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
          
      }catch (IOException e) {
          
      }
        }
        if(Select.equals("SmartWatch")){
            jTextField1.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField2.setText(Select);
            try {
          if( jTextField2.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[100];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField2.getText(); 
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < Tipo.length(); j++)
                        target+= item[k].charAt(j);
                    
                        if( Tipo.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                  for (int i = 0; i < 4; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
          
      }catch (IOException e) {
          
      }
        }
        if(Select.equals("SmartPhone")){
            jTextField1.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField2.setText(Select);
            try {
          if( jTextField2.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[100];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField2.getText(); 
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < Tipo.length(); j++)
                        target+= item[k].charAt(j);
                    
                        if( Tipo.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                  for (int i = 0; i < 4; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
          
      }catch (IOException e) {
          
      }
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
            if (jTextField1.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Error!", JOptionPane.ERROR_MESSAGE);
            else {
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] itemline = new String[100];
                String[] temp;
                Dispo = jTextField1.getText();
                
                boolean found = false;
                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    temp = itemline[x].split("\t");

                    if (Dispo.equals(temp[1])) {
                        visi=temp[3];
                        corr=temp[2];
                        Numero=temp[5];
                        found = true;
                    } else
                    x++;

                }
                
                rdfile.close();
                
                
            if (!found){
                JOptionPane.showMessageDialog(null, "Dispositivo no Enlistado!", "Error!", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                jTextField2.setText("");
            }else{
                     JOptionPane.showMessageDialog(null, "Dispositivo Correcto", "Ok", JOptionPane.INFORMATION_MESSAGE);
                Acciones a= new Acciones();
                a.setVisible(true);
                this.dispose();
                jTextField1.setText("");
                jTextField2.setText("");
                
                 }
                }
              
        } catch (IOException e) {}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int si=JOptionPane.showConfirmDialog(null, "Deseas Regresar?");
        if(si==JOptionPane.YES_OPTION){
      
        Menu a= new Menu  ();
        a.setVisible(true);
        a.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int Seleccion=jTable1.rowAtPoint(evt.getPoint());
       jTextField1.setText(String.valueOf(jTable1.getValueAt(Seleccion,0)));
    }//GEN-LAST:event_jTable1MouseClicked

   
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
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
