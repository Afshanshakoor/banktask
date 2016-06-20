package Bankpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class banktest {
	bank bb=new bank();

	@Test
	public void test() {
		
		String res=bb.accountclass;
		assertEquals(res,"Acoountclass");
		
		
	}

}
