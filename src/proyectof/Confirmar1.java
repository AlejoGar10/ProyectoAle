
package proyectof;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static proyectof.Accion.Dispo;
import static proyectof.Accion.Numero;
import static proyectof.Accion.corr;
import static proyectof.AccionE.Nume;
import static proyectof.Llamada.Correo;
import static proyectof.Llamada.nume;
import static proyectof.RecLlam.Dispoo;
import static proyectof.RecLlam.Tell;


public class Confirmar1 extends javax.swing.JFrame {

   
    public Confirmar1() {
        initComponents();
         initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("CONFIRMAR");
        
        RecLlam accion=new RecLlam();
        jTextField1.setText(accion.Tell);
        RecLlam accion1=new RecLlam();
        jTextField6.setText(accion1.Hora);
        RecLlam accio=new RecLlam();
        jTextField8.setText(accio.Dispoo);
        Accion accion2=new Accion();
        jTextField3.setText(accion2.Dispo);
        
        Llamada Accion=new Llamada();
        jTextField7.setText(Accion.Correo);
        Accion accion3=new Accion();
        jTextField4.setText(accion3.corr);
    }
public static String Fechas="";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Se esta Recibiendo una Llamada");

        jTextField1.setEditable(false);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("del Numero");

        jButton1.setText("Recibir Llamada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rechazar Llamada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setForeground(new java.awt.Color(240, 240, 240));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setForeground(new java.awt.Color(240, 240, 240));
        jTextField4.setBorder(null);

        jTextField5.setEditable(false);
        jTextField5.setForeground(new java.awt.Color(240, 240, 240));
        jTextField5.setBorder(null);

        jTextField6.setEditable(false);
        jTextField6.setForeground(new java.awt.Color(240, 240, 240));
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setForeground(new java.awt.Color(240, 240, 240));
        jTextField7.setBorder(null);

        jTextField8.setEditable(false);
        jTextField8.setForeground(new java.awt.Color(240, 240, 240));
        jTextField8.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(315, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Numero!", "Error!", JOptionPane.ERROR_MESSAGE);
           
            else{
                BufferedReader rdfile= new BufferedReader( new FileReader("Externas1.txt"));

                String[] itemline= new String[50];
                String temp[];
                
                String search= "", Edit="", Pro="", Corr="", Correo="", Contra="", Confi="";
                search= "";
                String Tipo="Llamada Contestada";
                String fecha="";
                int x=0;  
                boolean found= false;
                search=jTextField6.getText();
                
               SimpleDateFormat Fecha = new SimpleDateFormat("EEEE MMMM d hh:mm:ss yyyy");
                        fecha=(Fecha.format(new Date()));
                        Fechas=fecha;
                if( (!(Dispo.equals(""))) || (!(Numero.equals(""))) || (!(Dispoo.equals("")))|| (!(Tell.equals(""))) || (!(corr.equals("")))){
                    while(( itemline[x]= rdfile.readLine()) != null){
                        temp= itemline[x].split("\t");
                        jTextField6.setText(search);
                        if( search.equals( temp[6])){
                            if( Dispo.equals(""))
                                Dispo= temp[1];
                            
                            if(Numero.equals(""))
                               Numero=temp[2];
                            
                            if( Dispoo.equals(""))
                                Dispoo= temp[3];

                            if( Tell.equals(""))
                                Tell= temp[4];
                            
                            if( corr.equals(""))
                                corr= temp[4];
                            
                         
                            itemline[x]= Tipo+"\t"+Dispo+"\t"+ Numero+"\t"+Dispoo+"\t"+Tell+"\t"+corr+"\t"+Fechas;
                            found= true;
                        }
                        x++;


                    }
                    rdfile.close();
                    
                    if( found ){
                        PrintWriter wrfile= new PrintWriter( new FileWriter("Externas1.txt"));

                        for( int j=0; itemline[j] != null; j++)
                            wrfile.println( itemline[j]);

                        wrfile.close();

                        
                        JOptionPane.showMessageDialog(null, "Contestada!");
                    } else
                        JOptionPane.showMessageDialog(null, "Dispositivo no Encontrado!");
                    
                    jTextField1.setText("");
                    Acciones a= new Acciones ();
                    a.setVisible(true);
                    this.dispose();
                    
                } else
                    JOptionPane.showMessageDialog( null, "No hay Cambios Aún!");
                 
                }     
        }
       catch(IOException e){} catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Algún Dato es Inválido!");
            
                    jTextField1.setText("");
                   
                   
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       RecLlam accion=new RecLlam();
         jTextField1.setText(accion.Tell);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Numero!", "Error!", JOptionPane.ERROR_MESSAGE);
           
            else{
                BufferedReader rdfile= new BufferedReader( new FileReader("Externas1.txt"));

                String[] itemline= new String[50];
                String temp[];
                
                String search= "", Edit="", Pro="", Corr="", Correo="", Contra="", Confi="";
                search= "";
                String Tipo="Llamada Rechazada";
                String fecha="";
                int x=0;  
                boolean found= false;
                search=jTextField6.getText();
                
               SimpleDateFormat Fecha = new SimpleDateFormat("EEEE MMMM d hh:mm:ss yyyy");
                        fecha=(Fecha.format(new Date()));
                        Fechas=fecha;
                if( (!(Dispo.equals(""))) || (!(Numero.equals(""))) || (!(Dispoo.equals("")))|| (!(Tell.equals(""))) || (!(corr.equals("")))){
                    while(( itemline[x]= rdfile.readLine()) != null){
                        temp= itemline[x].split("\t");
                        jTextField6.setText(search);
                        if( search.equals( temp[6])){
                            if( Dispo.equals(""))
                                Dispo= temp[1];
                            
                            if(Numero.equals(""))
                               Numero=temp[2];
                            
                            if( Dispoo.equals(""))
                                Dispoo= temp[3];

                            if( Tell.equals(""))
                                Tell= temp[4];
                            
                            if( corr.equals(""))
                                corr= temp[4];
                            
                         
                            itemline[x]= Tipo+"\t"+Dispo+"\t"+ Numero+"\t"+Dispoo+"\t"+Tell+"\t"+corr+"\t"+Fechas;
                            found= true;
                        }
                        x++;


                    }
                    rdfile.close();
                    
                    if( found ){
                        PrintWriter wrfile= new PrintWriter( new FileWriter("Externas1.txt"));

                        for( int j=0; itemline[j] != null; j++)
                            wrfile.println( itemline[j]);

                        wrfile.close();

                        
                        JOptionPane.showMessageDialog(null, "Rechazada!");
                    } else
                        JOptionPane.showMessageDialog(null, "Dispositivo no Encontrado!");
                    
                    jTextField1.setText("");
                    Acciones a= new Acciones ();
                    a.setVisible(true);
                    this.dispose();
                    
                } else
                    JOptionPane.showMessageDialog( null, "No hay Cambios Aún!");
                 
                }     
        }
       catch(IOException e){} catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Algún Dato es Inválido!");
            
                    jTextField1.setText("");
                   
                   
     }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Confirmar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
