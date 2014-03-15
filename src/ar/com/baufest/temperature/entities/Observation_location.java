
package ar.com.baufest.temperature.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Observation_location {

    @Expose
    private String full;
    @Expose
    private String city;
    @Expose
    private String state;
    @Expose
    private String country;
    @Expose
    private String country_iso3166;
    @Expose
    private String latitude;
    @Expose
    private String longitude;
    @Expose
    private String elevation;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public Observation_location withFull(String full) {
        this.full = full;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Observation_location withCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Observation_location withState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Observation_location withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountry_iso3166() {
        return country_iso3166;
    }

    public void setCountry_iso3166(String country_iso3166) {
        this.country_iso3166 = country_iso3166;
    }

    public Observation_location withCountry_iso3166(String country_iso3166) {
        this.country_iso3166 = country_iso3166;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Observation_location withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Observation_location withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public Observation_location withElevation(String elevation) {
        this.elevation = elevation;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

}
