/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.UserDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojo.User;

/**
 *
 * @author emman
 */
@Path("users")
@Stateless
public class UsersService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAll() {
        List<User> user = null;
        try {
            UserDAO dao = new UserDAO();
            user = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Error: " + e.getMessage());
        }
        return user;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User get(@PathParam("id") int id) {
        UserDAO dao = new UserDAO();
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(User user) {
        UserDAO dao = new UserDAO();
        dao.create(user);
        return Response.ok(user).build();
    }
    
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response doLogin(User user) {
//        UserDAO dao = new UserDAO();
////        dao.create(user);
//        return Response.ok(user).build();
//    }
}
