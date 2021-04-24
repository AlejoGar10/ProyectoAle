package proyectof;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Audifono1 extends javax.swing.JFrame {

   
    public Audifono1() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("DISPOSITIVOS");
        jComboBox1.addItem("");
        jComboBox1.addItem("Computadora Portatil");
        jComboBox1.addItem("Tablet");
        jComboBox1.addItem("SmartWatch");
        jComboBox1.addItem("SmartPhone");
        jTextField3.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField8.setEnabled(false);
        jTextField5.setText("Auricular");
        jTextField1.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Editar Dispositivos");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Tipo de Dispositivos:");

        jTextField5.setEditable(false);
        jTextField5.setToolTipText("");
        jTextField5.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Dispositivo a Editar:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Apagado:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre de Dispositivo:");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Dispositivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Dispositivo para Sincronizar:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccionar Tipo de Dispositivos:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
                "Dispositivo", "Dispositivo Sincronizado", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField5)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                        .addComponent(jTextField7)
                                        .addComponent(jTextField8)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(124, 124, 124)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(434, 434, 434)
                                .addComponent(jLabel12)
                                .addGap(30, 30, 30)
                                .addComponent(jCheckBox4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(113, 113, 113)
                                .addComponent(jButton5)
                                .addGap(81, 81, 81)
                                .addComponent(jButton6)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int si=JOptionPane.showConfirmDialog(null, "Deseas Regresar?");
        if(si==JOptionPane.YES_OPTION){

            Dispositivos  a= new Dispositivos  ();
            a.setVisible(true);
            a.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
            this.dispose();
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            if( jTextField3.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Ingrese Dispositivo", "Error!", JOptionPane.ERROR_MESSAGE);

            else{
                BufferedReader rdfile= new BufferedReader( new FileReader("Dispositivos2.txt"));

                String[] itemline= new String[30];
                String temp[];

                String search= "", Edit="", Pro="", Corr="", Si=null;
                search= jTextField3.getText();
                String Tipo=jTextField5.getText();
                String fecha="";
                int Num=0;
                int x=0;
                boolean found= false;
                Pro= jTextField7.getText();
                Corr=jTextField8.getText();
               
                if(jCheckBox4.isSelected()){
                   Si="Apagado";
                }else{
                    Si="Encendido";
                }    
                 SimpleDateFormat Fecha = new SimpleDateFormat("EEEE MMMM d hh:mm:ss yyyy");
                 fecha=(Fecha.format(new Date()));
                if( (!(Pro.equals("")))||(!(Corr.equals("")))||(!(Si.equals(""))) ){
                    while(( itemline[x]= rdfile.readLine()) != null){
                        temp= itemline[x].split("\t");
                        jTextField3.setText(search);
                        if( search.equals( temp[1])){
                            if( Pro.equals(""))
                            Pro= temp[1];
                            
                            if( Corr.equals(""))
                            Corr= temp[2];
                            
                            if( Si.equals(""))
                            Si= temp[3];

                            

                            itemline[x]= Tipo+"\t"+Pro+"\t"+Corr+"\t"+Si+"\t"+fecha;
                            found= true;
                        }
                        x++;

                    }
                    rdfile.close();

                    if( found ){
                        PrintWriter wrfile= new PrintWriter( new FileWriter("Dispositivos2.txt"));

                        for( int j=0; itemline[j] != null; j++)
                        wrfile.println( itemline[j]);

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Cambios Guardados!");
                    } else
                    JOptionPane.showMessageDialog(null, "Bodega no Encontrado!");

                    jTextField1.setText("");
                    jTextField3.setText("");
                    jTextField7.setText("");
                    jTextField8.setText("");
                    jTextField3.setEnabled(false);
                    jTextField7.setEnabled(false);
                    jTextField8.setEnabled(false);
                } else
                JOptionPane.showMessageDialog( null, "No hay Cambios Aún!");
            }

        }catch(IOException e){} catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Algún Dato es Inválido!");

            jTextField1.setText("");
            jTextField3.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField3.setEnabled(false);
            jTextField7.setEnabled(false);
            jTextField8.setEnabled(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField3.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String Select= (String) jComboBox1.getSelectedItem();

        if(Select.equals("Computadora Portatil")){
            jTextField3.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField8.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);
            try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 3; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 1; c++) { //initializing column
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
               
                search=jTextField1.getText();
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
                  for (int i = 0; i < 1; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
               BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos2.txt"));

                String[] item = new String[30];
                String search= "Auricular";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                       
                            
                        if( search.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                  for (int i = 0; i < 3; i++) 
                        jTable2.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
      }catch (IOException e) {
          
      }
        }
        if(Select.equals("Tablet")){
            jTextField3.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField8.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 3; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 1; c++) { //initializing column
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
               
                search=jTextField1.getText();
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
                  for (int i = 0; i < 1; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
               BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos2.txt"));

                String[] item = new String[30];
                String search= "Auricular";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                       
                            
                        if( search.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                  for (int i = 0; i < 3; i++) 
                        jTable2.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
      }catch (IOException e) {
          
      }
            
        }
        if(Select.equals("SmartWatch")){
            jTextField3.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField8.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);
            try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 3; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 1; c++) { //initializing column
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
               
                search=jTextField1.getText();
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
                  for (int i = 0; i < 1; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
               BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos2.txt"));

                String[] item = new String[30];
                String search= "Auricular";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                       
                            
                        if( search.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                  for (int i = 0; i < 3; i++) 
                        jTable2.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
      }catch (IOException e) {
          
      }
        }
        if(Select.equals("SmartPhone")){
             jTextField3.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField8.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField1.setText(Select);
            try {
          if( jTextField1.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Ingrese Dispositivo!", "Algo está mal!", JOptionPane.ERROR_MESSAGE);
          else{
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 3; c++) { //initializing column
                        jTable2.setValueAt("", r, c);
                    }
                }
                for (int r = 0; r < 30; r++) { //initializing row
                    for (int c = 0; c < 1; c++) { //initializing column
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
               
                search=jTextField1.getText();
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
                  for (int i = 0; i < 1; i++) 
                        jTable1.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
               BufferedReader rdfile = new BufferedReader(new FileReader("Dispositivos2.txt"));

                String[] item = new String[30];
                String search= "Auricular";
                String search1="Encendido";
                boolean same= false, found=false;
                String  target="";
                int x = 0;  int row=0;
                while ((item[x] = rdfile.readLine()) != null) 
                   x++;
                
                rdfile.close();
                
                    for( int k=0; item[k] != null; k++){
                         same= false;
                         target="";
                    for( int j=0; j < search.length(); j++)
                        target+= item[k].charAt(j);
                    String[] temps=item[k].split("\t");
                    
                       
                            
                        if( search.equals( target))
                            same=true;
                        if( same){
                            String[] temp=item[k].split("\t");
                  for (int i = 0; i < 3; i++) 
                        jTable2.setValueAt(temp[i+1],row,i);
                  row++;
                  found=true;
                  }

                        }
                     if( !found)
                    JOptionPane.showMessageDialog(null, "Dispositivo no Ingresado", "ERROR", JOptionPane.ERROR_MESSAGE);
      }catch (IOException e) {
          
      }
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       int Seleccion=jTable2.rowAtPoint(evt.getPoint());
       jTextField3.setText(String.valueOf(jTable2.getValueAt(Seleccion,0)));
       jTextField8.setText(String.valueOf(jTable2.getValueAt(Seleccion,1)));
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int Seleccion=jTable1.rowAtPoint(evt.getPoint());
       jTextField8.setText(String.valueOf(jTable1.getValueAt(Seleccion,0)));
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
            java.util.logging.Logger.getLogger(Audifono1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Audifono1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Audifono1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Audifono1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Audifono1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
