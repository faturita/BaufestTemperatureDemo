package ar.com.baufest.temperature.application;

import android.app.Application;

public class BaufestTemperatureApplication extends Application {

	// Model class singleton
	private static Model model = null;

	@Override
	public void onCreate() {
		super.onCreate();
		
		getModel().init();
	}
	
	public static Model getModel() {
    	if (model == null)
    		model = new Model();
    	return model;
    }    
}
