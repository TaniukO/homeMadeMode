package ua.saniok.web.shop.servlets;

import ua.saniok.web.shop.model.to.DAO_User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sAnCho on 19.08.2016.
 */
@WebServlet(name = "RegServlet"
,urlPatterns = "/regServlet")
public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("uname");
        String passw = request.getParameter("passw");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String dateBirth = request.getParameter("dateBirth");
        int cityKey=0;
        DAO_User dao= new DAO_User();
        int i=dao.insert(login, email, passw, fname, lname, dateBirth,cityKey);
        if (i > 0) {
            response.sendRedirect("/reg?statusReg=\"true\"");
        } else {
            response.sendRedirect("/reg");
        }
    }

}
