/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwithmysql;

import java.sql.SQLException;
import static projectwithmysql.TestConnection.connect;
//import static projectwithmysql.TestConnection.connect;

/**
 *
 * @author ahmed emad
 */
public class ProjectWithMysql {

    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        connect();
        Modify modify = new Modify();
        ProjectGUI projectGUI = new ProjectGUI();
        projectGUI.setVisible(true);
       
        
        //String ConnectionURl = "jdbc:sqlserver:sqlsrv//localhost:1433;databaseName=user_model;password=12345678";
    }
    
}
