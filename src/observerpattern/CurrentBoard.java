package observerpattern;

class CurrentBoard implements Observer {
	
	Subject subject; 
	
	@Override
	public void lookSubject(Subject s) {
		subject = s;
		s.addObserver(this);
	}

	@Override
	public void unlookSubject(Subject s) {
		// TODO Auto-generated method stub
		subject = null;
		s.removeObserver(this);
	}

	@Override
	public void update(WeatherData data) {
		// TODO Auto-generated method stub
		//获取data ，并输出（ 处理具体业务逻辑）
		System.out.println("CurrentBoard--最新天气数据出炉： " );
		System.out.println("当前温度：" + data.getWendu() + "°c \n 空气湿度：" + data.getShidu() + "% \n" );
		
	}
	
}