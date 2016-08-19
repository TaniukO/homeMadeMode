package ua.saniok.web.shop.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by sAnCho on 19.08.2016.
 */
public class FilterCharSet implements Filter {
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        chain.doFilter(req, resp);
    }

}
