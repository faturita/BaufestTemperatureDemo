package ar.com.baufest.temperature.application;

import java.util.Arrays;
import java.util.List;

public interface Constants {		
	final static String CONDITIONS_URL = "http://api.wunderground.com/api/ee5751081ea2386e/conditions/q/Argentina/%s.json";

	final static List<String> CITIES = Arrays.asList("Ushuaia", "Jujuy",
															 "Cordoba",
															 "Bariloche",
															 "Rosario");
	
	final static String OK = "OK";
	final static String ERROR = "ERROR";
}
