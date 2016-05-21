package observerpattern;

class WeatherData {
	private int wendu;
	private int shidu;
	private boolean hasRain;
	
	public WeatherData(int wendu, int shidu, boolean hasRain) {
		super();
		this.wendu = wendu;
		this.shidu = shidu;
		this.hasRain = hasRain;
	}

	public int getWendu() {
		return wendu;
	}

	public void setWendu(int wendu) {
		this.wendu = wendu;
	}

	public int getShidu() {
		return shidu;
	}

	public void setShidu(int shidu) {
		this.shidu = shidu;
	}

	public boolean isHasRain() {
		return hasRain;
	}
	

	public void setHasRain(boolean hasRain) {
		this.hasRain = hasRain;
	}
	
	
}