
package ar.com.baufest.temperature.entities;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Current_observation {

    @Expose
    private Image image;
    @Expose
    private Display_location display_location;
    @Expose
    private Observation_location observation_location;
    @Expose
    private Estimated estimated;
    @Expose
    private String station_id;
    @Expose
    private String observation_time;
    @Expose
    private String observation_time_rfc822;
    @Expose
    private String observation_epoch;
    @Expose
    private String local_time_rfc822;
    @Expose
    private String local_epoch;
    @Expose
    private String local_tz_short;
    @Expose
    private String local_tz_long;
    @Expose
    private String local_tz_offset;
    @Expose
    private String weather;
    @Expose
    private String temperature_string;
    @Expose
    private double temp_f;
    @Expose
    private double temp_c;
    @Expose
    private String relative_humidity;
    @Expose
    private String wind_string;
    @Expose
    private String wind_dir;
    @Expose
    private long wind_degrees;
    @Expose
    private double wind_mph;
    @Expose
    private String wind_gust_mph;
    @Expose
    private double wind_kph;
    @Expose
    private String wind_gust_kph;
    @Expose
    private String pressure_mb;
    @Expose
    private String pressure_in;
    @Expose
    private String pressure_trend;
    @Expose
    private String dewpoint_string;
    @Expose
    private long dewpoint_f;
    @Expose
    private long dewpoint_c;
    @Expose
    private String heat_index_string;
    @Expose
    private String heat_index_f;
    @Expose
    private String heat_index_c;
    @Expose
    private String windchill_string;
    @Expose
    private String windchill_f;
    @Expose
    private String windchill_c;
    @Expose
    private String feelslike_string;
    @Expose
    private String feelslike_f;
    @Expose
    private String feelslike_c;
    @Expose
    private String visibility_mi;
    @Expose
    private String visibility_km;
    @Expose
    private String solarradiation;
    @SerializedName("UV")
    @Expose
    private String uV;
    @Expose
    private String precip_1hr_string;
    @Expose
    private String precip_1hr_in;
    @Expose
    private String precip_1hr_metric;
    @Expose
    private String precip_today_string;
    @Expose
    private String precip_today_in;
    @Expose
    private String precip_today_metric;
    @Expose
    private String icon;
    @Expose
    private String icon_url;
    @Expose
    private String forecast_url;
    @Expose
    private String history_url;
    @Expose
    private String ob_url;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Current_observation withImage(Image image) {
        this.image = image;
        return this;
    }

    public Display_location getDisplay_location() {
        return display_location;
    }

    public void setDisplay_location(Display_location display_location) {
        this.display_location = display_location;
    }

    public Current_observation withDisplay_location(Display_location display_location) {
        this.display_location = display_location;
        return this;
    }

    public Observation_location getObservation_location() {
        return observation_location;
    }

    public void setObservation_location(Observation_location observation_location) {
        this.observation_location = observation_location;
    }

    public Current_observation withObservation_location(Observation_location observation_location) {
        this.observation_location = observation_location;
        return this;
    }

    public Estimated getEstimated() {
        return estimated;
    }

    public void setEstimated(Estimated estimated) {
        this.estimated = estimated;
    }

    public Current_observation withEstimated(Estimated estimated) {
        this.estimated = estimated;
        return this;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public Current_observation withStation_id(String station_id) {
        this.station_id = station_id;
        return this;
    }

    public String getObservation_time() {
        return observation_time;
    }

    public void setObservation_time(String observation_time) {
        this.observation_time = observation_time;
    }

    public Current_observation withObservation_time(String observation_time) {
        this.observation_time = observation_time;
        return this;
    }

    public String getObservation_time_rfc822() {
        return observation_time_rfc822;
    }

    public void setObservation_time_rfc822(String observation_time_rfc822) {
        this.observation_time_rfc822 = observation_time_rfc822;
    }

    public Current_observation withObservation_time_rfc822(String observation_time_rfc822) {
        this.observation_time_rfc822 = observation_time_rfc822;
        return this;
    }

    public String getObservation_epoch() {
        return observation_epoch;
    }

    public void setObservation_epoch(String observation_epoch) {
        this.observation_epoch = observation_epoch;
    }

    public Current_observation withObservation_epoch(String observation_epoch) {
        this.observation_epoch = observation_epoch;
        return this;
    }

    public String getLocal_time_rfc822() {
        return local_time_rfc822;
    }

    public void setLocal_time_rfc822(String local_time_rfc822) {
        this.local_time_rfc822 = local_time_rfc822;
    }

    public Current_observation withLocal_time_rfc822(String local_time_rfc822) {
        this.local_time_rfc822 = local_time_rfc822;
        return this;
    }

    public String getLocal_epoch() {
        return local_epoch;
    }

    public void setLocal_epoch(String local_epoch) {
        this.local_epoch = local_epoch;
    }

    public Current_observation withLocal_epoch(String local_epoch) {
        this.local_epoch = local_epoch;
        return this;
    }

    public String getLocal_tz_short() {
        return local_tz_short;
    }

    public void setLocal_tz_short(String local_tz_short) {
        this.local_tz_short = local_tz_short;
    }

    public Current_observation withLocal_tz_short(String local_tz_short) {
        this.local_tz_short = local_tz_short;
        return this;
    }

    public String getLocal_tz_long() {
        return local_tz_long;
    }

    public void setLocal_tz_long(String local_tz_long) {
        this.local_tz_long = local_tz_long;
    }

    public Current_observation withLocal_tz_long(String local_tz_long) {
        this.local_tz_long = local_tz_long;
        return this;
    }

    public String getLocal_tz_offset() {
        return local_tz_offset;
    }

    public void setLocal_tz_offset(String local_tz_offset) {
        this.local_tz_offset = local_tz_offset;
    }

    public Current_observation withLocal_tz_offset(String local_tz_offset) {
        this.local_tz_offset = local_tz_offset;
        return this;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Current_observation withWeather(String weather) {
        this.weather = weather;
        return this;
    }

    public String getTemperature_string() {
        return temperature_string;
    }

    public void setTemperature_string(String temperature_string) {
        this.temperature_string = temperature_string;
    }

    public Current_observation withTemperature_string(String temperature_string) {
        this.temperature_string = temperature_string;
        return this;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public Current_observation withTemp_f(double temp_f) {
        this.temp_f = temp_f;
        return this;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public Current_observation withTemp_c(double temp_c) {
        this.temp_c = temp_c;
        return this;
    }

    public String getRelative_humidity() {
        return relative_humidity;
    }

    public void setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
    }

    public Current_observation withRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
        return this;
    }

    public String getWind_string() {
        return wind_string;
    }

    public void setWind_string(String wind_string) {
        this.wind_string = wind_string;
    }

    public Current_observation withWind_string(String wind_string) {
        this.wind_string = wind_string;
        return this;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Current_observation withWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
        return this;
    }

    public long getWind_degrees() {
        return wind_degrees;
    }

    public void setWind_degrees(long wind_degrees) {
        this.wind_degrees = wind_degrees;
    }

    public Current_observation withWind_degrees(long wind_degrees) {
        this.wind_degrees = wind_degrees;
        return this;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public Current_observation withWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
        return this;
    }

    public String getWind_gust_mph() {
        return wind_gust_mph;
    }

    public void setWind_gust_mph(String wind_gust_mph) {
        this.wind_gust_mph = wind_gust_mph;
    }

    public Current_observation withWind_gust_mph(String wind_gust_mph) {
        this.wind_gust_mph = wind_gust_mph;
        return this;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public Current_observation withWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
        return this;
    }

    public String getWind_gust_kph() {
        return wind_gust_kph;
    }

    public void setWind_gust_kph(String wind_gust_kph) {
        this.wind_gust_kph = wind_gust_kph;
    }

    public Current_observation withWind_gust_kph(String wind_gust_kph) {
        this.wind_gust_kph = wind_gust_kph;
        return this;
    }

    public String getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(String pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public Current_observation withPressure_mb(String pressure_mb) {
        this.pressure_mb = pressure_mb;
        return this;
    }

    public String getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(String pressure_in) {
        this.pressure_in = pressure_in;
    }

    public Current_observation withPressure_in(String pressure_in) {
        this.pressure_in = pressure_in;
        return this;
    }

    public String getPressure_trend() {
        return pressure_trend;
    }

    public void setPressure_trend(String pressure_trend) {
        this.pressure_trend = pressure_trend;
    }

    public Current_observation withPressure_trend(String pressure_trend) {
        this.pressure_trend = pressure_trend;
        return this;
    }

    public String getDewpoint_string() {
        return dewpoint_string;
    }

    public void setDewpoint_string(String dewpoint_string) {
        this.dewpoint_string = dewpoint_string;
    }

    public Current_observation withDewpoint_string(String dewpoint_string) {
        this.dewpoint_string = dewpoint_string;
        return this;
    }

    public long getDewpoint_f() {
        return dewpoint_f;
    }

    public void setDewpoint_f(long dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public Current_observation withDewpoint_f(long dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
        return this;
    }

    public long getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(long dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public Current_observation withDewpoint_c(long dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
        return this;
    }

    public String getHeat_index_string() {
        return heat_index_string;
    }

    public void setHeat_index_string(String heat_index_string) {
        this.heat_index_string = heat_index_string;
    }

    public Current_observation withHeat_index_string(String heat_index_string) {
        this.heat_index_string = heat_index_string;
        return this;
    }

    public String getHeat_index_f() {
        return heat_index_f;
    }

    public void setHeat_index_f(String heat_index_f) {
        this.heat_index_f = heat_index_f;
    }

    public Current_observation withHeat_index_f(String heat_index_f) {
        this.heat_index_f = heat_index_f;
        return this;
    }

    public String getHeat_index_c() {
        return heat_index_c;
    }

    public void setHeat_index_c(String heat_index_c) {
        this.heat_index_c = heat_index_c;
    }

    public Current_observation withHeat_index_c(String heat_index_c) {
        this.heat_index_c = heat_index_c;
        return this;
    }

    public String getWindchill_string() {
        return windchill_string;
    }

    public void setWindchill_string(String windchill_string) {
        this.windchill_string = windchill_string;
    }

    public Current_observation withWindchill_string(String windchill_string) {
        this.windchill_string = windchill_string;
        return this;
    }

    public String getWindchill_f() {
        return windchill_f;
    }

    public void setWindchill_f(String windchill_f) {
        this.windchill_f = windchill_f;
    }

    public Current_observation withWindchill_f(String windchill_f) {
        this.windchill_f = windchill_f;
        return this;
    }

    public String getWindchill_c() {
        return windchill_c;
    }

    public void setWindchill_c(String windchill_c) {
        this.windchill_c = windchill_c;
    }

    public Current_observation withWindchill_c(String windchill_c) {
        this.windchill_c = windchill_c;
        return this;
    }

    public String getFeelslike_string() {
        return feelslike_string;
    }

    public void setFeelslike_string(String feelslike_string) {
        this.feelslike_string = feelslike_string;
    }

    public Current_observation withFeelslike_string(String feelslike_string) {
        this.feelslike_string = feelslike_string;
        return this;
    }

    public String getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(String feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public Current_observation withFeelslike_f(String feelslike_f) {
        this.feelslike_f = feelslike_f;
        return this;
    }

    public String getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(String feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public Current_observation withFeelslike_c(String feelslike_c) {
        this.feelslike_c = feelslike_c;
        return this;
    }

    public String getVisibility_mi() {
        return visibility_mi;
    }

    public void setVisibility_mi(String visibility_mi) {
        this.visibility_mi = visibility_mi;
    }

    public Current_observation withVisibility_mi(String visibility_mi) {
        this.visibility_mi = visibility_mi;
        return this;
    }

    public String getVisibility_km() {
        return visibility_km;
    }

    public void setVisibility_km(String visibility_km) {
        this.visibility_km = visibility_km;
    }

    public Current_observation withVisibility_km(String visibility_km) {
        this.visibility_km = visibility_km;
        return this;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Current_observation withSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
        return this;
    }

    public String getUV() {
        return uV;
    }

    public void setUV(String uV) {
        this.uV = uV;
    }

    public Current_observation withUV(String uV) {
        this.uV = uV;
        return this;
    }

    public String getPrecip_1hr_string() {
        return precip_1hr_string;
    }

    public void setPrecip_1hr_string(String precip_1hr_string) {
        this.precip_1hr_string = precip_1hr_string;
    }

    public Current_observation withPrecip_1hr_string(String precip_1hr_string) {
        this.precip_1hr_string = precip_1hr_string;
        return this;
    }

    public String getPrecip_1hr_in() {
        return precip_1hr_in;
    }

    public void setPrecip_1hr_in(String precip_1hr_in) {
        this.precip_1hr_in = precip_1hr_in;
    }

    public Current_observation withPrecip_1hr_in(String precip_1hr_in) {
        this.precip_1hr_in = precip_1hr_in;
        return this;
    }

    public String getPrecip_1hr_metric() {
        return precip_1hr_metric;
    }

    public void setPrecip_1hr_metric(String precip_1hr_metric) {
        this.precip_1hr_metric = precip_1hr_metric;
    }

    public Current_observation withPrecip_1hr_metric(String precip_1hr_metric) {
        this.precip_1hr_metric = precip_1hr_metric;
        return this;
    }

    public String getPrecip_today_string() {
        return precip_today_string;
    }

    public void setPrecip_today_string(String precip_today_string) {
        this.precip_today_string = precip_today_string;
    }

    public Current_observation withPrecip_today_string(String precip_today_string) {
        this.precip_today_string = precip_today_string;
        return this;
    }

    public String getPrecip_today_in() {
        return precip_today_in;
    }

    public void setPrecip_today_in(String precip_today_in) {
        this.precip_today_in = precip_today_in;
    }

    public Current_observation withPrecip_today_in(String precip_today_in) {
        this.precip_today_in = precip_today_in;
        return this;
    }

    public String getPrecip_today_metric() {
        return precip_today_metric;
    }

    public void setPrecip_today_metric(String precip_today_metric) {
        this.precip_today_metric = precip_today_metric;
    }

    public Current_observation withPrecip_today_metric(String precip_today_metric) {
        this.precip_today_metric = precip_today_metric;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Current_observation withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public Current_observation withIcon_url(String icon_url) {
        this.icon_url = icon_url;
        return this;
    }

    public String getForecast_url() {
        return forecast_url;
    }

    public void setForecast_url(String forecast_url) {
        this.forecast_url = forecast_url;
    }

    public Current_observation withForecast_url(String forecast_url) {
        this.forecast_url = forecast_url;
        return this;
    }

    public String getHistory_url() {
        return history_url;
    }

    public void setHistory_url(String history_url) {
        this.history_url = history_url;
    }

    public Current_observation withHistory_url(String history_url) {
        this.history_url = history_url;
        return this;
    }

    public String getOb_url() {
        return ob_url;
    }

    public void setOb_url(String ob_url) {
        this.ob_url = ob_url;
    }

    public Current_observation withOb_url(String ob_url) {
        this.ob_url = ob_url;
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
