package com.spring.core.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortuneArray = {"Ignore others comments...", "Be Happy Always..","Make Others Happy !!"};
	Random randomNumber = new Random();
	@Override
	public String getDailyFortune() {
		int index = randomNumber.nextInt(fortuneArray.length); 
		return fortuneArray[index];
	}

}
