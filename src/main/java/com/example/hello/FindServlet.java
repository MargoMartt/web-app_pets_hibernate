package com.example.hello;

import products.Pet;
import products.PetService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FindServlet", value = "/find")
public class FindServlet extends HttpServlet {
    PetService petService = new PetService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/find.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Pet pet = petService.findPet(id);
            if (pet != null) {
                request.setAttribute("pet", pet);
                getServletContext().getRequestDispatcher("/find.jsp").forward(request, response);
            } else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        } catch (Exception e) {
            throw new RuntimeException("error");
        }
    }
}
