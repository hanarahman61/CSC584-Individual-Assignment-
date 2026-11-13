/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author hana
 */


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        // Names here must match the name="" attributes in index.html
        request.setAttribute("name", request.getParameter("name"));
        request.setAttribute("studentId", request.getParameter("studentId"));
        request.setAttribute("programme", request.getParameter("programme"));
        request.setAttribute("email", request.getParameter("email"));
        request.setAttribute("hobbies", request.getParameter("hobbies"));
        request.setAttribute("intro", request.getParameter("intro"));

        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }
}