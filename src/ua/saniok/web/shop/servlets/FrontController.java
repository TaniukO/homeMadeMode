package ua.saniok.web.shop.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sAnCho on 15.08.2016.
 */
/*@WebServlet(
        name = "FrontController",
        urlPatterns = "*//*"
)*/
public class FrontController extends HttpServlet {
    protected void BothRequMethod(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String userPath = req.getPathInfo();
        String toRequestDispatcher = "uuups";
        if(userPath.equals("/index")){
            toRequestDispatcher = "testPage";
        }else if(userPath.equals("/registration")){
            toRequestDispatcher = "testPage";
        }
        String pathInfo =req.getPathInfo();
     String url = "/WEB-INF/views/"+toRequestDispatcher+".jsp";

        req.getRequestDispatcher(url).forward(req,resp);
//        PrintWriter out = resp.getWriter();
//        out.print("Front_Control<br>path: "+userPath+"<br>pathInfo: "+req.getPathInfo()+"<br>utl: "+url);
//        out.close();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        BothRequMethod(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        BothRequMethod(req,resp);
    }
}
