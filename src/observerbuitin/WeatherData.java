package observerbuitin;

import java.util.Observable;

import sun.security.ssl.SSLContextImpl.TLS10Context;

public class WeatherData extends Observable {

	private int temperature; // 温度
	private int humidity; // 湿度
	private int pressure; // 气压

	public WeatherData() {
		// TODO Auto-generated constructor stub
		// 不必自己创建数据结构存放观察者了
	}

	public void setData(int t, int h, int p) {
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		
		dataChanged();
	}

	public void dataChanged() {
		setChanged();
		notifyObservers();
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

}
