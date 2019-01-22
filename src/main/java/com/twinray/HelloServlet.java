package com.twinray;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = {"/home"},
    initParams = {@WebInitParam(name = "ProductName", value="Hello App")})
public class HelloServlet extends HttpServlet implements Servlet{

    String appName = "My App";

    @Override
    public void init() throws ServletException {
        appName = getInitParameter("ProductName");
    }

    @Override
public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
    //Process response and generate the response
    String name = req.getParameter("name");
    if(name != null && name != "" ){
        resp.setContentType("text/xml");
        resp.getWriter().printf("<application>"+
                "<name>Hello %s</name>"+
                "<product>%s</product>" +
                "</application>", name, appName);
    }else {
        throw new ServletException("A name should be entered");
        //To handle this, we specify in the web.xml

//        resp.getWriter().write("Hello World");
    }
    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
//When a post is given OR the ?name= param is entered, you get a custom resp
         String name = req.getParameter("name");
         if(name != null && name != "" ){
            resp.getWriter().printf("Hello %s", name);
         }else resp.getWriter().write("Hello World");
    }
}
