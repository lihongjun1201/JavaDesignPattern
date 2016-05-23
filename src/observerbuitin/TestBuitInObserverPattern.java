package observerbuitin;

import java.util.Observable;
import java.util.Observer;

public class TestBuitInObserverPattern {

	public static void main(String[] args) {
		
		WeatherData subjectWeatherData = new WeatherData();
		
		Observer observerA = new CurrentBoard(subjectWeatherData);
		Observer observerB = new ForecastBoard(subjectWeatherData);
		
		//java 内置的Observer 是后添加的数组先调用update方法（从后往前遍历）
		subjectWeatherData.setData(30, 85, 40);

		
	}
	
}
