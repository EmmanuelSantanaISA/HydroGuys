package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.Reader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class ReaderDAO extends AbstractDao {

    public ReaderDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param reader
     */
    public void create(Reader reader) throws DataAccessLayerException {
        super.saveOrUpdate(reader);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param reader
     */
    public void delete(Reader reader) throws DataAccessLayerException {
        super.delete(reader);
    }

    /**
     * Find an Reader by its primary key.
     *
     * @param id
     * @return the found Reader
     */
    public Reader find(int id) throws DataAccessLayerException {
        return (Reader) super.find(Reader.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param reader
     */
    public void update(Reader reader) throws DataAccessLayerException {
        super.saveOrUpdate(reader);
    }

    /**
     * Finds all Farms in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Reader.class);
    }
}
