/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_clinical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kwangkwang
 */
public class Project_Clinical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        // TODO code application logic here
        
        String userName = "root";
        String password = "";
        String urlquery = "jdbc:mysql://localhost/clinical";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(urlquery, userName, password);
        System.out.println("Connection Established");
    }
}
