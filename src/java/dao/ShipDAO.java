package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.Ship;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class ShipDAO extends AbstractDao {

    public ShipDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param ship
     */
    public void create(Ship ship) throws DataAccessLayerException {
        super.saveOrUpdate(ship);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param ship
     */
    public void delete(Ship ship) throws DataAccessLayerException {
        super.delete(ship);
    }

    /**
     * Find an Ship by its primary key.
     *
     * @param id
     * @return the found Ship
     */
    public Ship find(int id) throws DataAccessLayerException {
        return (Ship) super.find(Ship.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param ship
     */
    public void update(Ship ship) throws DataAccessLayerException {
        super.saveOrUpdate(ship);
    }

    /**
     * Finds all Ships in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Ship.class);
    }
}
