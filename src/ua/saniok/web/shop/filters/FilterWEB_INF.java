package ua.saniok.web.shop.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sAnCho on 18.08.2016.
 */
public class FilterWEB_INF implements Filter {
    public void destroy() {
    }


    public void init(FilterConfig config) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = ((HttpServletRequest) request);
        String userPath = httpServletRequest.getServletPath();
        String toRequestDispatcher = "uuups";
        switch (userPath) {
            case "/index.html":
                toRequestDispatcher = "index";
                break;
            case "/reg":
                toRequestDispatcher = "reg";
                break;
            case "/login":
                toRequestDispatcher = "login";
                break;
            case "/or":
                toRequestDispatcher = "original";
                break;
        }

        String url = "/WEB-INF/views/"+toRequestDispatcher+".jsp";
        RequestDispatcher rd=httpServletRequest.getRequestDispatcher(url);

        if(userPath.startsWith("/files/"))
            chain.doFilter(request, response);
        else{
            if (rd != null)
                rd.forward (request, response);
        }
    }


}
