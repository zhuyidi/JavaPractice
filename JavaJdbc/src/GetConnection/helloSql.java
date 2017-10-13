package GetConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by dela on 3/14/17.
 */
public class helloSql {
    private static Connection conn = null;
    public static String url = "jdbc:mysql://localhost:3306/linux";
    public static String user = "root";
    public static String passwd = "mysql";
    public static SQLException ex = null;

    public static void test(){
        try{
            conn = DriverManager.getConnection(url, user, passwd);
        }
        catch (SQLException e){
            ex = e;
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e) {
                    if(ex == null){
                        ex = e;
                    }
                    else{
                        ex.addSuppressed(e);
                    }
                }
            }
            if(ex != null){
                throw new RuntimeException(ex);
            }
        }
    }
}
