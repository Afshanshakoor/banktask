package Bankpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class checkingaccounttest {

	@Test
	public void test() {
		checkingaccount ca=new checkingaccount();
		boolean res=ca.withdraw(2.14);
		assertEquals(res,false);
		
	}

}
