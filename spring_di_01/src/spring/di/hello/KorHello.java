package spring.di.hello;

public class KorHello implements Hello {

		/* (non-Javadoc)
		 * @see spring.di.hello.Hello#sayHello(java.lang.String)
		 */
		@Override
		public String sayHello(String name){
			return "안녕하세요. "+name+"님";
		}
}
