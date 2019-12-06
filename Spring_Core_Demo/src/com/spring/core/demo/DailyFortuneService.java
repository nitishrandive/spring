package com.spring.core.demo;

public class DailyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is Your Busy Day !!";
	}

}
