package com.revature.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// annotation based configuration. you can provide multiple url patterns for the endpoint to be reached on
@WebServlet(urlPatterns = {"/annotation", "/nested/annotation"})
public class AnnotationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setHeader("Content-Type", "text/html");
        resp.setStatus(400);
        resp.getOutputStream().println("<h2 style=\"color: red\">Hello from a servlet configured with <em>annotations</em></h2>");
    }
}
