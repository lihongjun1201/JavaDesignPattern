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
		System.out.println("ForecastBoard--最新预测：");
		if (data.isHasRain()) {
			System.out.println("明天可能会下雨哦~");
		}
		else {
			System.out.println("明天应该是美好的晴天！");
		}
		
		//showData();
	}
	
}