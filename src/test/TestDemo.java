package test;

import singletonpattern.SingletonLazyLoad;

public class TestDemo {

	public static void main(String[] args) {
		
		SingletonLazyLoad sMyInstace = SingletonLazyLoad.getInstance();
		System.out.println(sMyInstace);
		
		
		SingletonLazyLoad sOtherPlaceInstace = SingletonLazyLoad.getInstance();
		System.out.println(sOtherPlaceInstace);
	}

}
