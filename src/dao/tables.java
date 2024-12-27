/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = connectionprovider.getcon();
            st = con.createStatement();

            if (!tablesExists(st, "userdetails")) {
                st.executeUpdate("create table userdetails(id int auto_increment primary key,name varchar(255) not null"
                        + ",gender varchar(50) not null,email varchar(255) not null,contact varchar(255) not null,state varchar(500) not null,address varchar(500) not null,country varchar(100) not null,uniqueregid varchar(100) not null,imagename varchar(100) not null)");

            }
            if (!tablesExists(st, "userattendance")) {
                st.executeUpdate("create table userattendance(userid int not null,dates date not null,checkin datetime , checkout datetime ,worduration varchar(100))");
            }
            JOptionPane.showMessageDialog(null, "table checked/created sucessfully");
        } catch (Exception ex) {
            JOptionPane.showInternalMessageDialog(null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private static boolean tablesExists(Statement st, String tableName) throws Exception {

        ResultSet resultSet = st.executeQuery("Show tables like '" + tableName + "'");

        return resultSet.next();

    }
}
