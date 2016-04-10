/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emman
 */
public class Line {
    private int lineID;
    private String lineType;
    private List<Sensor> sensorsList;

    public int getLineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public List<Sensor> getSensorsList() {
        return sensorsList;
    }

    public void setSensorsList(List<Sensor> sensorsList) {
        this.sensorsList = sensorsList;
    }
    
}
