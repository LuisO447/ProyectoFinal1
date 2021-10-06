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
public class VentanaFavoritos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaFavoritos
     */
    public VentanaFavoritos() {
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
        
        jtTablaFavoritos.setModel(modelo);
        
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
            jtTablaFavoritos.setModel(modelo);

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
        
        jtMFavoritos.setModel(modelo);
        
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
            jtMFavoritos.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
        
    }
    
    void mostrartablaJ(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtTablaFavoritos.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'josue')";
        
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
            jtTablaFavoritos.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaMJ(){
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtMFavoritos.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'josue')";
        
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
            jtMFavoritos.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
        
    }
    
    void mostrartablaLind(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtTablaFavoritos.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'linda')";
        
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
            jtTablaFavoritos.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaMLind(){
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtMFavoritos.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'linda')";
        
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
            jtMFavoritos.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
        
    }
    
    void mostrartablaLuis(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtTablaFavoritos.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'luis')";
        
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
            jtTablaFavoritos.setModel(modelo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null,"Clavo con sql.");
        }
        
    }
    
    void mostrartablaMLuis(){
    
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("color");
        modelo.addColumn("habitat");
        modelo.addColumn("capture_rate");
        modelo.addColumn("base_experience");
        
        jtMFavoritos.setModel(modelo);
        
        String cueroR = "select name,generation_id,color,habitat,capture_rate,base_experience from pokemon where id in (select pokemon_id from test.tb_menos_favoritos where usuario = 'luis')";
        
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
            jtMFavoritos.setModel(modelo);

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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblUsuarios = new javax.swing.JLabel();
        btnUsuario1 = new javax.swing.JButton();
        btnUsuario2 = new javax.swing.JButton();
        btnUsuario3 = new javax.swing.JButton();
        btnUsuario4 = new javax.swing.JButton();
        lblNombreUsuario = new javax.swing.JLabel();
        lblNombrePkm = new javax.swing.JLabel();
        lblGeneracion = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblHabitat = new javax.swing.JLabel();
        resultados_query = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaFavoritos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtMFavoritos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuarios.setText("Elije un usuario para ver:");

        btnUsuario1.setText("Usuario 1");
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });

        btnUsuario2.setText("Usuario 2");
        btnUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario2ActionPerformed(evt);
            }
        });

        btnUsuario3.setText("Usuario 3");
        btnUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario3ActionPerformed(evt);
            }
        });

        btnUsuario4.setText("Usuario 4");
        btnUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario4ActionPerformed(evt);
            }
        });

        lblNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreUsuario.setText("jLabel1");

        lblNombrePkm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombrePkm.setText("Pokemon Favoritos del usuario:");

        lblGeneracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGeneracion.setText("Pokemon menos preferidos por el usuario:");

        lblColor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblColor.setText("Esta pokedex solo permite 4 usuarios:");

        lblHabitat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblHabitat.setText("por el usuario: ");

        resultados_query.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resultados_query.setText("Usuario 1 = Principal");

        jtTablaFavoritos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtTablaFavoritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtTablaFavoritos);

        jtMFavoritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtMFavoritos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuarios)
                        .addGap(107, 107, 107)
                        .addComponent(lblNombrePkm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUsuario1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUsuario2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUsuario3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUsuario4))
                            .addComponent(lblGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor)
                            .addComponent(lblHabitat)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(resultados_query, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarios)
                    .addComponent(lblNombrePkm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsuario1)
                            .addComponent(btnUsuario2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsuario3)
                            .addComponent(btnUsuario4))
                        .addGap(18, 18, 18)
                        .addComponent(lblColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultados_query)
                        .addGap(4, 4, 4)
                        .addComponent(lblNombreUsuario)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHabitat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed
        // TODO add your handling code here: para lo del usuario ruldin
        
        int contador = 0;
        lblNombreUsuario.setText("Ruldin");
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        mostrartabla();
        mostrartablaR();
        
//        String cueriRuldin = "select * from pokemon where id in (select pokemon_id from test.tb_favoritos where usuario = 'ruldin')";
//        
//         try {
//            
//            conn = ClsConexion.getConnection();
//            stmt = conn.prepareStatement(cueriRuldin);
//            //stmt.setString(1,txtBuscar.getText());
//            
//            rs = stmt.executeQuery();
//            
//            if(rs.next()){
//                
//                lblNombrePkm.setText(rs.getString("name"));
//                lblGeneracion.setText(rs.getNString("generation_id"));
//                lblColor.setText(rs.getNString("color"));
//                lblHabitat.setText(rs.getNString("habitat"));
//                lblCaptureRate.setText(rs.getNString("capture_rate"));
//                lblExpBase.setText(rs.getNString("base_experience"));
//                resultados_query.setText("Contador: "+contador+" Cuerito: "+cueriRuldin);
//                
//            }else{
//                
//                JOptionPane.showMessageDialog(null,"No existe ese pokemon");
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//            JOptionPane.showMessageDialog(null,"Clavo con sql.");
//        }
        
    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void btnUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario2ActionPerformed
        // TODO add your handling code here:
        
        int contador = 0;
        lblNombreUsuario.setText("Josue");
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        mostrartablaJ();
        mostrartablaMJ();
        
    }//GEN-LAST:event_btnUsuario2ActionPerformed

    private void btnUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario3ActionPerformed
        // TODO add your handling code here:
        
        int contador = 0;
        lblNombreUsuario.setText("Linda");
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        mostrartablaLind();
        mostrartablaMLind();
        
    }//GEN-LAST:event_btnUsuario3ActionPerformed

    private void btnUsuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario4ActionPerformed
        // TODO add your handling code here:
        
        int contador = 0;
        lblNombreUsuario.setText("Luis");
        
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        mostrartablaLuis();
        mostrartablaMLuis();
        
    }//GEN-LAST:event_btnUsuario4ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFavoritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JButton btnUsuario2;
    private javax.swing.JButton btnUsuario3;
    private javax.swing.JButton btnUsuario4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtMFavoritos;
    private javax.swing.JTable jtTablaFavoritos;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblGeneracion;
    private javax.swing.JLabel lblHabitat;
    private javax.swing.JLabel lblNombrePkm;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel resultados_query;
    // End of variables declaration//GEN-END:variables
}
