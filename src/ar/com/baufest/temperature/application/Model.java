package ar.com.baufest.temperature.application;

import java.util.ArrayList;
import java.util.List;

import ar.com.baufest.temperature.entities.MainItem;

public class Model {

	private List<MainItem> mainItems;

	public List<MainItem> getMainItems() {
		return mainItems;
	}

	public void setMainItems(List<MainItem> mainItems) {
		this.mainItems = mainItems;
	}

	private MainItem currentMainItem;

	public MainItem getCurrentMainItem() {
		return currentMainItem;
	}

	public void setCurrentMainItem(MainItem currentMainItem) {
		this.currentMainItem = currentMainItem;
	}

	public void init() {
		mainItems = new ArrayList<MainItem>();
		currentMainItem = null;
	}
}
