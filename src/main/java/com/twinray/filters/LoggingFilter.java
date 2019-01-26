package com.twinray.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@WebFilter(urlPatterns = "*")
public class LoggingFilter implements Filter {

    static Logger logger = LogManager.getLogger(LoggingFilter.class);

    FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("Request made to: " + ((HttpServletRequest)request).getRequestURI());
        LogRequestWrapper wrapper = new LogRequestWrapper((HttpServletRequest)request, logger);
        chain.doFilter(wrapper, response);
    }


    @Override
    public void destroy() {

    }
}
