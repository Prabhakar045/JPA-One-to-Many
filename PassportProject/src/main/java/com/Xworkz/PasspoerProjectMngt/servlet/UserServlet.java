package com.Xworkz.PasspoerProjectMngt.servlet;

import com.Xworkz.PasspoerProjectMngt.dto.UserDTO;
import com.Xworkz.PasspoerProjectMngt.service.UserService;
import com.Xworkz.PasspoerProjectMngt.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/passport")
public class UserServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // process the data from req object
        String passportOffice = req.getParameter("passportOffice");
        System.out.println(passportOffice);

        String givenName = req.getParameter("givenName");
        System.out.println(givenName);

        String surname = req.getParameter("surname");
        System.out.println(surname);

        String dob = req.getParameter("birthday");
        System.out.println(dob);

        String email = req.getParameter("email");
        System.out.println(email);

        String loginId = req.getParameter("loginId");
        System.out.println(loginId);

        String password = req.getParameter("password");
        System.out.println(password);

        String hintQuestion = req.getParameter("hintQuestion");
        System.out.println(hintQuestion);

        String hintAnswer = req.getParameter("hintAnswer");
        System.out.println(hintAnswer);


        UserDTO userDTO = new UserDTO();

        userDTO.setGivenName(givenName);
        userDTO.setPassportOffice(passportOffice);
        userDTO.setDob(dob);
        userDTO.setSurname(surname);
        userDTO.setPassword(password);
        userDTO.setHintQuestion(hintQuestion);
        userDTO.setHintAnswer(hintAnswer);
        userDTO.setEmail(email);
        userDTO.setLoginId(loginId);
//


        userService.validateAndAddUserRegistration(userDTO);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you " + givenName + " for registering with us!");


    }
}





































































//userDTO.setGivenName(req.getParameter("givenName"));