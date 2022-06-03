/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_final.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ConexionCafeeGess {
    private static Connection ConnectionBD= null;
    public Connection getConecction (){
        try {
            String url = "jdbc:mysql://localhost:3306/root";
            String user = "root";
            String password = "root";
            
            ConnectionBD = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error "+e.toString());
        }
        
    return ConnectionBD;
    }
}
