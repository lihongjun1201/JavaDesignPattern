package observerpattern;


public interface Observer {
	
	//����
	public void lookSubject(Subject s);
	
	//ȡ��
	public void unlookSubject(Subject s);
	
	//����
	public void update(WeatherData data);
}






