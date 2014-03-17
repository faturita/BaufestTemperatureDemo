package ar.com.baufest.temperature.activities;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	protected abstract void handleControls();

	protected abstract void initView();
	
	protected String TAG() {
		return getClass().getName();
	}
}
