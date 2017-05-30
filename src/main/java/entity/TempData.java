package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by stt44293 on 30.05.2017.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TempData {

    private double temperature;
    private double humidity;
    @XmlAttribute(name = "Unit")
    private String tempUnit;

    public TempData() {
    }

    public TempData(double temperature, double humidity, String tempUnit) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.tempUnit = tempUnit;
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TempData tempData = (TempData) o;

        if (Double.compare(tempData.temperature, temperature) != 0) return false;
        if (Double.compare(tempData.humidity, humidity) != 0) return false;
        return tempUnit != null ? tempUnit.equals(tempData.tempUnit) : tempData.tempUnit == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(temperature);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(humidity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (tempUnit != null ? tempUnit.hashCode() : 0);
        return result;
    }
}
