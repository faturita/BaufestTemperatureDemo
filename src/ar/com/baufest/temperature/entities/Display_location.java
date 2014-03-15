
package ar.com.baufest.temperature.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Display_location {

    @Expose
    private String full;
    @Expose
    private String city;
    @Expose
    private String state;
    @Expose
    private String state_name;
    @Expose
    private String country;
    @Expose
    private String country_iso3166;
    @Expose
    private String zip;
    @Expose
    private String magic;
    @Expose
    private String wmo;
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

    public Display_location withFull(String full) {
        this.full = full;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Display_location withCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Display_location withState(String state) {
        this.state = state;
        return this;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public Display_location withState_name(String state_name) {
        this.state_name = state_name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Display_location withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountry_iso3166() {
        return country_iso3166;
    }

    public void setCountry_iso3166(String country_iso3166) {
        this.country_iso3166 = country_iso3166;
    }

    public Display_location withCountry_iso3166(String country_iso3166) {
        this.country_iso3166 = country_iso3166;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Display_location withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public Display_location withMagic(String magic) {
        this.magic = magic;
        return this;
    }

    public String getWmo() {
        return wmo;
    }

    public void setWmo(String wmo) {
        this.wmo = wmo;
    }

    public Display_location withWmo(String wmo) {
        this.wmo = wmo;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Display_location withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Display_location withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public Display_location withElevation(String elevation) {
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
