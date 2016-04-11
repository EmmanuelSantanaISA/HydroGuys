/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dao.FarmDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import pojo.Farm;

/**
 *
 * @author emman
 */
@Path("farm")
@Stateless
public class FarmService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Farm> getFarms() {
        FarmDao farmDao = new FarmDao();

        return farmDao.findAll();
    }

}
