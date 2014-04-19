package org.josescalia.resteasy.lab.controller;

import org.josescalia.resteasy.lab.model.RGraphJsonModel;
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

        //feel jsonModel
        jsonModel.setGraphTitle("RGraph Demo");
        jsonModel.setLabels(arrLabel);
        jsonModel.setData(arrData);

        //returning application/json
        return jsonModel;
    }

}
