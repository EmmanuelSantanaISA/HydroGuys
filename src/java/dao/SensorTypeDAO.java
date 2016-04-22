package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.SensorType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class SensorTypeDAO extends AbstractDao {

    public SensorTypeDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param sensorType
     */
    public void create(SensorType sensorType) throws DataAccessLayerException {
        super.saveOrUpdate(sensorType);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param sensorType
     */
    public void delete(SensorType sensorType) throws DataAccessLayerException {
        super.delete(sensorType);
    }

    /**
     * Find an SensorType by its primary key.
     *
     * @param id
     * @return the found SensorType
     */
    public SensorType find(int id) throws DataAccessLayerException {
        return (SensorType) super.find(SensorType.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param sensorType
     */
    public void update(SensorType sensorType) throws DataAccessLayerException {
        super.saveOrUpdate(sensorType);
    }

    /**
     * Finds all SensorTypes in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(SensorType.class);
    }
}
