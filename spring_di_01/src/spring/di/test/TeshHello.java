package spring.di.test;

import org.springframework.context.*;
import org.springframework.context.support.*;

import spring.di.hello.*;
import spring.di.hello.service.*;

public class TeshHello {

	public static void main(String[] args){
		String name = "김철수";
		/*
		KorHello hello = new KorHello();
		String geeting = hello.sayHello(name);
		System.out.println(geeting);
		*/
		
		//TeshHello KorHello를 사용한다. -> 의존한다.
		//String Container로 부터 KorHello객체를 주입받기.(요청)
		//1. Spring Container 객체 생성. - Spring 설정파일의 위치를 알려준다.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		GreetingService service = (GreetingService)context.getBean("greetingService");
		service.printGreeting(name);
		
		//2. 객체 주입받기 - getBean("bean 식별값") : Object
		/*
		Hello hello = (Hello)context.getBean("helloKor");
		String greeting = hello.sayHello(name);
		System.out.println(greeting);
		
		Hello enhello = (Hello)context.getBean("helloEng");
		String greeting2 = enhello.sayHello(name);
		System.out.println(greeting2);
		*/
	}
}
