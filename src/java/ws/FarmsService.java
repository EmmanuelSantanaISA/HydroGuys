/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.FarmDAO;
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
import pojo.Farm;

/**
 *
 * @author emman
 */
@Path("farms")
@Stateless
public class FarmsService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Farm> getAll() {
        List<Farm> farms = null;
        try {
            FarmDAO dao = new FarmDAO();
            farms = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Error: " + e.getMessage());
        }
        return farms;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Farm get(@PathParam("id") int id) {
        FarmDAO dao = new FarmDAO();
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Farm farm) {
        FarmDAO dao = new FarmDAO();
        dao.create(farm);
        return Response.ok(farm).build();
    }
}
