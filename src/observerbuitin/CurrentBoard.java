package observerbuitin;

import java.util.Observable;

import observerpattern.Subject;

public class CurrentBoard implements java.util.Observer {

	Observable observable;

	/**
	 * 在创建观察者 时 传入需要观察的主题
	 * 
	 * @param observable
	 */
	public CurrentBoard(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;

			// 观察者pull部分数据，并非全部
			showWeatherData(weatherData.getTemperature(),
					weatherData.getHumidity());

		}
	}

	public void showWeatherData(int t, int h) {
		System.out.println("数据板块：");
		System.out.println("温度：" + t);
		System.out.println("湿度：" + h + "\n");
	}

}
