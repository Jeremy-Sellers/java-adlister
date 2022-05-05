import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.codeup.adlister.dao.Config;
import com.mysql.cj.jdbc.Driver;

public class JDBCTest {
    //Test of Java database connectivity
    //We are going to need a connection object, statement object, resultSet object

    private static List<String> getAuthorNames(){
        List<String> authorNames = new ArrayList<>();
        try {
            Config config = new Config();
            //Get the driver into app
            DriverManager.registerDriver(new Driver());
            //Create connection object
            Connection connection = DriverManager.getConnection(
            config.getUrl(),
            config.getUser(),
            config.getPassword());
            //Create Statement object
            Statement statement = connection.createStatement();
            //Execute statement and get results
            ResultSet rs = statement.executeQuery("SELECT author_name FROM codeup_test_db.authors");
            while (rs.next()){
                authorNames.add(rs.getString("author_name"));
            }
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
        return authorNames;
    }

    //Main to test method above
    public static void main(String[] args) {
        List<String> authorNames = getAuthorNames();
        for(String name : authorNames){
            System.out.println(name);
        }
    }
}