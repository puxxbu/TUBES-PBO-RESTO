/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * tes
 */
public class DbConnection {
    public static Connection CON;
    public static final String URL = "jdbc:mysql://";
    public static final String PATH = "localhost:3306/b_6_restoran";
   
   public Connection makeConnection(){
       System.out.println("Opening Database....");
       try {
           CON = DriverManager.getConnection(URL + PATH,"root","");
           System.out.println("Success!");
           
       } catch (Exception e) {
           System.out.println("Error Opening database..");
           System.out.println(e);
       }
       return CON;
       
   } 
   
   public void closeConnection(){
       System.out.println("Closing Database...");
       try {
           CON.close();
           System.out.println("Success!");
       } catch (Exception e) {
           System.out.println("Error closing database..");
           System.out.println(e);
       }
   }
}
