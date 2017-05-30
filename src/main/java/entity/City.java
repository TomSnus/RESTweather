package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by stt44293 on 30.05.2017.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
    private int zip;
    private String lat;
    private String lon;
    private String name;

    public City() {
    }

    public City(int zip, String lat, String lon, String name) {
        this.zip = zip;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (!lat.equals(city.lat)) return false;
        if (!lon.equals(city.lon)) return false;
        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        int result = lat.hashCode();
        result = 31 * result + lon.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
