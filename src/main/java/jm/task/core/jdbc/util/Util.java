package jm.task.core.jdbc.util;


import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД

    public Connection makeConnect() throws SQLException {
        String name = "root";
        String password = "root";
        String URL = "jdbc:mysql://localhost:3306/my_server?useSSL=false";
        Connection connection = DriverManager.getConnection(URL, name, password);
        return connection;
    }
}
//
//    Connection connection = null;
//    Driver driver;
//        driver = new FabricMySQLDriver();
//                DriverManager.registerDriver(driver);
//                connection = DriverManager.getConnection(URL,name,password);
//                return connection;

