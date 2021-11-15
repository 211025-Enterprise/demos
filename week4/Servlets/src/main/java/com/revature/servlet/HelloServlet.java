package com.revature.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Servlet Hierarchy
 * Servlet - Interface
 * GenericServlet - Abstract Class
 * HttpServlet - Abstract Class
 * MyServlet(HelloServlet) - Concrete Class
 */

/**
 * Servlet Lifecycle
 * init - initial state of the servlet object
 * service - wired up and available for service within the servlet container
 * destroy - decommission the servlet and allow it to be garbage collected
 */

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // this endpoint will print hello world from servlets
        // headers - such as content type
        // body
        // status

        resp.setHeader("Content-Type", "text/html");
        resp.setStatus(200);
        resp.getOutputStream().println("Hello web from Servlets!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
