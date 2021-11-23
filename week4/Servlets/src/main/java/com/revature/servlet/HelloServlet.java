package com.revature.servlet;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Cat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

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

// this servlet is configured in the web.xml file located in webapp/WEB-INF/
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



        // this section is going retrieve all the header
        Enumeration<String> headers = req.getHeaderNames();
        System.out.println("Headers: ");
        while(headers.hasMoreElements()){
            String header = headers.nextElement();
            System.out.printf("%s : %s,\n", header, req.getHeader(header));
        }

        Enumeration<String> parameters = req.getParameterNames();
        System.out.println("Parameters: ");
        while(parameters.hasMoreElements()){
            String parameter = parameters.nextElement();
            System.out.printf("%s : %s,\n", parameter, req.getParameter(parameter));
        }


        // first method of getting a request body
        BufferedReader reader = req.getReader();
        StringBuilder builder = new StringBuilder();
        String temp;
//        while((temp = reader.readLine()) != null){
//            builder.append(temp).append("\n");
//        }
        String bufferedBody = builder.toString();

        String collectorBody = req.getReader().lines().collect(Collectors.joining("\n"));

        String json = collectorBody;

        System.out.println("Buffered Body: ");
        System.out.println(bufferedBody);

        System.out.println("Collector Body: ");
        System.out.println(collectorBody);


        // parse the json string into a java object

        ObjectMapper mapper = new ObjectMapper();
        Cat cat = null;
        try{
            cat = mapper.readValue(json, Cat.class);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(cat);


        resp.setHeader("Content-Type", "application/json");
        String newJson = mapper.writeValueAsString(cat);
        resp.getWriter().println(newJson);
    }


}
