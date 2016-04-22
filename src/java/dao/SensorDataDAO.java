package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.Farm;
import pojo.SensorData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class SensorDataDAO extends AbstractDao {

    public SensorDataDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param sensorData
     */
    public void create(SensorData sensorData) throws DataAccessLayerException {
        super.saveOrUpdate(sensorData);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param sensorData
     */
    public void delete(SensorData sensorData) throws DataAccessLayerException {
        super.delete(sensorData);
    }

    /**
     * Find an Farm by its primary key.
     *
     * @param id
     * @return the found Farm
     */
    public SensorData find(int id) throws DataAccessLayerException {
        return (SensorData) super.find(SensorData.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param sensorData
     */
    public void update(SensorData sensorData) throws DataAccessLayerException {
        super.saveOrUpdate(sensorData);
    }

    /**
     * Finds all Farms in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(SensorData.class);
    }
}
