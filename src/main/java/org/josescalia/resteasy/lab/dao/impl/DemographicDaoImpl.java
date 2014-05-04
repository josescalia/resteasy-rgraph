package org.josescalia.resteasy.lab.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.josescalia.resteasy.lab.dao.DemographicDao;
import org.josescalia.resteasy.lab.entity.Demographic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by josescalia on 04/05/14.
 */
@Repository
public class DemographicDaoImpl implements DemographicDao {

    static Logger logger = Logger.getLogger(DemographicDaoImpl.class.getName());

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public Demographic save(Demographic object) {
        sessionFactory.getCurrentSession().save(object);
        return object;
    }

    @Override
    @Transactional(readOnly = true)
    public int getNum() {
        return sessionFactory.getCurrentSession().createQuery(" from Demographic").list().size();
    }


    @Override
    @Transactional(readOnly = true)
    public List<Demographic> getAll() {
        Query query = sessionFactory.getCurrentSession().createQuery(" from Demographic");
        return query.list();
    }
}
