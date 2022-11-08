package com.example.hello;

import products.Pet;
import products.PetDao;
import products.PetService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = "/delete")
public class DeleteServlet extends HttpServlet {
PetService petService = new PetService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Pet pet = new Pet();
            pet = petService.findPet(id);
            petService.deletePet(pet);
            response.sendRedirect(request.getContextPath() + "/");
        } catch (Exception e) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}
