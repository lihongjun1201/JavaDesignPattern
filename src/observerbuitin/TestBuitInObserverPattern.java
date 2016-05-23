package observerbuitin;

import java.util.Observable;
import java.util.Observer;

public class TestBuitInObserverPattern {

	public static void main(String[] args) {
		
		WeatherData subjectWeatherData = new WeatherData();
		
		Observer observerA = new CurrentBoard(subjectWeatherData);
		Observer observerB = new ForecastBoard(subjectWeatherData);
		
		//java ���õ�Observer �Ǻ���ӵ������ȵ���update�������Ӻ���ǰ������
		subjectWeatherData.setData(30, 85, 40);

		
	}
	
}
