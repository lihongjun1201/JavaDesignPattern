package observerpattern;

class ForecastBoard implements Observer {

	@Override
	public void lookSubject(Subject s) {
		s.addObserver(this);
		
	}

	@Override
	public void unlookSubject(Subject s) {
		// TODO Auto-generated method stub
		s.removeObserver(this);
	}

	@Override
	public void update(WeatherData data) {
		System.out.println("ForecastBoard--����Ԥ�⣺");
		if (data.isHasRain()) {
			System.out.println("������ܻ�����Ŷ~");
		}
		else {
			System.out.println("����Ӧ�������õ����죡");
		}
		
		//showData();
	}
	
}