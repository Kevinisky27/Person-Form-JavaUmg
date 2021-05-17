/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinalexanderlimarecinos
 */
public class MySQLConector {
    
    Connection conectar = null; 
    
    public Connection Conectar(){
        
        // Datos para crear la conexión a la Base de Datos
        String DB = "jdbc:mysql://localhost";
        String Usuario = "Kevinisky27"; // kevinisky27
        String Password = "iTwA-8CPqLDu)E/9"; //7Pj@!K_/SXgRxBmX
         
        
        
        // Estas operaciones pueden dar problema, es por eso que se protegen con el try catch
        try{
            
           Class.forName("com.mysql.cj.jdbc.Driver"); 
           conectar = DriverManager.getConnection(DB, Usuario, Password);
           
           // Este es el mensaje que se espera, ya que es un mensaje de una conexión establecida con éxito
           JOptionPane.showMessageDialog(null, "Conexión establecida con la Base de Datos");
           
        } catch (Exception e) {
            e.printStackTrace();
            // Si al momento de conectarse a la base de datos nos aparece un error, mostrará este mensaje
            //JOptionPane.showMessageDialog(null, "Error al Conectarse a la Base de Datos");
            JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
        }
        
        return conectar;
    }
    
}
