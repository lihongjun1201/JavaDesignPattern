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
		//��ȡdata ��������� �������ҵ���߼���
		System.out.println("CurrentBoard--�����������ݳ�¯�� " );
		System.out.println("��ǰ�¶ȣ�" + data.getWendu() + "��c \n ����ʪ�ȣ�" + data.getShidu() + "% \n" );
		
	}
	
}