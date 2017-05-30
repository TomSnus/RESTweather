package rest;

import entity.TempData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by stt44293 on 30.05.2017.
 */
@Path("forecast")
public class ForecastResource {


    @GET
    @Path("region/{value}")
    @Produces(MediaType.APPLICATION_XML)
    public TempData getData(@PathParam("value") int value){
        return new TempData(31.2, 25.2, "C");
    }

    @GET
    @Path("region/{lan}/{lon}")
    public TempData getData(@PathParam("lan") double lan,@PathParam("lan") double lon){
        return new TempData(31.2, 25.2, "C");
    }


}
