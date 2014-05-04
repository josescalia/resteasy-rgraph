package org.josescalia.resteasy.lab.dao;

import org.josescalia.resteasy.lab.entity.Demographic;

import java.util.List;

/**
 * Created by josescalia on 04/05/14.
 */
public interface DemographicDao {
    Demographic save(Demographic object);
    int getNum();

    List<Demographic> getAll();
}
