package org.josescalia.resteasy.lab.controller;

import org.josescalia.resteasy.lab.dao.DemographicDao;
import org.josescalia.resteasy.lab.entity.Demographic;
import org.josescalia.resteasy.lab.model.RGraphJsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * this controller is using spring-web-mvc mechanism
 * call it using in browser using http://localhost:9095/services/graph/{method path}
 * Created by josescalia on 19/04/14.
 */
@Controller
@Path("/graph")
public class RGraphJsonGenerator {


    @Autowired
    DemographicDao dao;

    @GET
    @Path("/city_population")
    @Produces({MediaType.APPLICATION_JSON})
    public RGraphJsonModel getData() {
        //construct new RGraphJsonModel here...
        RGraphJsonModel jsonModel = new RGraphJsonModel();

        String[] arrLabel = new String[3];
        arrLabel[0] = "Jakarta";
        arrLabel[1] = "Medan";
        arrLabel[2] = "Surabaya";

        Integer[] arrData = new Integer[3];
        arrData[0] = 3;
        arrData[1] = 5;
        arrData[2] = 4;

        //fill jsonModel
        jsonModel.setGraphTitle("RGraph Demo");
        jsonModel.setLabels(arrLabel);
        jsonModel.setData(arrData);

        //returning application/json
        return jsonModel;
    }

    @GET
    @Path("/population")
    @Produces({MediaType.APPLICATION_JSON})
    public RGraphJsonModel getPopulationData() {
        //construct new RGraphJsonModel here...
        RGraphJsonModel jsonModel = new RGraphJsonModel();
        int totalRow = dao.getNum();
        if(totalRow !=0) {
            String[] arrLabel = new String[totalRow];
            Integer[] arrData = new Integer[totalRow];

            int x = 0;
            for (Demographic demographic : dao.getAll()) {
                arrLabel[x] = demographic.getCityName();
                arrData[x] = demographic.getPopulation();
                x++;
            }

            //fill jsonModel
            jsonModel.setGraphTitle("RGraph Demo");
            jsonModel.setLabels(arrLabel);
            jsonModel.setData(arrData);
        }
        //returning application/json
        return jsonModel;
    }

}
