package proyectof;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static proyectof.Accion.Tipo;


public class DocCom extends javax.swing.JFrame {

    
    public DocCom() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("COMPARTIR DOCUMENTOS");
        jComboBox1.addItem("");
        jComboBox1.addItem("Computadora Portatil");
        jComboBox1.addItem("Tablet");
        jComboBox1.addItem("SmartWatch");
        jComboBox1.addItem("SmartPhone");
        jComboBox1.addItem("Auricular Inalambrico");
        
        Accion accion1=new Accion();
        jTextField4.setText(accion1.Tipo);
        
        Accion accion=new Accion();
        jTextField5.setText(accion.Dispo);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Compartir Documentos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccionar Tipo de Dispositivos:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Tipo de Dispositivo:");

        jTextField1.setEditable(false);
        jTextField1.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Documento:");

        jButton1.setText("Cargar Documento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Nombre de Documento:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Compartir con:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(160);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(33);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Compartir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Cancelar");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton7.setText("Regresar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setForeground(new java.awt.Color(240, 240, 240));
        jTextField4.setText("jTextField2");
        jTextField4.setBorder(null);

        jTextField5.setEditable(false);
        jTextField5.setForeground(new java.awt.Color(240, 240, 240));
        jTextField5.setText("jTextField2");
        jTextField5.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(42, 42, 42)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(74, 74, 74)
                        .addComponent(jButton2)
                        .addGap(76, 76, 76)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String Select= (String) jComboBox1.getSelectedItem();

        if(Select.equals("Computadora Portatil")){
            jTextField3.setEnabled(true);
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);
            try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField1.getText(); 
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
                        jTable2.setValueAt(temp[i+1],row,i);
                  
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
            jTextField3.setEnabled(true);
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);
            try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField1.getText(); 
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
                        jTable2.setValueAt(temp[i+1],row,i);
                  
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
            jTextField3.setEnabled(true);
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);
            try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField1.getText(); 
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
                        jTable2.setValueAt(temp[i+1],row,i);
                  
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
            jTextField3.setEnabled(true);
            jTextField2.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);
            try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                String[] item = new String[30];
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    
                    Tipo= jTextField1.getText(); 
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
                        jTable2.setValueAt(temp[i+1],row,i);
                  
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int si=JOptionPane.showConfirmDialog(null, "Deseas Regresar?");
        if(si==JOptionPane.YES_OPTION){

            Acciones  a= new Acciones  ();
            a.setVisible(true);
            a.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser jf= new JFileChooser ();
       jf.showOpenDialog(this);
       File archivo= jf.getSelectedFile();
       jTextField2.setText(archivo.getAbsolutePath());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Texto!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("Acciones2.txt"));

                String[] itemline = new String[50];
                String Pro= "";
                String Dis="";
                String Corr=jTextField5.getText();
                String Doc="Compartir Documento";
                String Sis = null;
                String fecha="";
                String Tipo=jTextField4.getText();
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    x++;
                }
                rdfile.close();

                if (!(x >= 100)) {
                    Pro = jTextField2.getText();

                    for (int j = 0; itemline[j] != null; j++) {
                        String[] temp = itemline[j].split("\t");

                        if (Pro.equals(temp[3])) {
                            
                            found = true;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(null, "Documento ya fue Enviado!\nSuggestion: Actualizar Datos?", "", JOptionPane.WARNING_MESSAGE);
                    } else {
                        Dis=jTextField3.getText();
                        SimpleDateFormat Fecha = new SimpleDateFormat("EEEE MMMM d hh:mm:ss yyyy");
                        fecha=(Fecha.format(new Date()));
                        itemline[x] = Doc + "\t" + Tipo + "\t" + Corr + "\t" + Pro + "\t" + Dis + "\t" + fecha;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("Acciones2.txt"));

                        for (int j = 0; itemline[j] != null; j++) {

                            wrfile.println(itemline[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Compartido!", " Ok ", JOptionPane.INFORMATION_MESSAGE);

                    }
                    Acciones a= new Acciones ();
                    a.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Inventario Lleno!", "Precaución", JOptionPane.WARNING_MESSAGE);
                }
            }

            jTextField1.setText("");
            

        } catch (IOException e) {
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Algún Dato es Inválido!", "Precaución!", JOptionPane.WARNING_MESSAGE);

            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
      int Seleccion=jTable2.rowAtPoint(evt.getPoint());
       jTextField3.setText(String.valueOf(jTable2.getValueAt(Seleccion,0)));
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(DocCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocCom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
