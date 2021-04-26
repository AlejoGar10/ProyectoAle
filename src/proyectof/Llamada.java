package proyectof;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static proyectof.AccionE.Corr;
import static proyectof.AccionE.Dispo;
import static proyectof.AccionE.Nume;



public class Llamada extends javax.swing.JFrame {

    
    public Llamada() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("LLAMADAS");
        AccionE accion1=new AccionE();
        jTextField2.setText(accion1.Nume);
        AccionE accion=new AccionE();
        jTextField3.setText(accion.Dispo);
        AccionE accion2=new AccionE();
        jTextField4.setText(accion2.Corr);
        try {
                
                    for (int r = 0; r < 30; r++) { 
                        for (int c = 0; c < 2; c++) { 
                            jTable1.setValueAt("", r, c);
                        }
                    }
                    BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos.txt"));

                    String[] item = new String[30];
                    boolean same= false, found=false;
                    String  target="";
                    String tipo="SmartPhone";
                    int x = 0;  int row=0;
                    while ((item[x] = rdfile.readLine()) != null)
                    x++;

                    rdfile.close();

                    
                    for( int k=0; item[k] != null; k++){
                        same= false;
                        target="";
                        for( int j=0; j < tipo.length(); j++)
                        target+= item[k].charAt(j);
                        String[] temps=item[k].split("\t");
                        
                        if( tipo.equals( target))
                            same=true;
                        
                        if( same){
                            String[] temp=item[k].split("\t");
                            
                            for (int i = 0; i < 2; i++)
                            jTable1.setValueAt(temp[1],row,0);
                            jTable1.setValueAt(temp[5],row,1);
                            jTable1.setValueAt(temp[2],row,2);
                            row++;
                            
                        }
                    found=true;
                    
                    if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }catch (IOException e) {}
    }
    
    public static String nume="";
    public static String Correo="";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Llamada Telefonica");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dispositivo", "Numero Telefonico", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Numero Destino:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Llamar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Cancelar");

        jTextField1.setEditable(false);
        jTextField1.setBorder(null);

        jTextField2.setEditable(false);
        jTextField2.setForeground(new java.awt.Color(240, 240, 240));
        jTextField2.setBorder(null);

        jTextField3.setEditable(false);
        jTextField3.setForeground(new java.awt.Color(240, 240, 240));
        jTextField3.setBorder(null);

        jTextField4.setEditable(false);
        jTextField4.setForeground(new java.awt.Color(240, 240, 240));
        jTextField4.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int Seleccion=jTable1.rowAtPoint(evt.getPoint());
        jTextField1.setText(String.valueOf(jTable1.getValueAt(Seleccion,1)));
        nume=(String.valueOf(jTable1.getValueAt(Seleccion,0)));
        Correo=(String.valueOf(jTable1.getValueAt(Seleccion,2)));
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Numero!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("Externas.txt"));

                String[] itemline = new String[50];
                String Pro= "";
                String corr=jTextField2.getText();
                String Mus="Llamada Saliente";
                String Si = null ;
                String Sis = null;
                String fecha="";
                String Tipo=jTextField3.getText();
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    
                    x++;
                }
                rdfile.close();

                if (!(x >= 100)) {
                    Pro = jTextField1.getText();

                    for (int j = 0; itemline[j] != null; j++) {
                        String[] temp = itemline[j].split("\t");

                        if (Pro.equals(Nume)) {
                            found = true;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(null, "El Numero es el Mismo!\nSuggestion: Actualizar Datos?", "", JOptionPane.WARNING_MESSAGE);
                    } else {
                        SimpleDateFormat Fecha = new SimpleDateFormat("EEEE MMMM d hh:mm:ss yyyy");
                        fecha=(Fecha.format(new Date()));
                        
                        itemline[x] = Mus + "\t" + Tipo + "\t" + corr + "\t" + nume + "\t" + Pro + "\t" + Correo +"\t"+ fecha;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("Externas.txt"));

                        for (int j = 0; itemline[j] != null; j++) {

                            wrfile.println(itemline[j]);
                        }

                       
                        SimpleDateFormat Fechaz = new SimpleDateFormat("EEEE MMMM d hh:mm:ss yyyy");
                        fecha=(Fecha.format(new Date()));
                        
                        itemline[x] = Mus + "\t" + Tipo + "\t" + corr + "\t" + nume + "\t" + Pro + "\t" + Correo +"\t"+ fecha;

                        PrintWriter wrfiles = new PrintWriter(new FileWriter("Externas1.txt"));

                        for (int j = 0; itemline[j] != null; j++) {

                            wrfiles.println(itemline[j]);
                        }

                        wrfiles.close();
                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Llamando!", " Ok ", JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Inventario Lleno!", "Precaución", JOptionPane.WARNING_MESSAGE);
                }
            }

            jTextField1.setText("");
            AccionesExt a= new AccionesExt ();
            a.setVisible(true);
            this.dispose();
            
        } catch (IOException e) {
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Algún Dato es Inválido!", "Precaución!", JOptionPane.WARNING_MESSAGE);

            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int si=JOptionPane.showConfirmDialog(null, "Deseas Regresar?");
        if(si==JOptionPane.YES_OPTION){

            AccionesExt  a= new AccionesExt  ();
            a.setVisible(true);
            a.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llamada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
