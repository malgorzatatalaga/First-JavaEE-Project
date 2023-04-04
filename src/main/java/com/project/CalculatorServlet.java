package com.project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String principal = request.getParameter("principal");
        String interest = request.getParameter("interest");
        String time = request.getParameter("time");
        String compound = request.getParameter("compound");

        String error;

        if (principal.isBlank() || interest.isBlank() || time.isBlank() || compound.isBlank() || (principal.isBlank() && interest.isBlank() && time.isBlank() && compound.isBlank())) {
            error = "One or more of the input boxes were blank. Try again";
            request.setAttribute("error", error);
        } else {
            double result = Calculate.calculate(Double.parseDouble(principal), Double.parseDouble(interest) / 100, Integer.parseInt(time), Integer.parseInt(compound));
            request.setAttribute("result", result);
        }

        request.setAttribute("principal", principal);
        request.setAttribute("interest", interest);
        request.setAttribute("time", time);
        request.setAttribute("compound", compound);
        getServletContext().getRequestDispatcher("/project.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/project.jsp").forward(request, response);
    }
}
