package com.revature.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try{
            throw new Exception(); // something went wrong and we threw and exception
        }catch(Exception e){
            System.out.println(e.getMessage()); // log the exception
            req.getRequestDispatcher("/error").forward(req, resp); // forward to error handler servlet
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            throw new Exception(); // something went wrong and we threw and exception
        }catch(Exception e){
            System.out.println(e.getMessage()); // log the exception
            req.getRequestDispatcher("/error").forward(req, resp); // forward to error handler servlet
        }
    }
}
