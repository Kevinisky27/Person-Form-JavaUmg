
import conections.MySQLConector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinalexanderlimarecinos
 */
public class PersonForm extends javax.swing.JFrame {
   

    MySQLConector ConectorDB = new MySQLConector();
    Connection conexiondb = ConectorDB.Conectar();
    int SelecPerson;
    
    
    /**
     * Creates new form PersonForm
     */
    public PersonForm() {
        initComponents();
        MostrarDatosDB();
        
        // Comando para centrar la ventana al ejecutarla se centre siempre en la pantalla.  
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrodb = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Usuario - Vista Administrador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre: * ");

        jLabel2.setText("Apellido: *");

        jLabel3.setText("Direcci??n: ");

        jLabel4.setText("Tel??fono: ");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Limpiar");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Hiragino Mincho ProN", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 4, 55));
        jLabel7.setText("Registro Nueva Persona");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(115, 115, 115));
        jLabel6.setText("Derechos reservados - Facultad de Ingenier??a  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                    .addComponent(txtDireccion)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(115, 115, 115));
        jLabel5.setText("Registro Base de Datos ");

        tblRegistrodb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblRegistrodb.setForeground(new java.awt.Color(0, 9, 69));
        tblRegistrodb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRegistrodb.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblRegistrodbAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblRegistrodb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrodbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblRegistrodbMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistrodb);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 9, 160));
        jLabel8.setText("by ??? su grupo Favorito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        
    }
    
    private Persona GuardarPersona(){
        
        String sql =  "INSERT INTO sql10413110.Person (`Nombre`, `Apellido`, `Direcci??n`, `Tel??fono` )"
                    + "VALUES(?, ?, ?, ?);";
        
        try {
            
            PreparedStatement ppt = conexiondb.prepareStatement(sql);
            
            ppt.setString(1, txtNombre.getText().trim());
            ppt.setString(2, txtApellido.getText().trim());
            ppt.setString(3, txtDireccion.getText().trim());
            ppt.setString(4, txtTelefono.getText().trim());
            ppt.executeUpdate();
            ppt.close();
            
            // Cada vez que yo ingrese un nuevo usuario, se eliminara y me mandar?? un mensaje diciendo que el usuario se guardo. 
            Limpiar();
            MostrarDatosDB();
            //mensaje exitoso :) 
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al momento de guardar los datos, en base de datos.");
        }
        return null;
        
    }
    
    void MostrarDatosDB(){
        DefaultTableModel Dise??odb = new DefaultTableModel();
        
        Dise??odb.addColumn("ID");
        Dise??odb.addColumn("          Nombre");
        Dise??odb.addColumn("          Apellido");
        Dise??odb.addColumn("          Direcci??n");
        Dise??odb.addColumn("          Tel??fono");
        
        tblRegistrodb.setModel(Dise??odb);
        
        String Consultadb = "SELECT * FROM sql10413110.Person";
        String Datos[] = new String [5];
        
        try{     
            Statement Datosdb = conexiondb.createStatement(); 
            ResultSet result = Datosdb.executeQuery(Consultadb);
            
            while (result.next()){
                Datos[0] = result.getString(1);
                Datos[1] = result.getString(2);
                Datos[2] = result.getString(3);
                Datos[3] = result.getString(4);
                Datos[4] = result.getString(5);  
                Dise??odb.addRow(Datos);
            }
            tblRegistrodb.setModel(Dise??odb);
            
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error al momento de mostrar los datos.");
        }
    }
    
    
    void ModificarDatodb(){
        int Fila = tblRegistrodb.getSelectedRow();
        
        
        if (Fila >= 0 ){
            txtNombre.setText(tblRegistrodb.getValueAt(Fila, 1).toString());
            txtApellido.setText(tblRegistrodb.getValueAt(Fila, 2).toString());
            txtDireccion.setText(tblRegistrodb.getValueAt(Fila, 3).toString());
            txtTelefono.setText(tblRegistrodb.getValueAt(Fila, 4).toString());
            
        } else {
            JOptionPane.showMessageDialog(null, "??No se ha detectado una fila seleccionada!");
        }
        
    }
    
    
    void Actualizar(){
        //String SQL = "UPDATE sql10413110.Person SET "
        //    + "Nombre = ?"
        //    + ",Apellido = ?"
        //    + ",Direcci??n = ?"
        //    + ",Tel??fono = ?"
        //    + ",id = ? "
        //    + "WHERE id= ?";
        
        
               
        
       
        try {
            int Fila = tblRegistrodb.getSelectedRow();
            String ID = tblRegistrodb.getValueAt(Fila, 0).toString();
        
            String SQL = "UPDATE sql10413110.Person SET Nombre = ?,Apellido = ?,Direcci??n = ?,Tel??fono = ?, WHERE id="+ ID +"";
            
            PreparedStatement pstm = conexiondb.prepareStatement(SQL);
            
            pstm.setString(1, txtNombre.getText());
            pstm.setString(2, txtApellido.getText());
            pstm.setString(3, txtDireccion.getText());
            pstm.setString(4, txtTelefono.getText());
            pstm.setString(5, ID);
         
            pstm.executeUpdate();
            pstm.close();
            
            Limpiar();
            MostrarDatosDB();
           
            JOptionPane.showMessageDialog(null, "Dato actuzalizado exitosamente");
            
        } catch (Exception e){
             JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: actualizar(Dato_usuario d_usr)", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void ModificarPersona(){
        try {
            Persona NuevaPersona = new Persona();
            
            NuevaPersona.setNombre(txtNombre.getText());
            NuevaPersona.setApellido(txtApellido.getText());
            NuevaPersona.setDireccion(txtDireccion.getText());
            NuevaPersona.setTelefono(txtTelefono.getText());
            
            int Fila = tblRegistrodb.getSelectedRow();
            String ID = tblRegistrodb.getValueAt(Fila, 0).toString();
            
            String personaA = tblRegistrodb.getValueAt(Fila, 0).toString();
            String SQL = "UPDATE sql10413110.Person SET `Nombre`= ?,`Apellido`= ?,`Direcci??n`= ?,`Tel??fono`= ? WHERE  id="+ Integer.parseInt(personaA) +"";

            PreparedStatement pst = conexiondb.prepareStatement(SQL);
            pst.setString(1, NuevaPersona.getNombre());
            pst.setString(2, NuevaPersona.getApellido());
            pst.setString(3, NuevaPersona.getDireccion());
            pst.setString(4, NuevaPersona.getTelefono());
            pst.executeUpdate();
            pst.close();
            
            Limpiar();
            MostrarDatosDB();
            JOptionPane.showMessageDialog(null, "Dato actuzalizado exitosamente");
        } catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Error al actualizar dato");
        }
    }
    
    void EliminarDatodb(){
        
        int Fila = tblRegistrodb.getSelectedRow();
        String valor = tblRegistrodb.getValueAt(Fila, 0).toString();
        
        String sql = "DELETE FROM sql10413110.Person WHERE Id = '"+ valor +"' ";
        
        if (Fila >= 0 ){
            try {
                PreparedStatement pps = conexiondb.prepareStatement(sql);
                pps.executeUpdate();
                pps.close();
                
                MostrarDatosDB();
                JOptionPane.showMessageDialog(null, "Usuario eliminado con ??xito");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
            }  
        }
    }
    
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarDatodb();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        //ModificarDatodb();
        ModificarPersona();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        GuardarPersona();
        MostrarDatosDB();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void tblRegistrodbAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblRegistrodbAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistrodbAncestorAdded

    private void tblRegistrodbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrodbMouseClicked
        // TODO add your handling code here:
        SelecPerson = tblRegistrodb.rowAtPoint(evt.getPoint());
        
        txtNombre.setText(tblRegistrodb.getValueAt(SelecPerson, 1).toString());
        txtApellido.setText(tblRegistrodb.getValueAt(SelecPerson, 2).toString());
        txtDireccion.setText(tblRegistrodb.getValueAt(SelecPerson, 3).toString());
        txtTelefono.setText(tblRegistrodb.getValueAt(SelecPerson, 4).toString());
       
    }//GEN-LAST:event_tblRegistrodbMouseClicked

    private void tblRegistrodbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrodbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistrodbMouseEntered

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
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton4;
    public javax.swing.JTable tblRegistrodb;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
