package spring.di.hello;

public class EngHello implements Hello {
	
	public String sayHello(String name){
		System.out.println("hello");
		System.out.println("김성환 변경");
		System.out.println("1234");
		System.out.println("권효균 변경");
		return "Hello! "+name;
	}

}
