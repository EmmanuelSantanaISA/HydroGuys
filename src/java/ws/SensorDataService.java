/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.SensorDataDAO;
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
import pojo.SensorData;

/**
 *
 * @author emman
 */
@Path("sensordata")
@Stateless
public class SensorDataService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SensorData> getAll() {
        List<SensorData> sensorData = null;
        try {
            SensorDataDAO dao = new SensorDataDAO();
            sensorData = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Error: " + e.getMessage());
        }
        return sensorData;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SensorData get(@PathParam("id") int id) {
        SensorDataDAO dao = new SensorDataDAO();
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(SensorData farm) {
        SensorDataDAO dao = new SensorDataDAO();
        dao.create(farm);
        return Response.ok(farm).build();
    }
}
