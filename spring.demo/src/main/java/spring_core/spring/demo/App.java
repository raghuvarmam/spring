package spring_core.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Movie m=(Movie) context.getBean("movie");
		System.out.println("movie details are "+m);
		
		ArithmeticOperations object= (ArithmeticOperations) context.getBean("spring1");
		int result=object.add();
		int result2= object.sub();
		System.out.println( " sum is "+ result +" , subraction is "+result2);

	}
}
