import java.sql.*;

import com.codeup.adlister.dao.Config;
import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;


    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!");
        }
    }


    @Override
    public List<Ad> all() {
        //List to store ads as ad objects
        List<Ad> ads = new ArrayList<>();

        try {
            //create statement
            Statement statement = connection.createStatement();
            //assign rs to SQL query results
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            //if there is another row, create new ad using elements
            while (rs.next()){
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                //add new ad object to list of ads
                ads.add(ad);
            }
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
        //return entire list of ads
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        String title = ad.getTitle();
        String description = ad.getDescription();
        String query = "INSERT INTO ads (user_id, title, description) VALUES (1, '" + title + "', '" + description + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
            System.out.println("The key of the new insert is: " + key);
            return key;
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
    }
}