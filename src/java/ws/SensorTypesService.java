/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.SensorTypeDAO;
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
import pojo.SensorType;

/**
 *
 * @author emman
 */
@Path("sensortypes")
@Stateless
public class SensorTypesService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SensorType> getAll() {
        List<SensorType> farms = null;
        try {
            SensorTypeDAO dao = new SensorTypeDAO();
            farms = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Error: " + e.getMessage());
        }
        return farms;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SensorType get(@PathParam("id") int id) {
        SensorTypeDAO dao = new SensorTypeDAO();
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(SensorType farm) {
        SensorTypeDAO dao = new SensorTypeDAO();
        dao.create(farm);
        return Response.ok(farm).build();
    }
}
