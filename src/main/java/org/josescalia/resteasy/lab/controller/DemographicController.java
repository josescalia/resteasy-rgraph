package org.josescalia.resteasy.lab.controller;

import org.josescalia.resteasy.lab.dao.DemographicDao;
import org.josescalia.resteasy.lab.entity.Demographic;
import org.josescalia.resteasy.lab.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by josescalia on 04/05/14.
 */
@Controller
@Path("/demographic")
public class DemographicController {


    @Autowired
    DemographicDao service;

    @GET
    @Path("/count")
    @Produces({MediaType.APPLICATION_JSON})
    public ResponseMessage getNum(){
        return new ResponseMessage(200,String.valueOf(service.getNum()));
    }

    @POST
    @Path("/save")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({"application/x-www-form-urlencoded","application/json"})
    public ResponseMessage save(@FormParam("cityName") String cityName, @FormParam("population") int population){
        if(service.save(new Demographic(null,cityName, population))!=null){
            return new ResponseMessage(200,"Save Succeed");
        }else{
            return new ResponseMessage(200,"Save Failed");
        }

    }

}
