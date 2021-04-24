package proyectof;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Audifono extends javax.swing.JFrame {

    
    public Audifono() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("DISPOSITIVOS");
        jComboBox1.addItem("");
        jComboBox1.addItem("Computadora Portatil");
        jComboBox1.addItem("Tablet");
        jComboBox1.addItem("SmartWatch");
        jComboBox1.addItem("SmartPhone");       
        jTextField3.setText("");
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Crear Dispositivos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccionar Tipo de Dispositivo:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre de Dispositivo:");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Dispositivo para Sincronizar:");

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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(33);
        }

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tipo de Dispositivo:");

        jTextField3.setEditable(false);
        jTextField3.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Encendido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(94, 94, 94)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(jCheckBox2)
                                .addGap(66, 66, 66)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(1, 1, 1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos2.txt"));

                String[] itemline = new String[50];
                String Pro= "";
                String Corr="";
                String Sis="";
                String fecha="";
                String Tipo="Auricular";
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    x++;
                }
                rdfile.close();

                if (!(x >= 50)) {
                    Pro = jTextField1.getText();

                    for (int j = 0; itemline[j] != null; j++) {
                        String[] temp = itemline[j].split("\t");

                        if (Pro.equals(temp[2])) {
                            found = true;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(null, "Dispositivo ya Existente!\nSuggestion: Actualizar Datos?", "", JOptionPane.WARNING_MESSAGE);
                    } else {
                        Corr= jTextField2.getText();
                        
                        if(jCheckBox2.isSelected()){
                            Sis="Encendido";
                        }else{
                            Sis="Encendido";
                        }                       
                        SimpleDateFormat Fecha = new SimpleDateFormat("EEEE MMMM d hh:mm:ss yyyy");
                        fecha=(Fecha.format(new Date()));
                        itemline[x] = Tipo + "\t" + Pro + "\t" + Corr + "\t" + Sis + "\t" + fecha ;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("Dispositivos2.txt"));

                        for (int j = 0; itemline[j] != null; j++) {

                            wrfile.println(itemline[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Agregado!", " Ok ", JOptionPane.INFORMATION_MESSAGE);
            Dispositivos a= new Dispositivos ();
            a.setVisible(true);
            this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Inventario Lleno!", "Precaución", JOptionPane.WARNING_MESSAGE);
                }
            }

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(false);
            
        } catch (IOException e) {
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Algún Dato es Inválido!", "Precaución!", JOptionPane.WARNING_MESSAGE);

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(false);
            

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
String Select= (String) jComboBox1.getSelectedItem();

        if(Select.equals("Computadora Portatil")){
            jTextField1.setEnabled(true);
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField3.setText(Select);
            try {
          if( jTextField3.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                String search= "";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    search= jTextField3.getText(); 
                    
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                        if( search1.equals( temps[4]))
                            
                        if( search.equals( target))
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
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField3.setText(Select);
            try {
          if( jTextField3.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                String search= "";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    search= jTextField3.getText(); 
                    
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                        if( search1.equals( temps[4]))
                            
                        if( search.equals( target))
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
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField3.setText(Select);
            try {
          if( jTextField3.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                String search= "";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    search= jTextField3.getText(); 
                    
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                        if( search1.equals( temps[4]))
                            
                        if( search.equals( target))
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
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField3.setText(Select);
            try {
          if( jTextField3.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable1.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                String search= "";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    search= jTextField3.getText(); 
                    
                     for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                        if( search1.equals( temps[4]))
                            
                        if( search.equals( target))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int si=JOptionPane.showConfirmDialog(null, "Deseas Regresar?");
        if(si==JOptionPane.YES_OPTION){
      
        Dispositivos a= new Dispositivos  ();
        a.setVisible(true);
        a.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int Seleccion=jTable1.rowAtPoint(evt.getPoint());
         jTextField2.setText(String.valueOf(jTable1.getValueAt(Seleccion,0)));
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Audifono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Audifono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Audifono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Audifono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Audifono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
