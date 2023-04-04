package com.javaee.javaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RequestAttributesServlet", urlPatterns = "/request")
public class RequestAttributesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");

        StringBuilder error = new StringBuilder();
        if (firstName == null) {
            error.append("A first name was not provided");
        } else if (lastName ==  null) {
            error.append("A last name was not provided");
        } else if (age == null) {
            error.append("An age was not provided");
        }

        if (error.length() > 0) {
            request.setAttribute("error", error.toString());
        } else {
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
        }
        getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);

    }
}
