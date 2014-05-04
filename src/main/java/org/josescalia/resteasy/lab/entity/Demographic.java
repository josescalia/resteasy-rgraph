package org.josescalia.resteasy.lab.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by josescalia on 04/05/14.
 */
@Entity
@Table(name = "demographic")
public class Demographic implements Serializable{

    private static final long serialVersionUID = -3445095243882793993L;
    private Long id;
    private String cityName;
    private int population;

    public Demographic() {
    }

    public Demographic(Long id, String cityName, int population) {
        this.id = id;
        this.cityName = cityName;
        this.population = population;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", precision = 11)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CITY_NAME", length = 100)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Column(name = "POPULATION", precision = 10)
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Demographic{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", population=" + population +
                '}';
    }
}
