package com.example.hello;

import products.PetDao;

import products.Pet;
import products.PetService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

//@WebServlet(name = "IndexServlet", value = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    PetService petService = new PetService();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Pet> pets = petService.findAllPets();
        request.setAttribute("pets", pets);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
