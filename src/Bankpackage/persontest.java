package Bankpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class persontest {

	@Test
	public void test() {
		person pp=new person();
		String name=pp.getName();
		assertEquals("Afshan",name);
	}

}
