package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.Farm;
import pojo.Line;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class LineDAO extends AbstractDao {

    public LineDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param line
     */
    public void create(Line line) throws DataAccessLayerException {
        super.saveOrUpdate(line);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param line
     */
    public void delete(Line line) throws DataAccessLayerException {
        super.delete(line);
    }

    /**
     * Find an Farm by its primary key.
     *
     * @param id
     * @return the found Farm
     */
    public Line find(int id) throws DataAccessLayerException {
        return (Line) super.find(Line.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param line
     */
    public void update(Line line) throws DataAccessLayerException {
        super.saveOrUpdate(line);
    }

    /**
     * Finds all Farms in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Line.class);
    }
}
