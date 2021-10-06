/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import codigos.ClsConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class VentanaFiltro extends javax.swing.JFrame {

    /**
     * Creates new form VentanaFiltro
     */
    public VentanaFiltro() {
        initComponents();
    }
    
    void mostrartabla(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin')";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaR(){
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin')";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
        
    }
    
    void mostrartablaGris(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and color = 'gray');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaGrisM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and color = 'gray');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaRed(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and color = 'red');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaRedM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and color = 'red');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaNi(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and color = 'black');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaNiM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and color = 'black');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
     void mostrartablaAmarillo(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and color = 'yellow');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablayellowM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and color = 'yellow');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
     void mostrartablaRosa(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and color = 'pink');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaRosaM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and color = 'pink');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaCueva(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and habitat = 'cave');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaCuevaM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and habitat = 'cave');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaUrban(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and habitat = 'urban');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaUrbanM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and habitat = 'urban');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaMontana(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and habitat = 'mountain');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaMontanaM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and habitat = 'mountain');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaBosque(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and habitat = 'forest');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaBosqueM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and habitat = 'forest');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaCampo(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and habitat = 'rough terrain');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaCampoM(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and habitat = 'rough terrain');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaGen1(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and generation_id = '1');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaGen1M(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and generation_id = '1');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaGen2(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and generation_id = '2');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaGen2M(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and generation_id = '2');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaGen3(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and generation_id = '3');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaGen3M(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and generation_id = '3');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaMayor45(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and capture_rate >= '45');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
     void mostrartablaMayor45M(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and capture_rate >= '45');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaMayor50(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and capture_rate >= '50');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaMayor50M(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and capture_rate >= '50');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaMenor40(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtFiltrada.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin' and capture_rate <= '40');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            jtFiltrada.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
     
    void mostrartablaMenor40M(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        tjFiltradaN.setModel(modelo);
        
        String cueroR = "SELECT name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'ruldin' and capture_rate <= '40');";
        
        String datos[] = new String[6];
        
        int contador=0;
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(cueroR);
            //stmt.setString(1,txtBuscar.getText());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);
                datos[5] = rs.getNString(6);
                modelo.addRow(datos);
                
            }
            tjFiltradaN.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFiltrada = new javax.swing.JTable();
        lblMensajeFiltro = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tjFiltradaN = new javax.swing.JTable();
        btnCave = new javax.swing.JButton();
        btnUrban = new javax.swing.JButton();
        btnMountain = new javax.swing.JButton();
        btnForest = new javax.swing.JButton();
        btnRoughTerrain = new javax.swing.JButton();
        lblFiltroColor = new javax.swing.JLabel();
        btnGray = new javax.swing.JButton();
        btnRed = new javax.swing.JButton();
        btnBlack = new javax.swing.JButton();
        btnYellow = new javax.swing.JButton();
        btnPink = new javax.swing.JButton();
        lblFiltroRateC = new javax.swing.JLabel();
        btnMayor45 = new javax.swing.JButton();
        btnMenor40 = new javax.swing.JButton();
        btnMayor50 = new javax.swing.JButton();
        lblFiltroGeneracion = new javax.swing.JLabel();
        btnFirstGen = new javax.swing.JButton();
        btnSecondGen = new javax.swing.JButton();
        btnThirdGen = new javax.swing.JButton();
        btnOn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMensaje.setText("Todos los datos son del primer usuario como en las pokedex normales:  ");

        jtFiltrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtFiltrada);

        lblMensajeFiltro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMensajeFiltro.setText("Filtro de habitat:");

        tjFiltradaN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tjFiltradaN);

        btnCave.setText("cueva");
        btnCave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaveActionPerformed(evt);
            }
        });

        btnUrban.setText("urbano");
        btnUrban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrbanActionPerformed(evt);
            }
        });

        btnMountain.setText("montaña");
        btnMountain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMountainActionPerformed(evt);
            }
        });

        btnForest.setText("bosque");
        btnForest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForestActionPerformed(evt);
            }
        });

        btnRoughTerrain.setText("campo");
        btnRoughTerrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoughTerrainActionPerformed(evt);
            }
        });

        lblFiltroColor.setText("Filtro por color:");

        btnGray.setText("Gris");
        btnGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrayActionPerformed(evt);
            }
        });

        btnRed.setText("Rojo");
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });

        btnBlack.setText("Negro");
        btnBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlackActionPerformed(evt);
            }
        });

        btnYellow.setText("Amarillo");
        btnYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowActionPerformed(evt);
            }
        });

        btnPink.setText("Rosado");
        btnPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinkActionPerformed(evt);
            }
        });

        lblFiltroRateC.setText("Filtro por ratio de captura:");

        btnMayor45.setText("=>45");
        btnMayor45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayor45ActionPerformed(evt);
            }
        });

        btnMenor40.setText("<=40");
        btnMenor40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenor40ActionPerformed(evt);
            }
        });

        btnMayor50.setText("=>50");
        btnMayor50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayor50ActionPerformed(evt);
            }
        });

        lblFiltroGeneracion.setText("Filtro de generacion:");

        btnFirstGen.setText("1ra Generacion ");
        btnFirstGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstGenActionPerformed(evt);
            }
        });

        btnSecondGen.setText("2da Generacion");
        btnSecondGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondGenActionPerformed(evt);
            }
        });

        btnThirdGen.setText("3ra Generacion");
        btnThirdGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdGenActionPerformed(evt);
            }
        });

        btnOn.setText("Encender");
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMensaje)
                                        .addGap(101, 101, 101)
                                        .addComponent(btnOn))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMountain))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUrban)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnForest)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBlack)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnYellow)
                                        .addGap(71, 71, 71)
                                        .addComponent(btnMayor50))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGray)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRed)
                                        .addGap(62, 62, 62)
                                        .addComponent(btnMayor45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMenor40)))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFirstGen)
                                    .addComponent(btnSecondGen)
                                    .addComponent(btnThirdGen)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMensajeFiltro)
                                .addGap(100, 100, 100)
                                .addComponent(lblFiltroColor)
                                .addGap(115, 115, 115)
                                .addComponent(lblFiltroRateC)
                                .addGap(46, 46, 46)
                                .addComponent(lblFiltroGeneracion)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnRoughTerrain)
                .addGap(122, 122, 122)
                .addComponent(btnPink)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensaje)
                    .addComponent(btnOn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensajeFiltro)
                    .addComponent(lblFiltroColor)
                    .addComponent(lblFiltroRateC)
                    .addComponent(lblFiltroGeneracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCave)
                    .addComponent(btnMountain)
                    .addComponent(btnGray)
                    .addComponent(btnRed)
                    .addComponent(btnMayor45)
                    .addComponent(btnMenor40)
                    .addComponent(btnFirstGen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUrban)
                    .addComponent(btnForest)
                    .addComponent(btnBlack)
                    .addComponent(btnYellow)
                    .addComponent(btnMayor50)
                    .addComponent(btnSecondGen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoughTerrain)
                    .addComponent(btnPink)
                    .addComponent(btnThirdGen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        // TODO add your handling code here:
        mostrartabla();
        mostrartablaR();
        
        
    }//GEN-LAST:event_btnOnActionPerformed

    private void btnGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrayActionPerformed
        // TODO add your handling code here:
        
        mostrartablaGris();
        mostrartablaGrisM();
        
    }//GEN-LAST:event_btnGrayActionPerformed

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        // TODO add your handling code here:
        
        mostrartablaRed();
        mostrartablaRedM();
    }//GEN-LAST:event_btnRedActionPerformed

    private void btnBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlackActionPerformed
        // TODO add your handling code here:
        
        mostrartablaNi();
        mostrartablaNiM();
        
    }//GEN-LAST:event_btnBlackActionPerformed

    private void btnYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYellowActionPerformed
        // TODO add your handling code here:
        
        mostrartablaAmarillo();
        mostrartablayellowM();
        
    }//GEN-LAST:event_btnYellowActionPerformed

    private void btnPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinkActionPerformed
        // TODO add your handling code here:
        
        mostrartablaRosa();
        mostrartablaRosaM();
        
    }//GEN-LAST:event_btnPinkActionPerformed

    private void btnCaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaveActionPerformed
        // TODO add your handling code here:
        
        mostrartablaCueva();
        mostrartablaCuevaM();
        
    }//GEN-LAST:event_btnCaveActionPerformed

    private void btnUrbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrbanActionPerformed
        // TODO add your handling code here:
        
        mostrartablaUrban();
        mostrartablaUrbanM();
        
    }//GEN-LAST:event_btnUrbanActionPerformed

    private void btnMountainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMountainActionPerformed
        // TODO add your handling code here:
        
        mostrartablaMontana();
        mostrartablaMontanaM();
        
    }//GEN-LAST:event_btnMountainActionPerformed

    private void btnForestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForestActionPerformed
        // TODO add your handling code here:
        
        mostrartablaBosque();
        mostrartablaBosqueM();
        
    }//GEN-LAST:event_btnForestActionPerformed

    private void btnRoughTerrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoughTerrainActionPerformed
        // TODO add your handling code here:
        
        mostrartablaCampo();
        mostrartablaCampoM();
        
    }//GEN-LAST:event_btnRoughTerrainActionPerformed

    private void btnFirstGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstGenActionPerformed
        // TODO add your handling code here:
        
        mostrartablaGen1();
        mostrartablaGen1M();
        
    }//GEN-LAST:event_btnFirstGenActionPerformed

    private void btnSecondGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondGenActionPerformed
        // TODO add your handling code here:
        
        mostrartablaGen2();
        mostrartablaGen2M();
        
    }//GEN-LAST:event_btnSecondGenActionPerformed

    private void btnThirdGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdGenActionPerformed
        // TODO add your handling code here:
        
        mostrartablaGen3();
        mostrartablaGen3M();
        
    }//GEN-LAST:event_btnThirdGenActionPerformed

    private void btnMayor45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayor45ActionPerformed
        // TODO add your handling code here:
        
        mostrartablaMayor45();
        mostrartablaMayor45M();
        
    }//GEN-LAST:event_btnMayor45ActionPerformed

    private void btnMayor50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayor50ActionPerformed
        // TODO add your handling code here:
        
        mostrartablaMayor50();
        mostrartablaMayor50M();
        
    }//GEN-LAST:event_btnMayor50ActionPerformed

    private void btnMenor40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenor40ActionPerformed
        // TODO add your handling code here:
        
        mostrartablaMenor40();
        mostrartablaMenor40M();
        
    }//GEN-LAST:event_btnMenor40ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFiltro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlack;
    private javax.swing.JButton btnCave;
    private javax.swing.JButton btnFirstGen;
    private javax.swing.JButton btnForest;
    private javax.swing.JButton btnGray;
    private javax.swing.JButton btnMayor45;
    private javax.swing.JButton btnMayor50;
    private javax.swing.JButton btnMenor40;
    private javax.swing.JButton btnMountain;
    private javax.swing.JButton btnOn;
    private javax.swing.JButton btnPink;
    private javax.swing.JButton btnRed;
    private javax.swing.JButton btnRoughTerrain;
    private javax.swing.JButton btnSecondGen;
    private javax.swing.JButton btnThirdGen;
    private javax.swing.JButton btnUrban;
    private javax.swing.JButton btnYellow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtFiltrada;
    private javax.swing.JLabel lblFiltroColor;
    private javax.swing.JLabel lblFiltroGeneracion;
    private javax.swing.JLabel lblFiltroRateC;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMensajeFiltro;
    private javax.swing.JTable tjFiltradaN;
    // End of variables declaration//GEN-END:variables
}
