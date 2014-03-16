package ar.com.baufest.temperature.activities;

import static ar.com.baufest.temperature.application.BaufestTemperatureApplication.getModel;
import static ar.com.baufest.temperature.application.Constants.CITIES;
import static ar.com.baufest.temperature.application.Constants.CONDITIONS_URL;
import static ar.com.baufest.temperature.application.Constants.ERROR;
import static ar.com.baufest.temperature.application.Constants.OK;
import static ar.com.baufest.temperature.ws.RestWebService.callRestfulWebService;

import java.util.ArrayList;
import java.util.List;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import ar.com.baufest.temperature.R;
import ar.com.baufest.temperature.adapters.MainAdapter;
import ar.com.baufest.temperature.entities.GeneralResponse;
import ar.com.baufest.temperature.entities.MainItem;

import com.google.gson.Gson;

public class MainActivity extends BaseActivity {
	private ProgressDialog progressBar = null;
	private ListView lstMainItems = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		handleControls();
		initView();
	}

	@Override
	protected final void handleControls() {
		progressBar = new ProgressDialog(this);
		progressBar.setTitle(getString(R.string.title_activity_main_spinner));
		
		lstMainItems = (ListView) findViewById(R.id.lstMainItems);
	}

	@Override
	protected final void initView() {
		new ConditionsService().execute();
	}

	private void populateTemperatureList() {
		final MainAdapter adapter = new MainAdapter(this, getModel().getMainItems(), this);
		lstMainItems.setAdapter(adapter);		
	}

	public void btnDashboardClick(MainItem item) {
		getModel().setCurrentMainItem(item);
		startActivity(new Intent(this, DetailActivity.class));
	}

	class ConditionsService extends AsyncTask<String, Integer, String> {

		@Override
		protected void onPreExecute() {
			progressBar.cancel();
			progressBar.show();
		}

		@Override
		protected String doInBackground(String... params) {
			final Gson gson = new Gson();
			String jsonResponse = null;
			String result = OK;
			final List<MainItem> responses = new ArrayList<MainItem>();

			for (final String city : CITIES) {
				try {
					jsonResponse = callRestfulWebService(String.format(
							CONDITIONS_URL, city));
					final GeneralResponse generalResponse = gson.fromJson(
							jsonResponse, GeneralResponse.class);
					responses.add(new MainItem(generalResponse));
				} catch (Exception e) {
					result = ERROR;
					e.printStackTrace();
				}
			}
			getModel().setMainItems(responses);
			
			return result;
		}

		@Override
		protected void onPostExecute(String result) {
			progressBar.cancel();
			if (result.equals(OK)) {
				populateTemperatureList();
			} else {
				Toast.makeText(getApplicationContext(),
						R.string.activity_main_error_mesagge, Toast.LENGTH_LONG)
						.show();
			}
		}
	}
}
