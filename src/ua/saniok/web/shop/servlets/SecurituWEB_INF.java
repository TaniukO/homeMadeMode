package ua.saniok.web.shop.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sAnCho on 18.08.2016.
 */
public class SecurituWEB_INF extends HttpServlet {
        protected void bothMethod(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String userPath = req.getServletPath();
            String url=userPath+req.getPathInfo();
            PrintWriter out = resp.getWriter();
            out.print("<br>SecurWeb_Inf<br>path: "+url+"<br>context: "+userPath);
            out.print("attribute: " +req.getAttribute("urlFromFilter")+"<br>"+req.getAttribute("userPath"));
            out.close();
}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        bothMethod(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        bothMethod(request,response);
    }
}
