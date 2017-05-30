package rest;

import entity.City;
import entity.TempData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stt44293 on 30.05.2017.
 */
@Path("forecast")
public class ForecastResource {
    private static  final List<TempData> values = new ArrayList<TempData>();
    private static  final List<City> cities = new ArrayList<City>();
    @GET
    @Path("region/{value}")
    @Produces(MediaType.APPLICATION_XML)
    public TempData getData(@PathParam("value") final int value){
        City tmp = cities.stream().filter(i->i.getZip() == value).findFirst().get();
        return new TempData(31.2, 25.2, "C", tmp.getLon(), tmp.getLat());
    }

    @GET
    @Path("region/{lan}/{lon}")
    public TempData getData(@PathParam("lan") String lat,@PathParam("lan") String lon){
        City tmp = cities.stream().filter(i-> (i.getLat().equals(lat) && i.getLon().equals(lon))).findFirst().get();
        return new TempData(31.2, 25.2, "C", tmp.getLon(), tmp.getLat());
    }

    @PUT
    @Path("new")
    @Consumes({MediaType.APPLICATION_JSON,	MediaType.APPLICATION_XML})
    public void insertData(TempData data) {
        values.add(data);
        System.out.println(data);
    }


}
