/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agint;

//import Baza;

import glav.director;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class deleotet_agent extends javax.swing.JFrame {

    /**
     * Creates new form otet
     */
    public deleotet_agent() {
        initComponents();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Удаленные данные ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/esoft (1).png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Удаленные клиенты");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Удаленная недвижимость");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setText("Востоновить данные");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton8)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Востоновить данные");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Востоновить данные");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton5)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton5)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 574, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 576, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 376, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 377, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
new director().setVisible(true);
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(true);
       String[] columnNames = {"Номер", "Фамилия","Имя","Очество", "Дата рождения", "Телефон", "E-mail", "Адресс", "ИНН", "Паспортные данные" };
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        jTable1.setModel(model);
        try {
             Baza baza = new Baza();
            Connection conn = DriverManager.getConnection(baza.URL(),baza.LOGIN(),baza.PASSWORD());
            
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT DISTINCT customer_delete.idcustomer_delete, customer_delete.surname, customer_delete.name,  customer_delete.patronymic ,"
                    + " customer_delete.date_of_birth ,customer_delete.phone ,customer_delete.email,customer_delete.addres,customer_delete.inn,customer_delete.passport_details "
                    + "FROM  reeltor.customer_delete"
                    + " ");
            int i = 0;
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10)});
                i++;
            }
              } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel6.setVisible(false);
        jPanel3.setVisible(false);
        jPanel2.setVisible(true);
         String[] columnNames = {"Номер", "Имя обьекта", "Статус", "Тип обьекта", "Тип продажи", "Адресс", "Номер корпуса", "Номер этажа", "Номер квартиры" , "Общая площадь" , "Жилая площадь", "Кухонная площадь", "Количество комнат", "Цена", "Клиент" };
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        jTable1.setModel(model);
        try {
             Baza baza = new Baza();
            Connection conn = DriverManager.getConnection(baza.URL(),baza.LOGIN(),baza.PASSWORD());
            
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT real_estate_delete.idreal_estate_delete, real_estate_delete.name, real_estate_delete.status, object_type.object_typecol, property_type.property_typecol,real_estate_delete.address,real_estate_delete.housing_house,real_estate_delete.apartment_number,real_estate_delete.total_area,real_estate_delete.living_space,real_estate_delete.kitchen_area,real_estate_delete.number_living_rooms,real_estate_delete.date_announcement,real_estate_delete.price,customer.surname FROM  reeltor.real_estate_delete, reeltor.customer, reeltor.object_type, reeltor.property_type where  real_estate_delete.idobject_type=object_type.idobject_type and real_estate_delete.idproperty_type=property_type.idproperty_type and real_estate_delete.idcustomer=customer.idcustomer");
            int i = 0;
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11), resultSet.getString(12), resultSet.getString(13), resultSet.getString(14), resultSet.getString(15)});
                i++;
            }
              } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jTable1.getSelectedRow()==-1){Component c = null;
         JOptionPane.showMessageDialog(c, "Вы невыбрали клиента!");}
     else{
        Component frame = null;
        int n = JOptionPane.showConfirmDialog(
            frame,
            "Вы дествительно хотите удалить запись?",
            "",
            JOptionPane.YES_NO_OPTION);
        if (n == 0) {
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String familiya = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String imya = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String otchestvo = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String data_rojdeniya = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String tele = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String Email = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String adtes = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String inn = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        String danie = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
        String agent = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
        try {
             Baza baza = new Baza();
            Connection conn = DriverManager.getConnection(baza.URL(),baza.LOGIN(),baza.PASSWORD());
            
             String query = "INSERT INTO reeltor.customer (surname, name"
                     + " ,patronymic, date_of_birth, phone, email, addres, inn, passport_details, idagent)"+" VALUES (?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
          
            //ps.setInt(1, Integer.parseInt(id));
            ps.setString(1, familiya);
            ps.setString(2, imya);
            ps.setString(3, otchestvo);
            ps.setString(4, data_rojdeniya);
            ps.setString(5, tele);
            ps.setString(6, Email);
            ps.setString(7, adtes);
            ps.setString(8, inn);
            ps.setString(9, danie);
            ps.setInt(10,  Integer.parseInt(agent) );
            ps.execute();
           
            String sql = "delete from reeltor.customer_delete where idcustomer_delete="+id;
            Component c = null;
         JOptionPane.showMessageDialog(c, "Запись удалена!");
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }  
                            
            int sr = jTable1.getSelectedRow();
                    if (sr > -1) {
                        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                        tm.removeRow(sr);
                    }
        }
         }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTable1.getSelectedRow()==-1){Component c = null;
         JOptionPane.showMessageDialog(c, "Вы невыбрали обьект недвижимости!");}
     else{
        Component frame = null;
        int n = JOptionPane.showConfirmDialog(
            frame,
            "Вы дествительно хотите удалить запись?",
            "",
            JOptionPane.YES_NO_OPTION);
        if (n == 0) { 
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String status = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String idobject_type = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String idproperty_type = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String address = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String house_numder = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String housing_house = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String apartment_number = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        String total_area = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
        String living_space = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
        String kitchen_area = jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString();
        String number_living_rooms = jTable1.getValueAt(jTable1.getSelectedRow(), 12).toString();
        String date_announcement = jTable1.getValueAt(jTable1.getSelectedRow(), 13).toString();
        String idcustomer = jTable1.getValueAt(jTable1.getSelectedRow(), 15).toString();
        String price = jTable1.getValueAt(jTable1.getSelectedRow(), 14).toString();
        try {
             Baza baza = new Baza();
            Connection conn = DriverManager.getConnection(baza.URL(),baza.LOGIN(),baza.PASSWORD());
            
             String query = "INSERT INTO reeltor.real_estate (name,status, idobject_type"
                     + " ,idproperty_type, address, house_numder, housing_house, apartment_number, total_area"
                     + ", living_space, kitchen_area,number_living_rooms,date_announcement,price,idcustomer)"+" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
          
           
            ps.setString(1, name);
            ps.setString(2, status);
            ps.setString(3, idobject_type);
            ps.setString(4, idproperty_type);
            ps.setString(5, address);
            ps.setString(6, house_numder);
            ps.setString(7, housing_house);
            ps.setString(8, apartment_number);
            ps.setString(9, total_area);
            ps.setString(10, living_space);
            ps.setString(11, kitchen_area);
            ps.setString(12, number_living_rooms);
            ps.setString(13, date_announcement);
            ps.setString(14, price);
            ps.setInt(15,  Integer.parseInt(idcustomer) );
            ps.execute();
           
            String sql = "delete from reeltor.real_estate_delete where idreal_estate_delete="+id;
            Component c = null;
         JOptionPane.showMessageDialog(c, "Запись удалена!");
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }  
                            
            int sr = jTable1.getSelectedRow();
                    if (sr > -1) {
                        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                        tm.removeRow(sr);
                    }
        }
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if (jTable1.getSelectedRow()==-1){Component c = null;
         JOptionPane.showMessageDialog(c, "Вы невыбрали агента!");}
     else{
        Component frame = null;
        int n = JOptionPane.showConfirmDialog(
            frame,
            "Вы дествительно хотите удалить запись?",
            "",
            JOptionPane.YES_NO_OPTION);
        if (n == 0) { 
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String surname = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String name = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String patronymic = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String phone = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String email = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String date_of_birth = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String receipt_date = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String passport_details = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        
        try {
             Baza baza = new Baza();
            Connection conn = DriverManager.getConnection(baza.URL(),baza.LOGIN(),baza.PASSWORD());
            
             String query = "INSERT INTO reeltor.agent (surname,name, patronymic"
                     + " ,phone, email, date_of_birth, receipt_date, passport_details)"+" VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
          
           
            ps.setString(1, surname);
            ps.setString(2, name);
            ps.setString(3, patronymic);
            ps.setString(4, phone);
            ps.setString(5, email);
            ps.setString(6, date_of_birth);
            ps.setString(7, receipt_date);
            ps.setString(8, passport_details);
            
            
            ps.execute();
           
            String sql = "delete from reeltor.agent_delete where idagent_delete="+id;
            Component c = null;
         JOptionPane.showMessageDialog(c, "Запись удалена!");
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }  
                            
            int sr = jTable1.getSelectedRow();
                    if (sr > -1) {
                        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                        tm.removeRow(sr);
                    }
        }
         } 
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(deleotet_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleotet_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleotet_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleotet_agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleotet_agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
