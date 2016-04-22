package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.Farm;
import pojo.Sensor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class SensorDAO extends AbstractDao {

    public SensorDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param sensor
     */
    public void create(Sensor sensor) throws DataAccessLayerException {
        super.saveOrUpdate(sensor);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param sensor
     */
    public void delete(Sensor sensor) throws DataAccessLayerException {
        super.delete(sensor);
    }

    /**
     * Find an Farm by its primary key.
     *
     * @param id
     * @return the found Farm
     */
    public Sensor find(int id) throws DataAccessLayerException {
        return (Sensor) super.find(Sensor.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param sensor
     */
    public void update(Sensor sensor) throws DataAccessLayerException {
        super.saveOrUpdate(sensor);
    }

    /**
     * Finds all Farms in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Sensor.class);
    }
}
