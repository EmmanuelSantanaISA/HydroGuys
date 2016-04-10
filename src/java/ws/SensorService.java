/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import pojo.Line;
import pojo.Sensor;
import pojo.TempSensor;

/**
 * REST Web Service
 *
 * @author emman
 */
@Path("webservice")
@Stateless
public class SensorService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void putSensorData(String content) {
        System.out.println(content);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Line getSensorData(@QueryParam("lineid") int lineID) {
        Line newLine = new Line();
        newLine.setLineID(lineID);
        newLine.setLineType("Type 1");
       TempSensor tempSensor = new TempSensor();
        tempSensor.setValue(10f);
        List<Sensor> sensorsList = new ArrayList<>();
        sensorsList.add(tempSensor);
        newLine.setSensorsList(sensorsList);
        return newLine;
    }

}
