/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.*;
public class Connecting {
    Connection c;
    Statement s;
    public Connecting(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///LibraryManagement","root","");
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}