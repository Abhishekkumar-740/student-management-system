package O1_StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class O2_DBConnection {

    static Connection con;

    public static Connection createConnection(){

        try{
            String db = "studentDB";
            String user="root";
            String pass="Abhi#01945@740";
            String url = "jdbc:mysql://localhost:3306/";

            con= DriverManager.getConnection(url+db,user,pass);

        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return con;
    }


}
