/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Farm;
import pojo.Line;
import pojo.Reader;
import pojo.SensorType;
import pojo.Ship;
import ws.FarmsService;
import ws.LinesService;
import ws.ReadersService;
import ws.SensorTypesService;
import ws.ShipsService;

/**
 *
 * @author emman
 */
public class Test {

    ShipsService ss;

    public static void main(String[] args) {
        Test test = new Test();
        test.consume();
    }

    public void consume() {
        try {
            addLine();
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void addSensorTypes() {
        SensorTypesService sts = new SensorTypesService();
        SensorType st = new SensorType();
        st.setType("PH");
        st.setDescription("PH Level");

        SensorType st1 = new SensorType();
        st1.setType("Temperature");
        st1.setDescription("Temp Level");

        SensorType st2 = new SensorType();
        st2.setType("Conductivity");
        st2.setDescription("Conductivity Level");

        SensorType st3 = new SensorType();
        st3.setType("Light");
        st3.setDescription("Light Level");

        sts.add(st);
        sts.add(st1);
        sts.add(st2);
        sts.add(st3);
    }

    private void addLine() throws ParseException {
        //        ShipsService ss = new ShipsService();
//        List<Ship> ships = ss.getAll();
//        for (Ship ship : ships) {
//            System.out.println("Ship Name: " + ship.getShipName());
//        }
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        String dateString = "15-10-2008";
        Date date = format.parse(dateString);

        LinesService ls = new LinesService();
        ShipsService ss = new ShipsService();

        Ship ship = ss.get(5);
        System.out.println("Ship Name: " + ship.getShipName());
        Line line = new Line();
        line.setShip(ship);
        line.setLineName("2");
        line.setStartDate(date);
        ls.add(line);
    }

    private void addShip() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        String dateString = "15-10-2008";
        Date date = format.parse(dateString);

        ShipsService ss = new ShipsService();
        FarmsService fs = new FarmsService();

        Farm farm = fs.get(4);
        System.out.println("FarmID: " + farm.getFarmName());
        Ship ship = new Ship();
        ship.setFarm(farm);
        ship.setShipName("V");
        ship.setStartDate(date);

        ss.add(ship);
    }

    private void addFarms() throws ParseException {
        //        ss = new ShipsService();
//        List<Ship> ships = ss.getAll();
//        for (Ship ship : ships) {
//            System.out.println("ShipID: " + ship.getShipId());
//        }
//        System.out.println("ONE: " + ss.get(1).toString());
        FarmsService fs = new FarmsService();
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        String dateString = "15-10-2008";
        Date date = format.parse(dateString);

        Farm newFarm = new Farm();
        newFarm.setFarmLocation("Zapopan");
        newFarm.setFarmName("Barrancas");
        newFarm.setStartDate(date);

        Farm newFarm2 = new Farm();
        newFarm2.setFarmLocation("Guadalajara");
        newFarm2.setFarmName("Real");
        newFarm2.setStartDate(date);

        Farm newFarm3 = new Farm();
        newFarm3.setFarmLocation("Colima");
        newFarm3.setFarmName("Vistahermosa");
        newFarm3.setStartDate(date);

        Farm newFarm4 = new Farm();
        newFarm4.setFarmLocation("Colima");
        newFarm4.setFarmName("Soledad");
        newFarm4.setStartDate(date);

        fs.add(newFarm);
        fs.add(newFarm2);
        fs.add(newFarm3);
        fs.add(newFarm4);
    }

}
