package observerpattern;

public class TestDemo {

	public static void main(String[] args) {
		
		//创建天气主题
		WeatherStation weatherStation = new WeatherStation(new WeatherData(28, 70, false));
		
		//创建观察者
		CurrentBoard currentBord = new CurrentBoard();
		ForecastBoard forecastBord = new ForecastBoard();
		
		//观察者订阅主题
		currentBord.lookSubject(weatherStation);
		forecastBord.lookSubject(weatherStation);
		
		//主题变化
		weatherStation.changeContent(30,80,true);
		
		//通知所有观察者
		weatherStation.notifyObservers();
		
		System.out.println("**********************************\n");
		//观察者取消主题
		//天气预报不准，不看了！
		forecastBord.unlookSubject(weatherStation);
		
		weatherStation.changeContent(16,40,false);
		weatherStation.notifyObservers();
		
	}

}
