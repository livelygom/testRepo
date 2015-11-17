package spring.di.hello.service;

import spring.di.hello.*;

public class GreetingService {
	private Hello hello;
	
	public GreetingService(Hello hello){
		this.hello = hello;
	}
	public void printGreeting(String name){
		System.out.println(hello.sayHello(name));
	}
}
