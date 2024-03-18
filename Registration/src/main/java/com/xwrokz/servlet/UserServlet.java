package com.xwrokz.servlet;



@WebServlet("/passport")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String houseNumber = request.getParameter("houseNumber");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String district = request.getParameter("district");
        String state = request.getParameter("state");
        String pincode = request.getParameter("pincode");
        String gender = request.getParameter("gender");

        // Create a UserDTO and set values
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

        // Perform any business logic or validation here

        // Forward the user object to a JSP or process it further
        request.setAttribute("user", user);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}

