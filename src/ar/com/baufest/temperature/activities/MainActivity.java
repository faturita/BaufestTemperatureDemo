package ar.com.baufest.temperature.activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import ar.com.baufest.temperature.entities.GeneralResponse;
import ar.com.baufest.temperature.ws.RestWebService;

import com.google.gson.Gson;

public class MainActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
				"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
				"Linux", "OS/2" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);*/
		
		new ConditionsService().execute();
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}

	public void handleControls() {
		// TODO Auto-generated method stub

	}

	public void initScreen() {
		// TODO Auto-generated method stub
	}
}

class ConditionsService extends AsyncTask<String, Integer, String> {

	@Override
	protected void onPreExecute() {

	}

	@Override
	protected String doInBackground(String... params) {
		final List<String> cities = Arrays.asList("Ushuaia");//, "Jujuy", "Cordoba", "Bariloche", "Rosario"); 			
		final String url = "http://api.wunderground.com/api/ee5751081ea2386e/conditions/q/Argentina/%s.json";
		final List<GeneralResponse> responses = new ArrayList<GeneralResponse>();
		final Gson gson = new Gson();		
		
		for (final String city : cities) {
			String jsonResponse = null;
			try {
				jsonResponse = RestWebService.callRestfulWebService(String.format(url, city));
				final GeneralResponse generalResponse = gson.fromJson(jsonResponse, GeneralResponse.class);
				responses.add(generalResponse);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	protected void onPostExecute(String result) {

	}

}
