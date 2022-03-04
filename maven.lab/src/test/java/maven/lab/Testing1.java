package maven.lab;


import static org.junit.Assert.*;

import org.junit.Test;

import junittest.Testing1;

public class Testing1 {

	@Test
	public void test() {
		Testing obj = new Testing();
		assertEquals(18,obj.sum(8,10));
	}

}
