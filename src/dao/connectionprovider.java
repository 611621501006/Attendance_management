/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author aravi
 */
public class connectionprovider {
    
   private static final String DB_Name="attendanceJframebd";
    private static final String DB_URL="jdbc:mysql://localhost:3306/";
     private static final String DB_UserName="root";
      private static final String DB_PassWord="sql@123";
      
      public static Connection getcon()
      {
          try{
              Connection con=DriverManager.getConnection(DB_URL ,DB_UserName,DB_PassWord);
              if(!databaseExixts(con, DB_Name))
                      {
                          createDatabase(con, DB_Name);
                      }
              con=DriverManager.getConnection(DB_URL + DB_Name ,DB_UserName,DB_PassWord);
              return con;
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
              return null;
          }
      }
      
      private static boolean databaseExixts(Connection con,String dbName)throws Exception{
         
          Statement stmt=con.createStatement();
          return stmt.executeQuery("Show databases like '" + dbName + "'").next();
      }
      
      private static void createDatabase(Connection con, String dbName)throws Exception{
          Statement stmt=con.createStatement();
          stmt.executeUpdate("create database " + dbName);
          System.out.println("Database '" + dbName + "'created successfully");
      }
}
