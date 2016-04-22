/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.SensorDAO;
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
import pojo.Sensor;

/**
 *
 * @author emman
 */
@Path("sensors")
@Stateless
public class SensorsService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sensor> getAll() {
        List<Sensor> sensor = null;
        try {
            SensorDAO dao = new SensorDAO();
            sensor = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Error: " + e.getMessage());
        }
        return sensor;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Sensor get(@PathParam("id") int id) {
        SensorDAO dao = new SensorDAO();
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Sensor farm) {
        SensorDAO dao = new SensorDAO();
        dao.create(farm);
        return Response.ok(farm).build();
    }
}
