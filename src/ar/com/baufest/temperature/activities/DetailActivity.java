package ar.com.baufest.temperature.activities;

import static ar.com.baufest.temperature.application.BaufestTemperatureApplication.getModel;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import ar.com.baufest.temperature.R;
import ar.com.baufest.temperature.entities.Current_observation;
import ar.com.baufest.temperature.entities.MainItem;
import ar.com.baufest.temperature.entities.Observation_location;

public class DetailActivity extends BaseActivity {

	private TextView city = null;
	private TextView state_name = null;
	private TextView latitude = null;
	private TextView longitude = null;
	private TextView local_tz_long = null;
	private TextView weather = null;
	private TextView temp_c = null;
	private TextView relative_humidity = null;
	private TextView dewpoint_c = null;
	private TextView heat_index_c = null;
	private TextView feelslike_c = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		// Show the Up button in the action bar.
		setupActionBar();

		handleControls();
		initView();
	}

	private void setupActionBar() {
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected final void handleControls() {
		city = (TextView) findViewById(R.id.city);
		state_name = (TextView) findViewById(R.id.state_name);
		latitude = (TextView) findViewById(R.id.latitude);
		longitude = (TextView) findViewById(R.id.longitude);
		local_tz_long = (TextView) findViewById(R.id.local_tz_long);
		weather = (TextView) findViewById(R.id.weather);
		temp_c = (TextView) findViewById(R.id.temp_c);
		relative_humidity = (TextView) findViewById(R.id.relative_humidity);
		dewpoint_c = (TextView) findViewById(R.id.dewpoint_c);
		heat_index_c = (TextView) findViewById(R.id.heat_index_c);
		feelslike_c = (TextView) findViewById(R.id.feelslike_c);
	}

	@Override
	protected final void initView() {
		final MainItem mainItem = getModel().getCurrentMainItem();
		populate(mainItem);
	}

	private void populate(MainItem mainItem) {
		final Current_observation currentObservation = mainItem
				.getCurrentObservation();
		final Observation_location observationLocation = currentObservation
				.getObservation_location();

		city.setText(observationLocation.getCity());
		state_name.setText(observationLocation.getState());
		latitude.setText(observationLocation.getLatitude());
		longitude.setText(observationLocation.getLongitude());
		local_tz_long.setText(currentObservation.getLocal_tz_long());
		weather.setText(currentObservation.getWeather());
		temp_c.setText(String.valueOf(currentObservation.getTemp_c()));
		relative_humidity.setText(currentObservation.getRelative_humidity());
		dewpoint_c.setText(String.valueOf(currentObservation.getDewpoint_c()));
		heat_index_c.setText(currentObservation.getHeat_index_c());
		feelslike_c.setText(currentObservation.getFeelslike_c());
	}
}
