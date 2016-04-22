/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.FarmDAO;
import dao.LineDAO;
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
import pojo.Line;

/**
 *
 * @author emman
 */
@Path("lines")
@Stateless
public class LinesService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Line> getAll() {
        List<Line> line = null;
        try {
            LineDAO dao = new LineDAO();
            line = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Error: " + e.getMessage());
        }
        return line;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Line get(@PathParam("id") int id) {
        LineDAO dao = new LineDAO();
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Line farm) {
        LineDAO dao = new LineDAO();
        dao.create(farm);
        return Response.ok(farm).build();
    }
}
