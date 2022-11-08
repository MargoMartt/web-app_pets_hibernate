package com.example.hello;

import products.Pet;
import products.PetService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EditServlet", value = "/edit")
public class EditServlet extends HttpServlet {
    PetService petService = new PetService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Pet pet = petService.findPet(id);
            System.out.println(pet);
            if (pet != null) {
                request.setAttribute("pet", pet);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
            } else getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        } catch (Exception e) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            try {
                throw e;
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String type = request.getParameter("type");
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));

            Pet pet = new Pet(id, type, name, age);
            petService.updatePet(pet);
            response.sendRedirect(request.getContextPath() + "/");

        } catch (Exception e) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            throw e;

        }
    }
}
