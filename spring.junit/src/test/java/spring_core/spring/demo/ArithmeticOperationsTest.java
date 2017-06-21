package spring_core.spring.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticOperationsTest {

	@Test
	public void test() {
		ArithmeticOperations at= new ArithmeticOperations();
		int result=at.add(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void subTest(){
		ArithmeticOperations st= new ArithmeticOperations();
		int result= st.sub(8, 7);
		assertEquals(1, result);
		
	}

}
