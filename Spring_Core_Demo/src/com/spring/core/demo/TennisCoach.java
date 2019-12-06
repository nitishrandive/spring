package com.spring.core.demo;

public class TennisCoach implements Coach {

	// Fortune Service
	private FortuneService fortuneService;
	private FortuneService randomFortuneService;

	// using Constructor Injection

	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
		System.out.println("FootBallCoach : Inside Constructor Method - TennisCoach ");
	}

	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("FootBallCoach : Inside Constructor Method - SetRandomFortuneService ");
		this.randomFortuneService = theFortuneService;
	}

	@Override
	public String getDailyAdvice() {
		// TODO Auto-generated method stub
		return "Play Tennis for 60 mins,Daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();

	}
	@Override
	public String getRandomFortune()
	{
	return randomFortuneService.getDailyFortune();
	}
}
