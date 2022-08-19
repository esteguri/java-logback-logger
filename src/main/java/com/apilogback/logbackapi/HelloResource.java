package com.apilogback.logbackapi;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {

    private static final Logger logger
            = LoggerFactory.getLogger(HelloResource.class);

    @GET
    @Produces("text/plain")
    public String hello() {
        logger.debug("API EXECUTED");
        logger.trace("API EXECUTED");
        logger.error("API EXECUTED");
        logger.warn("API EXECUTED");
        return "Hello, World! EXECUTED x3";
    }
}