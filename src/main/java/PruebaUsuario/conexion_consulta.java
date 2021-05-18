/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinalexanderlimarecinos
 */
public class conexion_consulta {

    Connection conexion = null;
    Statement sentencia;

    private void conectar() {

        String Ruta = "jdbc:mysql://sql10.freesqldatabase.com";
        String User = "sql10413110";
        String Password = "QC3L6VqdDt";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(Ruta, User, Password);
            sentencia = conexion.createStatement();
            JOptionPane.showMessageDialog(null, "Conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No conectado");
        }
    }

    public static void guardar(variables x) {
        String Insertdb = "INSERT INTO `Person` (`Nombre` , `Apellido`, `Direción`, `Teléfono`) "
                + "VALUES ('" + x.getNombre() + "' "
                + "'" + x.getApellido() + "' '" + x.getDireccion() + "'"
                + "'" + x.getTelefono() + "')";
        try {
            sentencia.executeUpdate(Insertdb);
            JOptionPane.showMessageDialog(null, "Enviado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al enviar");
        }

    }

}
