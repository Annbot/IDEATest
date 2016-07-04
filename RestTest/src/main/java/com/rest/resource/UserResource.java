package com.rest.resource;

import com.rest.dao.DAOUtil;
import com.rest.dao.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Yongpeng Qu on 7/1/2016.
 */
@Path("/user")
public class UserResource {
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public User getUserById(@PathParam("id") String id){
        DAOUtil daoUtil = new DAOUtil();
        User u = daoUtil.getUserById(id);
        return u;
    }
}
