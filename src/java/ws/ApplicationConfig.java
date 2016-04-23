/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author emman
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ws.FarmsService.class);
        resources.add(ws.LinesService.class);
        resources.add(ws.ReadersService.class);
        resources.add(ws.SensorDataService.class);
        resources.add(ws.SensorTypesService.class);
        resources.add(ws.SensorsService.class);
        resources.add(ws.ShipsService.class);
        resources.add(ws.UsersService.class);

    }

}
