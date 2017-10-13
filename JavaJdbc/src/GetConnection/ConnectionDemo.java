package GetConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.System.out;

/**
 * Created by dela on 3/15/17.
 */
public class ConnectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        String jdbcUrl = "jdbc:mysql://localhost:3306/linux";
        String user = "root";
        String passwd = "mysql";

        try(Connection conn =
                    DriverManager.getConnection(jdbcUrl, user, passwd)){
            out.printf("已%s数据库联机!", conn.isClosed() ? "关闭" : "开启");
        }
    }
}
