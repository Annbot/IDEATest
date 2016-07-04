package com.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Yongpeng Qu on 7/1/2016.
 */
@Path("/users/{username: [a-zA-Z][a-zA-Z_0-9]*}")
public class TestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser(@PathParam("username") String userName) {
        if(userName.equals("zhang")){
            return "zhang san";
        }else{
            return "li si";
        }
    }
}
