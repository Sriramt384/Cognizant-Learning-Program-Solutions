package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindArea {

	@Test
	public void test() {
		JUnitTesting obj=new JUnitTesting();
		int a=obj.area(4);
		System.out.println(a);
		assertEquals(48,a);
	}

}
