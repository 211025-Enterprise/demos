package com.revature.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

// annotation based configuration. value = the url you want to reach the endpoint at
@WebServlet(value = "/json")
public class JSONServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type", "application/json");
        resp.setStatus(200);
        resp.getOutputStream().println("{\"username\":\"bpinkerton\",\"password\":\"1234\",\"object\":{\"key\":\"value\"}}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // implement me
        // I should take information in JSON format out of the request body and print it to the java console.
    }
}
