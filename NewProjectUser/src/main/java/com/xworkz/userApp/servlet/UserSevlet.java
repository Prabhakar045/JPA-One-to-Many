package com.xworkz.userApp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//servelt-api
@WebServlet(urlPatterns = "/user")

public class UserSevlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // process the data from req object
        String userName = req.getParameter("UserName");
        System.out.println(userName);
        String email =req.getParameter("email");
        System.out.println(email);
        String password =req.getParameter("password");
        System.out.println(password);

        PrintWriter printWriter= resp.getWriter();

        printWriter.print("<html>" +
                "<body>" +
                "<h2 style='color: red;'>Thank you " + userName + " for joining with us.</h2>" +
                "</body>" +
                "</html>");
    }
}
