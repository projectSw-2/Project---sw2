/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwithmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ahmed emad
 */
public class TestConnection {
    
    /**
     *
     * @throws ClassNotFoundException
     */
    public static Connection connect()throws ClassNotFoundException, SQLException
{
Connection connection = null;
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
String ConnectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Ahmed;user=sa;password=123";
try 
{
    connection = DriverManager.getConnection(ConnectionURL);
    System.out.println("Connection Successfully done");
}
catch (SQLException sqlException)
        {
            System.out.println("error");
        }
return connection;
}
}
//}
//    private java.sql.Connection con = null;
//    private final String url = "jdbc:microsoft:sqlserver://";
//    private final String serverName = "localhost";
//    private final String portNumber = "1433";
//    private final String databaseName = "user_model";
//    private final String userName = "sa";
//    private final String password = "12345678";
//
//    // Constructor
//    public TestConnection () {
//    }
//
//    public String getConnectionUrl() {
//        return url + serverName + ":" + portNumber + ";databaseName=" + databaseName ;
//    }
//
//    public java.sql.Connection getConnection() {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            con = java.sql.DriverManager.getConnection(getConnectionUrl(), userName, password);
//            if (con != null) {
//                System.out.println("Connection Successful!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error Trace in getConnection() : " + e.getMessage());
//        }
//        return con;
//    }

