/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinalexanderlimarecinos
 */


    /**
    Datos de Correo: 
    Correo eléctronico de google creatorsperson@gmail.com
    Contraseña de correo eléctronico: UMG2021IngeSIS
     
        Base de Datos: 
    Host: sql10.freesqldatabase.com 
    Database name: sql10413110
    Database user: sql10413110 
    Database password: QC3L6VqdDt 
    Port number: 3306
     
    Base de datos creada en FreeSQLdatabase
    */
    
public class MySQLConector {
    
    Connection conectardb = null; 
    
    public Connection Conectar(){
        
        // Datos para crear la conexión a la Base de Datos
        String DB = "jdbc:mysql://sql10.freesqldatabase.com";
        String Usuario = "sql10413110"; 
        String Password = "QC3L6VqdDt"; 
         
        
        
        // Estas operaciones pueden dar problema, es por eso que se protegen con el try catch
        try{
            
           Class.forName("com.mysql.cj.jdbc.Driver"); 
           conectardb = DriverManager.getConnection(DB, Usuario, Password);
           
           // Este es el mensaje que se espera, ya que es un mensaje de una conexión establecida con éxito
           JOptionPane.showMessageDialog(null, "Conexión establecida con la Base de Datos");
           
        } catch (Exception e) {
            // Si al momento de conectarse a la base de datos nos aparece un error, mostrará este mensaje
            //JOptionPane.showMessageDialog(null, "Error al Conectarse a la Base de Datos");
            JOptionPane.showMessageDialog(null,"Error al conectar la Base de Datos");
        }
        
        return conectardb;
    }
    
    
}
