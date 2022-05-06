package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
        // TODO: show the registration form
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Users usersDao = DaoFactory.getUsersDao();

        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        boolean fieldsNotNull = false;
        boolean fieldsNotEmpty = false;
        boolean usernameDoesntExist = false;

        //TODO: check to make sure only new usernames registered
        //call Dao factory to search if username exists
        User existingUser = usersDao.findByUsername(username);
        if (existingUser == null){
            usernameDoesntExist = true;
        }

        if (username != null && email != null && password != null){
            fieldsNotNull = true;
        }

        if (!username.isEmpty() && !email.isEmpty() && !password.isEmpty()){
            fieldsNotEmpty = true;
        }
        // TODO: create a new user based off of the submitted information
        if(fieldsNotEmpty && fieldsNotNull && usernameDoesntExist){
            User createUser = new User(username,email,password);
            usersDao.insert(createUser);
            response.sendRedirect("/login?success");
        } else {
            response.sendRedirect("/register?errors");
        }




        // TODO: if a user was successfully created, send them to their profile
        response.sendRedirect("/profile");
    }
}
