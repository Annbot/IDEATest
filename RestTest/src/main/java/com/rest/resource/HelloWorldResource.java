package com.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Yongpeng Qu on 7/1/2016.
 */
@Path("hello")
public class HelloWorldResource {
    public static final String CLICHED_MESSAGE = "Hello World!";
    @GET
    @Produces("text/plain")
        public String getHello(){
        return CLICHED_MESSAGE;
    }
}
