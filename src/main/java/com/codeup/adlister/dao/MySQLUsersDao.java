package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

//Create an implementation for the Users interface
//Create a class named MySQLUsersDao that implements Users. Add functionality to the DaoFactory class to return an instance of the users data access object.

public class MySQLUsersDao implements Users{
    private Connection connection;

    public MySQLUsersDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        //? placeholder for user input
        String queryUserName = "SELECT * FROM users WHERE username = ?";
        try {
            //Prepared statement creation
            PreparedStatement statement = connection.prepareStatement(queryUserName);
            statement.setString(1, username);
            //Prepared statement creation
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                //create a user object to return
                return extractUser(rs);
            } else {
                return null;
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    @Override
    public Long insert(User user) {
        String query = "INSERT INTO user(username, email,password) VALUES (?,?,?)";
        try {
            //Prepared statement
            PreparedStatement stmt = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,user.getUsername());
            stmt.setString(2,user.getEmail());
            stmt.setString(3,user.getPassword());
            //Prepared statement
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }    }
}
