package spring.di.hello;

public class EngHello implements Hello {
	
	public String sayHello(String name){
		System.out.println("김성환 변경");
		return "Hello! "+name;
	}

}
