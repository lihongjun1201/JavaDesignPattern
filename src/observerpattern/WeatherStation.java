package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	WeatherData weatherData;

	boolean isDataChanged = false;

	List<Observer> diffBoards;

	public WeatherStation(WeatherData data) {
		super();
		weatherData = data;
		diffBoards = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer board) {
		// TODO Auto-generated method stub
		diffBoards.add(board);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		diffBoards.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

		if (isDataChanged == true) {
			for (Observer observer : diffBoards) {
				observer.update(weatherData);
			}

			isDataChanged = false;
		}

	}

	public void changeContent(int wd, int sd, boolean hasRain) {
		weatherData.setWendu(wd);
		weatherData.setShidu(sd);
		weatherData.setHasRain(hasRain);

		setChanged();
		notifyObservers();
	}

	public void setChanged() {
		isDataChanged = true;
	}

	public List<Observer> getDiffBoards() {
		return diffBoards;
	}

	public void setDiffBoards(List<Observer> diffBoards) {
		this.diffBoards = diffBoards;
	}

}
