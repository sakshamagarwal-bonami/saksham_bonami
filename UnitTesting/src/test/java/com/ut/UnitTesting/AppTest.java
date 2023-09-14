package com.ut.UnitTesting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.sql.init.dependency.AbstractBeansOfTypeDatabaseInitializerDetector;
import org.springframework.boot.test.context.SpringBootTest;

import junit.framework.TestCase;
@SpringBootTest
class AppTest extends TestCase
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private Calculator c=new Calculator();
	
	
	@Test
	public void TestSum() {
		int expected=15;
		int actual=c.sum(12, 3);
		assertThat(actual).isEqualTo(expected);
		
	}
	@Test
	public void TestProduct() {
		int ex=18;
		int ac=c.product(2, 8);
		assertThat(ac).isEqualTo(ex);
	}
}
