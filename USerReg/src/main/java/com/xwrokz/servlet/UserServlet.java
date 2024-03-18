package com.xwrokz.servlet;


import com.xwrokz.dto.UserDTO;
import com.xwrokz.service.UserService;
import com.xwrokz.service.impl.UserServiceImpl;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/user")
public class UserServlet extends HttpServlet {


    UserService userService = new UserServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String firstName = request.getParameter("firstName");   // process
        // validation - service- repository - db

        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String houseNumber = request.getParameter("houseNumber");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String district = request.getParameter("district");
        String state = request.getParameter("state");
        String pincode = request.getParameter("pincode");
        String gender = request.getParameter("gender");



        UserDTO user = new UserDTO();
        user.setFirstName(firstName);
        user.setMiddleName(middleName);
        user.setLastName(lastName);
        user.setHouseNumber(houseNumber);
        user.setStreet(street);
        user.setCity(city);
        user.setDistrict(district);
        user.setState(state);
        user.setPincode(pincode);
        user.setGender(gender);

        System.out.println(user.toString());

        userService.validateAndAddInfo(user);
    }
}

