package com.modulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ModuloServiceTest {

	@Autowired
	 IModuloService service;
	//This is for testing
	@Test
//	@Order(1)
	void testCalculateFizz() {
		String str = service.calculateFizzOrBuzz(9);
		System.out.println("Out put is : "+str);
		assertEquals("Fizz", str);
		//Assert.assertEquals("Buzz", str);
	}
	
	@Test
//	@Order(2)
	void testCalculateBuzz() {
		String str = service.calculateFizzOrBuzz(10);
		System.out.println("Out put is : "+str);
		assertEquals("Buzz", str);
		//Assert.assertEquals("Buzz", str);
	}
	
	@Test
//	@Order(2)
	void testCalculateBuzzNegative() {
		String str = service.calculateFizzOrBuzz(-10);
		System.out.println("Out put is : "+str);
		assertEquals("Buzz", str);
		//Assert.assertEquals("Buzz", str);
	}
	@Test 
//	@Order(3)
	void testCalculateFizzAndBuzz() {
		String str = service.calculateFizzOrBuzz(15);
		System.out.println("Out put is : "+str);
		assertEquals("Fizz Buzz", str);
		//Assert.assertEquals("Buzz", str);
	}
	
	@Test 
//	@Order(4)
	void testCalculateNotFizzNorBuzz() {
		String str = service.calculateFizzOrBuzz(14);
		System.out.println("Out put is : "+str);
		assertEquals("Not Fizz Nor Buzz", str);
		//Assert.assertEquals("Buzz", str);
	}

}
