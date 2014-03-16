package ar.com.baufest.temperature.adapters;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ar.com.baufest.temperature.R;
import ar.com.baufest.temperature.activities.MainActivity;
import ar.com.baufest.temperature.entities.MainItem;

public class MainAdapter extends ArrayAdapter<MainItem> {
	Context context = null;
	MainActivity activity = null;
	List<MainItem> data = null;
	int _selectedIndex = -1;

	public MainAdapter(Context context, List<MainItem> data,
			MainActivity activity) {
		super(context, R.layout.list_main_row, data);
		this.context = context;
		this.data = data;
		this.activity = activity;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		MainItem listItem = data.get(position);

		MainHolder mainHolder = null;
		View mainRow = convertView;

		if (mainRow == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			mainRow = inflater.inflate(R.layout.list_main_row, parent, false);

			mainHolder = new MainHolder();
			mainHolder.titleRowMain = (TextView) mainRow
					.findViewById(R.id.titleRowMain);
			mainHolder.temperatureRowMain = (TextView) mainRow
					.findViewById(R.id.temperatureRowMain);
			mainHolder.temperatureHighLow = (TextView) mainRow
					.findViewById(R.id.temperatureHighLow);

			mainRow.setTag(mainHolder);
		} else
			mainHolder = (MainHolder) mainRow.getTag();

		mainHolder.titleRowMain.setText(listItem.getFullCityDescription());
		mainHolder.temperatureRowMain.setText(listItem.getCelciusFormat());
		mainHolder.temperatureHighLow.setText(listItem.getHighLow());

		mainRow.setOnClickListener(new MainAdapterOnClickListener(this,
				position, listItem));

		return mainRow;
	}

	static class MainHolder {
		TextView titleRowMain;
		TextView temperatureRowMain;
		TextView temperatureHighLow;
	}

	class MainAdapterOnClickListener implements OnClickListener {
		private final MainAdapter adapter;
		private final int index;
		private final MainItem item;

		public MainAdapterOnClickListener(MainAdapter adapter, int index,
				MainItem item) {
			this.adapter = adapter;
			this.index = index;
			this.item = item;
		}

		@Override
		public void onClick(View v) {
			if (index != -1 && adapter != null) {
				adapter._selectedIndex = index;
				notifyDataSetChanged();

				activity.btnDashboardClick(item);
			}
		}
	}
}
