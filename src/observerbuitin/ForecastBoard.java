package observerbuitin;

import java.util.Observable;

public class ForecastBoard implements java.util.Observer {

	Observable observable;

	/**
	 * 在创建观察者 时 传入需要观察的主题
	 * 
	 * @param observable
	 */
	public ForecastBoard(Observable observable) {
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
			forecastByData(weatherData.getTemperature(),
					weatherData.getHumidity());

		}
	}

	public void forecastByData(int t, int h) {
		System.out.println("预告板块：");
		if (t > 30 && h > 80) {
			System.out.println("温度炎热，湿度较高，未来几天可能会下雨哦！\n");
		}
		else {
			System.out.println("温度小于30，湿度适宜，明天天气应该不错！\n");
		}
	}

}
