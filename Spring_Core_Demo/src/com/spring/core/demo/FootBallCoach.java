package com.spring.core.demo;

public class FootBallCoach implements Coach {
	private FortuneService fortuneService;

	// Setter Injection Method
	public void setFortuneService(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
		System.out.println("FootBallCoach : Inside Setter Method - setFortuneService ");
	}

	@Override
	public String getDailyAdvice() {

		return "Run for Mins Daily !! ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
