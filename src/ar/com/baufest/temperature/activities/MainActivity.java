package ar.com.baufest.temperature.activities;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
				"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
				"Linux", "OS/2" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void onPostExecute(String result) {

	}

}
