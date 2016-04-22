package dao;

import java.util.List;
import hibernate.DataAccessLayerException;
import pojo.Farm;
import pojo.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emmanuelsantana
 */
public class UserDAO extends AbstractDao {

    public UserDAO() {
        super();
    }

    /**
     * Insert a new Event into the database.
     *
     * @param user
     */
    public void create(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }

    /**
     * Delete a detached Event from the database.
     *
     * @param user
     */
    public void delete(User user) throws DataAccessLayerException {
        super.delete(user);
    }

    /**
     * Find an Farm by its primary key.
     *
     * @param id
     * @return the found Farm
     */
    public User find(int id) throws DataAccessLayerException {
        return (User) super.find(User.class, id);
    }

    /**
     * Updates the state of a detached Event.
     *
     * @param user
     */
    public void update(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }

    /**
     * Finds all Farms in the database.
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(User.class);
    }
    
    public User doLogin(User user) throws DataAccessLayerException {
        return (User) super.findUser(user);
    }
}
