package com.javaee.javaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AnimalsServlet", urlPatterns = "/animals")
public class AnimalsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
//        Forwarding to another servlet:
//        getServletContext().getRequestDispatcher("/secondary").forward(request,response);

//        Redirecting to another URL:
        response.sendRedirect("https://docs.oracle.com/javaee/5/tutorial/doc/bnafe.html");


    }
}
