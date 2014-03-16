package ar.com.baufest.temperature.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import ar.com.baufest.temperature.R;

public class SplashActivity extends Activity {

	private Handler handler;
	private Thread thread;

	private static final int SPLASH_SCREEN_TIME_IN_MILLIS = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		getActionBar().hide();
		handler = new Handler();
	}

	@Override
	protected void onResume() {
		super.onResume();
		thread = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(SPLASH_SCREEN_TIME_IN_MILLIS);
					handler.post(new Runnable() {
						public void run() {
							goToNextScreen();
						}
					});
				} catch (InterruptedException e) {

				}
			}
		};
		thread.start();
	}

	protected void goToNextScreen() {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
