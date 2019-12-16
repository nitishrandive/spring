package com.spring.core.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDemo {

	public static void main(String[] args) {
		
		
		//Normal Java Code
		
		//CricketCoach cricketCoach = new CricketCoach();
		//System.out.println(cricketCoach.getCoachingAdvice());
		
		// Create a application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		// retrive bean
		CricketCoach cricketCoach=  (CricketCoach) context.getBean("cricketCoach",CricketCoach.class);
		Coach footBallCoach = context.getBean("footBallCoach",Coach.class);
		Coach tennisCoach  =  context.getBean("tennisCoach",Coach.class);
		System.out.println("Test from Home 2 + Github Desktop");
		// do some operations
		System.out.println(cricketCoach.getCoachingAdvice());
		System.out.println(footBallCoach.getDailyAdvice());
		System.out.println(tennisCoach.getDailyAdvice());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(footBallCoach.getDailyFortune());
		System.out.println(tennisCoach.getRandomFortune()); // Setter Injection 
		
		// close context
		context.close();
	}

}
