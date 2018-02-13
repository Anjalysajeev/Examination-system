/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class db {
    public Connection getcon()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
                    con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/db_swing","root","root");
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
        return con;
    }
    
    
}
