package com.example.hello;

import products.PetService;
import products.Pet;
import products.PetDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateServlet", value = "/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PetService petService = new PetService();
        try {
            String type = request.getParameter("type");
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            Pet pet = new Pet(type, name, age);
            petService.savePet(pet);
            response.sendRedirect(request.getContextPath() + "/");
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }
}
