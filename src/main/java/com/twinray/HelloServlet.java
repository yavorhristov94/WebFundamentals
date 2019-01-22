package com.twinray;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HelloServlet extends HttpServlet implements Servlet{

@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{
    //Process response and generate the response
    resp.getWriter().write("Hello World");
    }

}
