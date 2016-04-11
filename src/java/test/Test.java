/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.FarmDao;
import pojo.Farm;
import pojo.Line;
import pojo.Reader;
import pojo.Sensor;
import pojo.SensorType;
import pojo.Ship;

/**
 *
 * @author emman
 */
public class Test {
    public static void main(String[] args) {
        FarmDao farmDao = new FarmDao();
        Farm farm = new Farm();
        Ship newShip = new Ship();
        Line newLine = new Line();
        Reader newReader = new Reader();
        Sensor tempSensor = new Sensor();
        
        farmDao.create(farm);
    }
   
}
