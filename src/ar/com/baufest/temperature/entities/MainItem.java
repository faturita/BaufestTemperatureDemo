package ar.com.baufest.temperature.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MainItem {
	private Current_observation currentObservation;

	public Current_observation getCurrentObservation() {
		return currentObservation;
	}

	public void setCurrentObservation(Current_observation currentObservation) {
		this.currentObservation = currentObservation;
	}

	public Observation_location getObservationLocation() {
		return observationLocation;
	}

	public void setObservationLocation(Observation_location observationLocation) {
		this.observationLocation = observationLocation;
	}

	public MainItem(Current_observation currentObservation,
			Observation_location observationLocation) {
		super();
		this.currentObservation = currentObservation;
		this.observationLocation = observationLocation;
	}

	public MainItem(GeneralResponse response) {
		this(response.getCurrent_observation(), response
				.getCurrent_observation().getObservation_location());
	}

	private Observation_location observationLocation;

	public String getFullCityDescription() {
		return currentObservation.getDisplay_location().getFull();
	}

	public String getCelciusFormat() {
		return "" + currentObservation.getTemp_c() + " °C";
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
	
	public String getHighLow() {
		final long min = currentObservation.getDewpoint_c();
		final String max = currentObservation.getHeat_index_c();
		return "" + min + " °C / " + max + " °C";
	}
}
