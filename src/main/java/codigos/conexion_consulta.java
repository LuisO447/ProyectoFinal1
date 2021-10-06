/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.sql.*;

/**
 *
 * @author Luis
 */
public class conexion_consulta {
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    public static void conectar(){
        String ruta="jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        String user="root";
        String pass="1l2u3i4s";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            sentencia= conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }

    public static Variables buscar_reg(String Nombre){
        Variables r = null;
        String q = "SELECT * FROM Datos" + " WHERE Nombre='"+Nombre+"'";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        //r= asignar();
        return r;
                
    }
//    public static Variables asignar(){
//      Variables r = null;
//      String name;
//      String forme_name;
//        try {
//            if(resultado.last()){
//                name= resultado.getString("name");
//                forme_name= resultado.getString("forme_name");
//                r= new Variables (name, forme_name);
//            }
//        } catch (Exception e) {
//        }
//      
//      return r;
//                
//    }
}
