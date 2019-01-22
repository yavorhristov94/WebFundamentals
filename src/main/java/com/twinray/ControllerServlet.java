package com.twinray;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet()
public class ControllerServlet extends HttpServlet implements Servlet{


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException{
        User user = new User();
        user.setName("Iavor");
        user.setEmail("iavorh@gmail.com");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        /* getServletContext().setAttribute(); Global context */
        /* req.getSession().setAttribute(); Session scope */
        req.setAttribute("user", user); /* Request scope, destroyed after req is done */
        dispatcher.forward(req, resp);
    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

    }
}
