
package ar.com.baufest.temperature.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Features {

    @Expose
    private long conditions;

    public long getConditions() {
        return conditions;
    }

    public void setConditions(long conditions) {
        this.conditions = conditions;
    }

    public Features withConditions(long conditions) {
        this.conditions = conditions;
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
