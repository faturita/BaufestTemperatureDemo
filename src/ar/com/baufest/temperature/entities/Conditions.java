
package ar.com.baufest.temperature.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Conditions {

    @Expose
    private Response response;
    @Expose
    private Current_observation current_observation;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Conditions withResponse(Response response) {
        this.response = response;
        return this;
    }

    public Current_observation getCurrent_observation() {
        return current_observation;
    }

    public void setCurrent_observation(Current_observation current_observation) {
        this.current_observation = current_observation;
    }

    public Conditions withCurrent_observation(Current_observation current_observation) {
        this.current_observation = current_observation;
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
