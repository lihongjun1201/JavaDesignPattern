package observerpattern;


public interface Observer {
	
	//订阅
	public void lookSubject(Subject s);
	
	//取消
	public void unlookSubject(Subject s);
	
	//更新
	public void update(WeatherData data);
}






