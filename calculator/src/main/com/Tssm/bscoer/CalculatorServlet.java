package com.Tssm.bscoer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");

        // Get parameters from the request
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        // Perform calculation based on the operation
        int result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ServletException("Cannot divide by zero");
                }
                break;
            default:
                throw new ServletException("Invalid operation");
        }

        // Send the result back to the client
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Calculator Result</title></head>");
        out.println("<body>");
        out.println("<h1>Result: " + result + "</h1>");
        out.println("</body></html>");
    }
}
