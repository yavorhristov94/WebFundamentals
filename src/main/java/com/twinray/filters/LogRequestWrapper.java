package com.twinray.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.logging.Logger;

public class LogRequestWrapper extends HttpServletRequestWrapper {
    Logger logger;

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request the {@link HttpServletRequest} to be wrapped.
     * @throws IllegalArgumentException if the request is null
     */
    public LogRequestWrapper(HttpServletRequest request, Logger logger) {
        super(request);
        this.logger = logger;
    }

    @Override
    public String getHeader(String name) {
        String header = super.getHeader(name);
        logger.info("[getHeader] asked for:" + name +" ; got: " + header);
        return header;
    }
}
