package org.josescalia.resteasy.lab.model;

import com.sun.xml.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * All we need to create json Model blue print will be declared here using java pojo
 * Created by josescalia on 19/04/14.
 */
@XmlRootElement(name = "rgraph")
public class RGraphJsonModel {

    private String graphTitle;
    private String[] labels;
    private Integer[] data;

    public RGraphJsonModel() {
    }

    @XmlElement
    public String getGraphTitle() {
        return graphTitle;
    }

    public void setGraphTitle(String graphTitle) {
        this.graphTitle = graphTitle;
    }

    @XmlElement
    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    @XmlElement
    public Integer[] getData() {
        return data;
    }

    public void setData(Integer[] data) {
        this.data = data;
    }
}
