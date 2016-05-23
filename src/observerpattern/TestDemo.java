package observerpattern;

public class TestDemo {

	public static void main(String[] args) {
		
		//������������
		WeatherStation weatherStation = new WeatherStation(new WeatherData(28, 70, false));
		
		//�����۲���
		CurrentBoard currentBord = new CurrentBoard();
		ForecastBoard forecastBord = new ForecastBoard();
		
		//�۲��߶�������
		currentBord.lookSubject(weatherStation);
		forecastBord.lookSubject(weatherStation);
		
		//ֻҪ���ⷢ���˱仯���ͻ��Զ�֪ͨ���й۲���
		weatherStation.changeContent(30,80,true);
//		weatherStation.setChanged();
		

		
		System.out.println("**********************************\n");
		//�۲���ȡ������
		//����Ԥ����׼�������ˣ�
		forecastBord.unlookSubject(weatherStation);
		
		weatherStation.changeContent(16,40,false);
//		weatherStation.setChanged();
		
	}

}
