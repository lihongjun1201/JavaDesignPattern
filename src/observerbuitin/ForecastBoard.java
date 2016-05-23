package observerbuitin;

import java.util.Observable;

public class ForecastBoard implements java.util.Observer {

	Observable observable;

	/**
	 * �ڴ����۲��� ʱ ������Ҫ�۲������
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

			// �۲���pull�������ݣ�����ȫ��
			forecastByData(weatherData.getTemperature(),
					weatherData.getHumidity());

		}
	}

	public void forecastByData(int t, int h) {
		System.out.println("Ԥ���飺");
		if (t > 30 && h > 80) {
			System.out.println("�¶����ȣ�ʪ�Ƚϸߣ�δ��������ܻ�����Ŷ��\n");
		}
		else {
			System.out.println("�¶�С��30��ʪ�����ˣ���������Ӧ�ò���\n");
		}
	}

}
