/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.ReaderDAO;
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
import pojo.Reader;

/**
 *
 * @author emman
 */
@Path("readers")
@Stateless
public class ReadersService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reader> getAll() {
        List<Reader> readers = null;
        try {
            ReaderDAO dao = new ReaderDAO();
            readers = dao.findAll();
        } catch (Exception e) {
            System.out.println("getAll Error: " + e.getMessage());
        }
        return readers;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Reader get(@PathParam("id") int id) {
        ReaderDAO dao = new ReaderDAO();
        return dao.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Reader reader) {
        ReaderDAO dao = new ReaderDAO();
        dao.create(reader);
        return Response.ok(reader).build();
    }
}
