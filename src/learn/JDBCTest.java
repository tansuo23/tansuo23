package learn;

import javax.sound.midi.Soundbank;
import java.sql.*;

/**
 * @Author jinglong
 * @Date 2020/12/6 12:28
 * @Version 1.0
 */
public class JDBCTest {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
        System.out.println(connection);
        // 调研历史老师
        String sql = "select *from emp";
        // 解
        Statement statement = connection.createStatement();
        // 执行sql
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int anInt = resultSet.getInt(1);
            System.out.println("------------");
            System.out.println(anInt);
            String ename1 = resultSet.getString("ename");
            System.out.println(ename1);


        }
        // 关闭连接
        statement.close();
        connection.close();
    }
}
