
package ar.com.baufest.temperature.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Response {

    @Expose
    private String version;
    @Expose
    private String termsofService;
    @Expose
    private Features features;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Response withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getTermsofService() {
        return termsofService;
    }

    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

    public Response withTermsofService(String termsofService) {
        this.termsofService = termsofService;
        return this;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public Response withFeatures(Features features) {
        this.features = features;
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
