package com.multipledb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jayway.jsonpath.internal.function.numeric.Sum;

@SpringBootTest
class UnitTest1ApplicationTests {
	
	Calculator c=new Calculator();
	@Test
	void contextLoads() {
	}
	
	@Test
	void Testsum() {
		int expected=6;
		int actual=c.sum(2,4);
		assertThat(actual).isEqualTo(expected);
	}

}
