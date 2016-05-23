package observerbuitin;

import java.util.Observable;

import observerpattern.Subject;

public class CurrentBoard implements java.util.Observer {

	Observable observable;

	/**
	 * �ڴ����۲��� ʱ ������Ҫ�۲������
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

			// �۲���pull�������ݣ�����ȫ��
			showWeatherData(weatherData.getTemperature(),
					weatherData.getHumidity());

		}
	}

	public void showWeatherData(int t, int h) {
		System.out.println("���ݰ�飺");
		System.out.println("�¶ȣ�" + t);
		System.out.println("ʪ�ȣ�" + h + "\n");
	}

}
