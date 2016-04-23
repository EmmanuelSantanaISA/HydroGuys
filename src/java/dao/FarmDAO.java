package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.Farm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class FarmDAO extends AbstractDao {

    public FarmDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param farm
     */
    public void create(Farm farm) throws DataAccessLayerException {
        super.saveOrUpdate(farm);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param farm
     */
    public void delete(Farm farm) throws DataAccessLayerException {
        super.delete(farm);
    }

    /**
     * Find an Farm by its primary key.
     *
     * @param id
     * @return the found Farm
     */
    public Farm find(int id) throws DataAccessLayerException {
        return (Farm) super.find(Farm.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param farm
     */
    public void update(Farm farm) throws DataAccessLayerException {
        super.saveOrUpdate(farm);
    }

    /**
     * Finds all Farms in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Farm.class);
    }
}
