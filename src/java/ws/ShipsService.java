/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.ShipDAO;
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
import pojo.Ship;

/**
 *
 * @author emman
 */
@Path("ships")
@Stateless
public class ShipsService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ship> getAll() {
        List<Ship> ships = null;
        try {
            ShipDAO dao = new ShipDAO();
            ships = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Ships Error: " + e.getMessage());
        }
        return ships;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ship get(@PathParam("id") int id) {
        ShipDAO dao = null;
        try {
            dao = new ShipDAO();

        } catch (Exception e) {
            System.out.println("get Ships Error: " + e.getMessage());
        }
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Ship ship) {
        ShipDAO dao = new ShipDAO();
        dao.create(ship);
        return Response.ok(ship).build();
    }

}
