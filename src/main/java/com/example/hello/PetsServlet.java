package com.example.hello;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(name = "ProductsServlet", value = "/products")
public class PetsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            String url = "jdbc:mysql://localhost:3306/pets";
            String username = "root";
            String password = "Rita2102";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                writer.println("Connection to ProductDB succesfull!");
            }
        } catch (Exception exception) {
            writer.println("Connection Failed...");
            writer.println(exception);
        } finally {
            writer.close();
        }
    }

}
